package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

//spring business service , typically singleton 
// created at system startup and inject it whenever requested

@Service // Stereotype annotation
public class TopicService {

	// sending same list so sending copy of topics
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Descrption"),
					new Topic("Spring1", "Spring Framework123", "Spring Description1"),
					new Topic("Spring2", "Spring Framework2", "Spring Description2")));

	public List<Topic> getAllTopics() {

		return topics;

	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {

		topics.add(topic);

	}

	public void updateTopic(Topic topic, String id) {

		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equalsIgnoreCase(id))
				topics.set(i, topic);

		}
	}

	public void deleteTopic(String id) {

		topics.removeIf(t -> t.getId().equalsIgnoreCase(id));

	}

}
