package io.javabrains.springbootstarter.topiccontroller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //JPA entity to connect with database
public class topicModel {
	@Id //primary key id
	private String id;
	private String name;
	private String description;
	
	public topicModel() {
		
	}
	public topicModel(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
