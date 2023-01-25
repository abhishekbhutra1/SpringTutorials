package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/di/diconfig.xml");
		
		Harddisk hd = (Harddisk) ap.getBean("harddisk");
		
		Laptop l = new Laptop();
		l.setHarddisk(hd);
		
		System.out.println(l);
	}
	
}
