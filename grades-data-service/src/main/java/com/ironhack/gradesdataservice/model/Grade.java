package com.ironhack.gradesdataservice.model;

import jakarta.persistence.*;


@Entity
public class Grade {
    @Id
    private Integer Id;
    private String grade;
    private Integer studentId;

    public Grade() {
    }

    public Grade(Integer id, String grade, Integer studentId) {
        Id = id;
        this.grade = grade;
        this.studentId = studentId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
