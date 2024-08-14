package com.spring_rest_api.spring_rest_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_rest_api.spring_rest_api.binding.Course;
import com.spring_rest_api.spring_rest_api.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course); //upsert operation (Insert and update) the record
		return "Success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById= courseRepo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete Success";
		}else {
			return "No Record Found";
		}
	}

}
