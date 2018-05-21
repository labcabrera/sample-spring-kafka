package com.lab.sample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageListener {

	// TODO hardcoded
	@KafkaListener(topics = "test", groupId = "foo")
	public void listen(String message) {
		log.info("Received message: {}", message);
	}
}
