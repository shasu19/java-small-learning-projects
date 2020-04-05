package com.shasu19p.main.receiver;

import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

	@Autowired
	JmsTemplate jmsTemplate;

	@Autowired // same bean configured in MessagingConfiguration file
	MessageConverter messageConverter;

	public String receiveMessage() {
		try {
			// Here we receive the message.
			Message message = jmsTemplate.receive();
			return (String) messageConverter.fromMessage(message);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
}
