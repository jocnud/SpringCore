package com.shahbaz.blog.constructor_args;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring.xml");

		Triangle triangle = (Triangle) applicationContext
				.getBean("triangle-with-cons");
		triangle.draw();

	}

}
