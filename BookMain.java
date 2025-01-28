package com.nasa.bookapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nasa.training.Employee;
 
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.nasa");
		
		String[] beanName = context.getBeanDefinitionNames(); 
		IBookService service = (IBookService) context.getBean("bookServiceImpl");
		service.getAll().forEach(System.out::println);
		Employee emp = (Employee) context.getBean("employee");
		String msg = emp.greet();
		System.out.println(msg);
		
	}

}
