package com.ironhack.gradesdataservice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {

    @Id
    private Integer courseCode;
    private String courseName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_grades",
            joinColumns = {@JoinColumn(name= "course_id")},
            inverseJoinColumns = {@JoinColumn(name= "grade_id")}
    )
    private List<Grade> grades;

    public Course() {
    }

    public Course(Integer courseCode, String courseName, List<Grade> grades) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.grades = grades;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
