package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

import ch.qos.logback.core.net.SyslogOutputStream;

// Library for linking xml bean and the main class
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("Helow world");
		System.out.println(SpringVersion.getVersion());
		System.out.println("\n");
		
		Person p =new Person();
		p.setFirstName("John");
		p.setLastName("Doe");
		p.setGender("others");
		System.out.println(p.getName());
		System.out.println(p.getGender());
		
		System.out.println("\n");
		
		//Setting up a bean for Inversion of Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person p2 = (Person)context.getBean("Person");
		p2.setFirstName("sagun");
		p2.setLastName("Maharjan");
		System.out.println(p2.getName());
		System.out.println(p2.getGender());
		context.close();
		
	}
}
