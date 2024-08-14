package io.javabrains.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//hard coded list
	/*private List<topicModel> topics = new ArrayList<>(Arrays.asList(
			new topicModel("Spring", "Springboot", "Spring boot description"),
			new topicModel("Swift", "Xcode UIKit", "Swift code description"),
			new topicModel("JavaScript", "Angular", "Angular and other web technologies supported description")
			));*/

	public List<CourseModel> courseAll(String topicId) {
		//return topics;
		//JPA database finding and getting all the list of topics in the database
		List<CourseModel> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).
		forEach(courses::add);
		return courses;
	}
	
	public Optional<CourseModel> getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); //lambda expression
		return courseRepository.findById(id);
	}

	public void addCourse(CourseModel course) {
		//topics.add(topic);
		courseRepository.save(course);
	}
	
	//update the course
	public void putCourse(CourseModel course) {
		/*for(int i=0;i<topics.size(); i++) {
			topicModel t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}
}
