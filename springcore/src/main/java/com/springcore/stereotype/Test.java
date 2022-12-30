package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = ap.getBean("Example",Student.class);
		System.out.println(student.toString());
		System.out.print(student.getPlaces());
	}
}

