package com.shasu19p;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shasu19p.config.AppConfig;
import com.shasu19p.model.Employee;
import com.shasu19p.receiver.MessageReceiver;

public class MessageConsumerApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
		Employee employee = messageReceiver.receiveMessage();
		System.out.println("Message Received = " + employee);

		((AbstractApplicationContext) context).close();
	}

}
