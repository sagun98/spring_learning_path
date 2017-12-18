package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

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
		System.out.println(p.getName());
		
		
		//Setting up a bean for Inversion of Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person p2 = (Person)context.getBean("Person");
		p2.setFirstName("sagun");
		p2.setLastName("Maharjan");
		System.out.println(p2.getName());
		context.close();
		
	}
}
