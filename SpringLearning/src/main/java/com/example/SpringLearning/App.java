package com.example.SpringLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		// retrieve configured instance
		Person person = context.getBean("person", Person.class);
		
		System.out.println(person);
	}
}
