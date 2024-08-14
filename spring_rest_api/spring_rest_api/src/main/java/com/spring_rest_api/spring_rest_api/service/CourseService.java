package com.spring_rest_api.spring_rest_api.service;

import com.spring_rest_api.spring_rest_api.binding.Course;
import java.util.List;

public interface CourseService {
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourse();
	
	public String deleteById(Integer cid);
}
