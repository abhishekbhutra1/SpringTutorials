package com.springcore.cipractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/cipractice/ciPracticeConfig.xml");
		Student s = (Student) ap.getBean("stu");
		System.out.println(s);
	}
}
