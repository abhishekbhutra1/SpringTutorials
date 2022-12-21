package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p = (Person)ap.getBean("person");
		System.out.println(p.toString());
		
		Addition a = (Addition)ap.getBean("add");
		a.doSum();
	}
}
