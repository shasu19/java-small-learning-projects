package com.shasu19p.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.shasu19p.model.Employee;

@Component
public class MessageSender {

	@Autowired
	JmsTemplate jmsTemplate;

	public void sendMessage(final Employee emp) {
		jmsTemplate.send((session) -> session.createObjectMessage(emp));
	}
}