package io.javabrains.springbootstarter.topiccontroller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	//importing instance of service to make dependency injection
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<topicModel> topicAll(){
		/*return Arrays.asList(
				new topicModel("Spring", "Spring boot", "Spring boot description"),
				new topicModel("Swift", "Xcode UIKit", "Swift code description"),
				new topicModel("JavaScript", "Angular", "Angular and other web technologies supported description")
				);*/ // moved to serivce class
		
		return topicservice.topicAll();
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<topicModel> getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	//post method
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody topicModel topic) {
		topicservice.addTopic(topic);
	}
	
	//Put method for update
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void putTopic(@RequestBody topicModel topic, @PathVariable String id) {
		topicservice.putTopic(id, topic);
	}
	
	//Delete method
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicservice.deleteTopic(id);
	}
	
}
