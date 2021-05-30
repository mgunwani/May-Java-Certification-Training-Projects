package com.bhawnagunwani;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.bhawnagunwani.models.Address;
import com.bhawnagunwani.models.Emp;
import com.bhawnagunwani.models.Employee;

public class HQLQueriesExample {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		/*
		 * Emp employee = new Emp(); employee.setName("Kochhar");
		 * employee.setEmail("kochhar@gmail.com"); session.persist(employee);
		 */
		
		/*
		 * Query query = session.createQuery("from Emp"); List emps = query.list();
		 * System.out.println(emps);
		 */
		
		/*
		 * Query query = session.createQuery("from Emp"); query.setFirstResult(2);
		 * query.setMaxResults(4); List emps = query.list(); System.out.println(emps);
		 */
		
		/*
		 * Query query = session.createQuery("delete from Emp where id = 1"); int status
		 * = query.executeUpdate(); System.out.println(status > 0 ? "Deleted..":
		 * "Not Deleted");
		 */
		
		Query query = session.createQuery("Update Emp Set name = :name where id = :id");
		query.setParameter("name", "Bhawna");
		query.setParameter("id", 2);
		int status = query.executeUpdate();
		System.out.println(status > 0 ? "Updated..": "Not Updated");
		
		
		
		tran.commit();
		session.close();
	
		
	}

}
