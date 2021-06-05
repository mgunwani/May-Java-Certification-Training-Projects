package com.bhawnagunwani;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bhawnagunwani.models.Brand;
import com.bhawnagunwani.models.Product;
import com.bhawnagunwani.utils.HibernateUtils;

public class OneToManyExample {

	public static void main(String[] args) {
		
		Transaction transaction = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Brand brand1 = new Brand("Samsung");
			Set<Product> products = new HashSet<Product>();
			products.add(new Product("Samsung Galaxy", "19000", brand1));
			products.add(new Product("Samsung Note", "16000", brand1));
			products.add(new Product("Samsung Earphones", "11000", brand1));
			brand1.setProducts(products);
			session.save(brand1);
			transaction.commit();
			System.out.println("Brands and Products added successfully..");
			
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

		

	}

}
