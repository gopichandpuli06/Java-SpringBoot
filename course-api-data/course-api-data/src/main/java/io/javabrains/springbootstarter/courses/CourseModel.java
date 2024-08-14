package io.javabrains.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;

import io.javabrains.springbootstarter.topiccontroller.topicModel;

@Entity  //JPA entity to connect with database
public class CourseModel {
	@Id //primary key id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private topicModel topic;
	
	public topicModel getTopic() {
		return topic;
	}
	public void setTopic(topicModel topic) {
		this.topic = topic;
	}
	public CourseModel() {
		
	}
	public CourseModel(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new topicModel(topicId, "", "");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
