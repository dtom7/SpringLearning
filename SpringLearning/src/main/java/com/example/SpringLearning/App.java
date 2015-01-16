package com.example.SpringLearning;

import java.util.List;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// create and configure beans
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		// retrieve configured instance
		
		CustomBean customBean = context.getBean("customBean", CustomBean.class);
		/*
		for(Entry<String, List<String>> mapEntry:customBean.getMap().entrySet()) {
			System.out.println(mapEntry.getKey() + " -- " + mapEntry.getValue());
		} */
		// System.out.println(customBean.createPrototypeBean().getMessage());
		
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person.s); 
		
		//PrototypeBean prototypeBean = context.getBean("prototypeBean", PrototypeBean.class);
		/*
		System.out.println(customBean.createPrototypeBean().getMessage());
		System.out.println("From customBean: " + customBean.getNewBean());
		
		CustomBeanFactory.NewBean newBean1 = (CustomBeanFactory.NewBean)context.getBean("newBean");
		System.out.println(newBean1);
		CustomBeanFactory newBean2 = (CustomBeanFactory)context.getBean("&newBean");
		System.out.println(newBean2);
		*/
	}
}
