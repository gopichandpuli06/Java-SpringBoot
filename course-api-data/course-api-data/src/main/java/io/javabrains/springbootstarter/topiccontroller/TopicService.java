package io.javabrains.springbootstarter.topiccontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	//hard coded list
	/*private List<topicModel> topics = new ArrayList<>(Arrays.asList(
			new topicModel("Spring", "Springboot", "Spring boot description"),
			new topicModel("Swift", "Xcode UIKit", "Swift code description"),
			new topicModel("JavaScript", "Angular", "Angular and other web technologies supported description")
			));*/

	public List<topicModel> topicAll() {
		//return topics;
		//JPA database finding and getting all the list of topics in the database
		List<topicModel> topics = new ArrayList<>();
		topicRepository.findAll().
		forEach(topics::add);
		return topics;
	}
	
	public Optional<topicModel> getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); //lambda expression
		return topicRepository.findById(id);
	}

	public void addTopic(topicModel topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}
	
	//update the topic
	public void putTopic(String id, topicModel topic) {
		/*for(int i=0;i<topics.size(); i++) {
			topicModel t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}
}
