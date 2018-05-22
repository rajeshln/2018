package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	// how to ask for service
	// create a private variable and ask to inject it
	// Declared dependency with @Autowired
	@Autowired
	private TopicService service;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return service.getAllTopics();
	}
	// {id} - tell the spring that this is variable portion 
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {

		return service.getTopic(id);
	}

	// @RequestMapping annotation has enum
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		// @RequestBody tell spring mvc to pick the JSON representation form request body
		service.addTopic(topic);
		
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.PUT , value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		service.updateTopic( topic ,  id);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		service.deleteTopic(id);
	}
	
	
}
