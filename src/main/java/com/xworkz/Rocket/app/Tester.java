package com.xworkz.Rocket.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.Rocket.app.thread.Labour;

public class Tester {
	public static void main(String[] args) {
		try {
			ApplicationContext spring = new ClassPathXmlApplicationContext("context.xml");
			Rocket refOfRocket = spring.getBean(Rocket.class);
			refOfRocket.launch();
			
			Labour refOfLabour = spring.getBean(Labour.class);
			refOfLabour.work();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


