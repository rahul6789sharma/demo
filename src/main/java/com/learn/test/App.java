package com.learn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.test2.Car;

public class App {
	public static void main(String[] args) {

		/*ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringBeans.xml");

		Shape s = (Shape) context.getBean("circle");
		s.draw();

		Shape t = (Shape) context.getBean("triangle");
		t.draw();*/
		
		/*ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("SpringBeans.xml");*/
		
		context.close();
	}
}
