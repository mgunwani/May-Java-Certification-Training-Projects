package com.bhawnagunwani;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.bhawnagunwani.models.Address;
import com.bhawnagunwani.models.Employee;

public class Application {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Address address = new Address();
		address.setStreet("Civil Lines");
		address.setCity("Delhi");
		address.setCountry("India");
		
		Employee employee = new Employee();
		employee.setName("King");
		employee.setEmail("king@gmail.com");
		employee.setAddress(address);
		
		session.persist(employee);
		tran.commit();
		session.close();
		System.out.println("Employee Added Successfully..!!");
		
		
	}

}
