package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.standalone.collections.Person;

public class Test {
	public static void main(String[] args){
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person1 = ap.getBean("person1",Person.class);
		Person person2 = ap.getBean("person2",Person.class);
		
		System.out.println(person1.toString());
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println(person1.getFeestructure().getClass().getName());
		
		System.out.println(person2.toString());
	}
}
