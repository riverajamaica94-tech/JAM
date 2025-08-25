package com.example.caltron.service;

import com.example.caltron.model.Student;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    public String classifyPerformance(Student student) {
        double writtenPercent = (double) student.getWrittenScoreObtained() / student.getWrittenScoreTotal();
        double performancePercent = (double) student.getPerformanceScoreObtained() / student.getPerformanceScoreTotal();
        double examPercent = (double) student.getExamScoreObtained() / student.getExamScoreTotal();

        double finalGrade = (writtenPercent * 0.3 + performancePercent * 0.5 + examPercent * 0.2) * 100;

        if (finalGrade >= 90) return "Excellent";
        else if (finalGrade >= 75) return "Good";
        else if (finalGrade >= 60) return "Moderate";
        else return "Poor";
    }

    public String getRecommendation(String performanceLevel) {
        return switch (performanceLevel) {
            case "Excellent" -> "Keep up the great work!";
            case "Good" -> "You're doing well. Focus more on challenging subjects.";
            case "Moderate" -> "You need to review your notes and ask for help when needed.";
            case "Poor" -> "Consider seeking help from a teacher or tutor and study regularly.";
            default -> "No recommendation available.";
        };
    }
}
