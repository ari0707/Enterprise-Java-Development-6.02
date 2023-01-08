package com.ironhack.gradesdataservice.repository;

import com.ironhack.gradesdataservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    //Optional<Course> findById(Integer id);

}
