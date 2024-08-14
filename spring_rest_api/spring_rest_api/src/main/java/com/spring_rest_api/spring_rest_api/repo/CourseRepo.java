package com.spring_rest_api.spring_rest_api.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_rest_api.spring_rest_api.binding.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Serializable>{

}
