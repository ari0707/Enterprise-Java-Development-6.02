package com.ironhack.studentcatalogservice.controller;

import com.ironhack.studentcatalogservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CatalogController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/catalog/student/{courseCode}")
    @ResponseStatus(HttpStatus.OK)
    public Catalog getStudentCatalog(@PathVariable Integer courseCode){


        Course course = restTemplate.getForObject("http://grades-data-service/api/course/" + courseCode, Course.class);

        CourseGrade grades = restTemplate.getForObject("http://grades-data-service/api/course/" + courseCode + "/grades", CourseGrade.class);


        Catalog catalog = new Catalog();
        catalog.setCourseName(course.getCourseName());
        List<StudentGrade> studentGrades = new ArrayList<>();

        for(Grade grade : grades.getGrades()){
            Student student = restTemplate.getForObject("http://student-info-service/api/students/"  + grade.getStudentId(), Student.class);
            studentGrades.add(new StudentGrade(student.getStudentName(), student.getStudentAge(), grade));
        }

        catalog.setStudentGrades(studentGrades);
        return catalog;

    }

}
