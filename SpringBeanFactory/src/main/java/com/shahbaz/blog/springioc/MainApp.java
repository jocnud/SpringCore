package com.shahbaz.blog.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainApp {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle=(Triangle) beanFactory.getBean("triangle");
		triangle.draw();
		
	}

}
