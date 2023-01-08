package com.ironhack.studentcatalogservice.model;


public class Student {

    private Integer id;
    private String studentName;
    private Integer studentAge;

    public Student() {
    }

    public Student(Integer id, String studentName, Integer studentAge) {
        this.id = id;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
