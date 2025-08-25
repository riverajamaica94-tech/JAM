package com.example.caltron.service;

import com.example.caltron.model.GradeRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Service
public class RecommendationClient {

    private final WebClient http;

    public RecommendationClient(@Value("${ml.base-url:http://localhost:8000}") String baseUrl) {
        this.http = WebClient.builder().baseUrl(baseUrl).build();
    }

    @SuppressWarnings("unchecked")
    public List<String> getRecommendations(GradeRequest r, double finalWeighted, String category) {
        Map<String, Object> payload = Map.of(
                "ww_percent", percent(r.wwScore, r.wwTotal),
                "pt_percent", percent(r.ptScore, r.ptTotal),
                "exam_percent", percent(r.examScore, r.examTotal),
                "final_weighted", finalWeighted,
                "category", category
        );

        Mono<Map> resp = http.post()
                .uri("/recommend")
                .bodyValue(payload)
                .retrieve()
                .bodyToMono(Map.class);

        Map<String, Object> body = resp.block();
        return (List<String>) body.getOrDefault("recommendations", List.of());
    }

    private double percent(double score, double total) {
        return total == 0 ? 0 : (score / total) * 100.0;
    }
}
