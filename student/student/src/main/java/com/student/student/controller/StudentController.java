package com.student.student.controller;

import java.net.http.HttpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.student.entity.Student;
import com.student.student.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	public StudentRepo studentRepo;
	
	@PostMapping("/api/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		System.out.println(student);
		return new ResponseEntity<>(studentRepo.save(student),HttpStatus.CREATED);
	}
}
