package io.javabrains.springbootstarter.courses;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarter.topiccontroller.topicModel;

import java.util.List;


//JPA repository for database
public interface CourseRepository extends CrudRepository<CourseModel, String>{
	public List<CourseModel> findByTopicId(String topicId);
}
