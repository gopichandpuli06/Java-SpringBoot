package com.spring_rest_api.spring_rest_api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_rest_api.spring_rest_api.binding.Course;
import com.spring_rest_api.spring_rest_api.service.CourseService;

@RestController
public class CourseRestController {
	
	@Autowired
	private CourseService courseService; //Ioc will find the implementation for this service
	
	//insert the data
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid){
		Course course = courseService.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> courses = courseService.getAllCourse();
		return new ResponseEntity<>(courses, HttpStatus.OK);
	}
	
	
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
		String status = courseService.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
