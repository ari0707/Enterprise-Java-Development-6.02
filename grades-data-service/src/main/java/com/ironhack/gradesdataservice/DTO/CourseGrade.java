package com.ironhack.gradesdataservice.DTO;


import com.ironhack.gradesdataservice.model.Grade;

import java.util.List;

public class CourseGrade {
    private Integer courseCode;

    private List<Grade> grades;


    public CourseGrade() {
    }

    public CourseGrade(Integer courseCode, List<Grade> grades) {
        this.courseCode = courseCode;
        this.grades = grades;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
        this.courseCode = courseCode;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
