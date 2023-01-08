package com.ironhack.gradesdataservice.controller;

import com.ironhack.gradesdataservice.model.Course;
import com.ironhack.gradesdataservice.service.impl.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Course getCourseById(@PathVariable(name="id") Integer id){
        return courseService.getCourseById(id);
    }

    @GetMapping("/courses/{courseId}/grades")
    @ResponseStatus(HttpStatus.OK)
    public Course getGradesByCourseId(@PathVariable (name = "courseId") Integer id){
        return courseService.getCourseById(id);
    }
}
