package com.bhawnagunwani.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata meta = new MetadataSources(registry).getMetadataBuilder().build(); 
				sessionFactory = meta.getSessionFactoryBuilder().build();				
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				if(registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}	
		}
		return sessionFactory;
	}
	
	public static void shutdown() {
		if(registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
}
