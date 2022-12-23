package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		//new way to typecast
		Emp e = ap.getBean("employee",Emp.class);
		System.out.println(e.toString());
	}
}
