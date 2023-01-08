package com.ironhack.gradesdataservice.service.impl;

import com.ironhack.gradesdataservice.model.Course;
import com.ironhack.gradesdataservice.model.Grade;
import com.ironhack.gradesdataservice.repository.CourseRepository;
import com.ironhack.gradesdataservice.service.interfaces.CourseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CourseServiceInterface {

    @Autowired
    CourseRepository courseRepository;


    public Course getCourseById(Integer courseCode) {
        Optional<Course> courseOptional = courseRepository.findById(courseCode);
        if(courseOptional.isPresent()){
            Course course = courseOptional.get();
            return course;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course ID: " + courseCode + " not found");
        }
    }


    public List<Grade> getGradesByCourseCode(Integer courseCode) {
        Optional<Course> courseOptional = courseRepository.findById(courseCode);
        if(courseOptional.isPresent()){
            List<Grade> grades = courseOptional.get().getGrades();
            return grades;
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Course ID: " + courseCode + " not found");
        }
    }

}
