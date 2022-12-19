package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student)ap.getBean("student1");
        Student student2 = (Student)ap.getBean("student2");
        Student student3 = (Student)ap.getBean("student3");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
