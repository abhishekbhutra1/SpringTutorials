package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//in order to run the destroy method you wil have to enable the preshutdownhook
		//preshutdownhook is present in AbstractApplicationContext.
		// AbstractApplicationContext is a parent class of ApplicationContext
//		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		// it tells the application to run the destroy method before closing the application.
		ap.registerShutdownHook();
//		Samosa s1 = (Samosa)ap.getBean("samosa1"); 
//		System.out.println(s1.toString());
//		
//		Pepsi p1 = (Pepsi)ap.getBean("pepsi1");
//		System.out.println(p1.toString());
		
		Example e1 = (Example) ap.getBean("example1");
		System.out.println(e1);

		
	}
}
