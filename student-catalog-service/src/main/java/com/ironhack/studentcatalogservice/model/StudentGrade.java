package com.ironhack.studentcatalogservice.model;

public class StudentGrade {

    private String studentName;
    private Integer studentAge;
    private Grade grade;

    public StudentGrade() {
    }

    public StudentGrade(String studentName, Integer studentAge, Grade grade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
