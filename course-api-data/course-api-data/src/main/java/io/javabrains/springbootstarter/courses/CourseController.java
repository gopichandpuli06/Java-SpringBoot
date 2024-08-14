package io.javabrains.springbootstarter.courses;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topiccontroller.topicModel;

@RestController
public class CourseController {
	
	//importing instance of service to make dependency injection
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/topics/{id}/courses")
	public List<CourseModel> courseAll(@PathVariable String id){
		/*return Arrays.asList(
				new topicModel("Spring", "Spring boot", "Spring boot description"),
				new topicModel("Swift", "Xcode UIKit", "Swift code description"),
				new topicModel("JavaScript", "Angular", "Angular and other web technologies supported description")
				);*/ // moved to serivce class
		
		return courseservice.courseAll(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<CourseModel> getCourse(@PathVariable String id) {
		return courseservice.getCourse(id);
	}
	
	//post method
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody CourseModel course, @PathVariable String topicId) {
		course.setTopic(new topicModel(topicId, "", ""));
		courseservice.addCourse(course);
	}
	
	//Put method for update
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void putCourse(@RequestBody CourseModel course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new topicModel(topicId, "", ""));
		courseservice.putCourse(course);
	}
	
	//Delete method
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseservice.deleteCourse(id);
	}
	
}
