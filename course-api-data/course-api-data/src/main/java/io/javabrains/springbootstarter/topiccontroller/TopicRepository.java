package io.javabrains.springbootstarter.topiccontroller;

import org.springframework.data.repository.CrudRepository;

//JPA repository for database
public interface TopicRepository extends CrudRepository<topicModel, String>{

}
