package com.ironhack.gradesdataservice.service.interfaces;

import com.ironhack.gradesdataservice.model.Course;
import com.ironhack.gradesdataservice.model.Grade;

import java.util.List;

public interface CourseServiceInterface {

    Course getCourseById(Integer courseCode);
    List<Grade> getGradesByCourseCode(Integer courseCode) ;


}
