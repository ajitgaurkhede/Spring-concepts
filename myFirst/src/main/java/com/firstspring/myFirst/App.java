package com.firstspring.myFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Tyre t1 = new Tyre();
		t1.setBrand("MRF");

		System.out.println(t1);

		/*
		 * Inversion of control (IOC) 1. Add jar files or add maven directory for Spring
		 * Core 2. configure java Object in an XML File 3. use Spring IOC Container, eg:
		 * BeanFactory or Application to get the objects constructed by them
		 */

		System.out.println("--------Spring IOC in Action------------");
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("mySpring.xml"));

		ApplicationContext context = new ClassPathXmlApplicationContext("mySpring.xml");

		//Tyre t2 = (Tyre) context.getBean("tyre");

		//System.out.println(t2);

		// Vehical obj = new Car();

		Vehical obj = (Vehical) context.getBean("cars");

		obj.drive();
		
		//ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		//cxt.close(); // explicit close bcz it totaly depends on core container

	}
}
