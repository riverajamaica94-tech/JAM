package com.example.caltron.service;

import com.example.caltron.model.GradeRequest;
import org.springframework.stereotype.Service;

@Service
public class WeightedAverageService {

  public double percent(double score, double total) {
    return total == 0 ? 0 : (score / total) * 100.0;
  }

  public double computeFinal(GradeRequest r) {
    double wwP = percent(r.wwScore, r.wwTotal);
    double ptP = percent(r.ptScore, r.ptTotal);
    double exP = percent(r.examScore, r.examTotal);

    double sum = r.wwWeight + r.ptWeight + r.examWeight;
    if (sum == 0) return 0;

    return (wwP * r.wwWeight + ptP * r.ptWeight + exP * r.examWeight) / sum;
  }

  public String classify(double grade) {
    if (grade < 75) return "Low";
    if (grade < 80) return "Moderately Low";
    if (grade < 85) return "Average";
    if (grade < 90) return "Moderately High";
    if (grade < 95) return "High";
    return "Extremely High";
  }
}
