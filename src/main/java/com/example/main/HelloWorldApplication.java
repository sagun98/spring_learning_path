package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;


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
		
		/*Creates memory leak issues using context.close
		which closes all the beans */
		//context.close();
		
		//Shuts down hook using JVM
		context.registerShutdownHook();
		
		//Using Dependent classes (Class Person -> Class Address)
		Address a = new Address();
		a.setStreet("402 FIlhiol ave");
		a.setCityState("Monroe, LA");
		System.out.println(a.toString());
		
		//Injecting a class
		System.out.println("\n\nUsing address injection\n");
		Address a2 = (Address)context.getBean("address");
		p2.setAddress(a2);
		System.out.println(p2.getAddress()+"\n");
		
	}
}
