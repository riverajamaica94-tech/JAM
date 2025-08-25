package com.example.caltron.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.AssertTrue;

public class GradeRequest {
    @PositiveOrZero public double wwScore;
    @Positive public double wwTotal;
    @PositiveOrZero public double ptScore;
    @Positive public double ptTotal;
    @PositiveOrZero public double examScore;
    @Positive public double examTotal;

    @Min(0) @Max(100) public double wwWeight;   // e.g., 25
    @Min(0) @Max(100) public double ptWeight;   // e.g., 50
    @Min(0) @Max(100) public double examWeight; // e.g., 25

    @AssertTrue(message = "Weights must add up to 100")
    private boolean isValidWeights() {
        return wwWeight + ptWeight + examWeight == 100;
    }
}
