package com.example.caltron.model;

public class Student {
    private String gradeLevel;
    private String subject;
    private int writtenScoreObtained;
    private int writtenScoreTotal;
    private int performanceScoreObtained;
    private int performanceScoreTotal;
    private int examScoreObtained;
    private int examScoreTotal;

    // Constructors
    public Student() {}

    public Student(String gradeLevel, String subject, int writtenScoreObtained, int writtenScoreTotal,
                   int performanceScoreObtained, int performanceScoreTotal, int examScoreObtained, int examScoreTotal) {
        this.gradeLevel = gradeLevel;
        this.subject = subject;
        this.writtenScoreObtained = writtenScoreObtained;
        this.writtenScoreTotal = writtenScoreTotal;
        this.performanceScoreObtained = performanceScoreObtained;
        this.performanceScoreTotal = performanceScoreTotal;
        this.examScoreObtained = examScoreObtained;
        this.examScoreTotal = examScoreTotal;
    }

    // Getters and setters
    public String getGradeLevel() { return gradeLevel; }
    public void setGradeLevel(String gradeLevel) { this.gradeLevel = gradeLevel; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getWrittenScoreObtained() { return writtenScoreObtained; }
    public void setWrittenScoreObtained(int writtenScoreObtained) { this.writtenScoreObtained = writtenScoreObtained; }

    public int getWrittenScoreTotal() { return writtenScoreTotal; }
    public void setWrittenScoreTotal(int writtenScoreTotal) { this.writtenScoreTotal = writtenScoreTotal; }

    public int getPerformanceScoreObtained() { return performanceScoreObtained; }
    public void setPerformanceScoreObtained(int performanceScoreObtained) { this.performanceScoreObtained = performanceScoreObtained; }

    public int getPerformanceScoreTotal() { return performanceScoreTotal; }
    public void setPerformanceScoreTotal(int performanceScoreTotal) { this.performanceScoreTotal = performanceScoreTotal; }

    public int getExamScoreObtained() { return examScoreObtained; }
    public void setExamScoreObtained(int examScoreObtained) { this.examScoreObtained = examScoreObtained; }

    public int getExamScoreTotal() { return examScoreTotal; }
    public void setExamScoreTotal(int examScoreTotal) { this.examScoreTotal = examScoreTotal; }
}