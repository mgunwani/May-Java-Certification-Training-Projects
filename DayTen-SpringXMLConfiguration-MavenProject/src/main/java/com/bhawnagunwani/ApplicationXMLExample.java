package com.bhawnagunwani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhawnagunwani.models.Employee;
import com.bhawnagunwani.models.Student;

public class ApplicationXMLExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/* To Inject DI using Setter Method: */
		Student stObj = (Student) context.getBean("student");
		System.out.println(stObj.getName());
		
		System.out.println("-----------------------");

		/* To Inject DI using Constructor Method: */
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		
		System.out.println("-----------------------");
		
		/* To Inject DI using Constructor Method: */
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);
		
		((AbstractApplicationContext) context).close();
		
	}

}
