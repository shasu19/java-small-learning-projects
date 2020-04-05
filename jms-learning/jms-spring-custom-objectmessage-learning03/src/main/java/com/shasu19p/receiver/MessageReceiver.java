package com.shasu19p.receiver;

import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import com.shasu19p.model.Employee;

@Component
public class MessageReceiver {
	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	MessageConverter messageConverter;

	public Employee receiveMessage() {
		try {
			/*
			 * Here we receive the message.
			 */
			Message message = jmsTemplate.receive();
			return (Employee) messageConverter.fromMessage(message);
		} catch (Exception exe) {
			exe.printStackTrace();
		}

		return null;
	}
}