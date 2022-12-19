package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A obj = (A)ap.getBean("aref");
		System.out.println(obj.toString());
		
		B temp = (B)ap.getBean("bref");
		System.out.println(temp.toString());
	}
}
