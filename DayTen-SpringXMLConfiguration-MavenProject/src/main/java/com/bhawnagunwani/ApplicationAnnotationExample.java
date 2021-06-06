package com.bhawnagunwani;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhawnagunwani.ioc.AppConfig;
import com.bhawnagunwani.models.Customer;

public class ApplicationAnnotationExample {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer.getName());
		context.close();
		
	}

}
