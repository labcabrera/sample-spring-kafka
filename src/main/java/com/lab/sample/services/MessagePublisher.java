package com.lab.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.lab.sample.model.SampleMessage;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessagePublisher {

	@Value("${kafka.topics.demo.name}")
	private String topicName;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(SampleMessage message) {
		log.info("Sending message {}", message);
		kafkaTemplate.send(topicName, message.getSubject());
	}
}
