package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp employee  = (Emp)ap.getBean("Employee1");
		System.out.println(employee.getName());
		System.out.println(employee.getAddresses());
		System.out.println(employee.getCourses());
		System.out.println(employee.getPhones());
		System.out.println(employee.getProperties());
	}
}
