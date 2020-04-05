package com.shasu19p;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shasu19p.config.AppConfig;
import com.shasu19p.model.Employee;
import com.shasu19p.producer.MessageSender;

public class MessageProducerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageSender messageSender = context.getBean(MessageSender.class);

		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setName("Laptop");

		messageSender.sendMessage(emp);
		System.out.println("Message has been sent successfully...");

		((AbstractApplicationContext) context).close();
	}

}
