package com.SpringBootBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootBasicApplication.class, args);
		
		Student student = context.getBean(Student.class);// We can get the bean using the name, object.class.
		student.read();
		
		/*
		 * If we add the @Scope(value="prototype") in the corresponding object system will create new object every time it getting called.
		 * other wise it will singleton only one object for number of calls.
		 * Student student1 = context.getBean(Student.class); student1.read();
		 */
		System.out.println("Spring Boot Running Successfully....");
	}
}