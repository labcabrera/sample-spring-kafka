package com.lab.sample;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lab.sample.model.SampleMessage;
import com.lab.sample.services.MessagePublisher;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPublisher {

	@Autowired
	private MessagePublisher messagePublisher;

	@Test
	public void test() {
		messagePublisher.sendMessage(SampleMessage.builder().body("Dummy message 1").build());
		messagePublisher.sendMessage(SampleMessage.builder().body("Dummy message 2").build());
		messagePublisher.sendMessage(SampleMessage.builder().body("Dummy message 3").build());
		messagePublisher.sendMessage(SampleMessage.builder().body("Dummy message 4").build());
		messagePublisher.sendMessage(SampleMessage.builder().body("Dummy message 5").build());
	}

}
