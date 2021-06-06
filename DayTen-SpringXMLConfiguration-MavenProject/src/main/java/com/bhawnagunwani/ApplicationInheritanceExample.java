package com.bhawnagunwani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhawnagunwani.models.Person;

public class ApplicationInheritanceExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationInheritanceContext.xml");
		
		Person person = (Person) context.getBean("p1");
		System.out.println(person);
		
		((AbstractApplicationContext) context).close();
	}

}
