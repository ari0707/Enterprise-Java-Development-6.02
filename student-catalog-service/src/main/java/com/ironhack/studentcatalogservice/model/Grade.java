package com.ironhack.studentcatalogservice.model;

public class Grade {
    private Integer gradeId;
    private String grade;
    private String studentId;

    public Grade() {
    }

    public Grade(Integer gradeId, String grade, String studentId) {
        this.gradeId = gradeId;
        this.grade = grade;
        this.studentId = studentId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
