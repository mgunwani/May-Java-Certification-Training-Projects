package com.bhawnagunwani;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bhawnagunwani.models.Category;
import com.bhawnagunwani.utils.HibernateUtils;

class CategoryOperations {

	public void insertCategories() {

		Transaction transaction = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Category category1 = new Category("Storage Devices");
			Category category2 = new Category("Misc");
			session.save(category1);
			session.save(category2);
			System.out.println("Categories Added Successfully..!!");
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}

	public void getCategories() {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			List<Category> categories = session.createQuery("from Category", Category.class).list();
			categories.forEach(c -> {
				System.out.println(c.getName());
			});
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void deleteCategories() {
		
		Transaction transaction = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) { 
			transaction = session.beginTransaction();
			Category category = session.get(Category.class, 1);
			if(category != null) {
				session.delete(category);
				// session.remove(category);
			}	
			transaction.commit();
			System.out.println("Category Deleted Successfully..");
			
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		
	}

	public void updateCategories() {
		
		Transaction transaction = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) { 
			transaction = session.beginTransaction();
			Category category = session.get(Category.class, 1);
			if(category != null) {
				category.setName("XYZ");
				session.saveOrUpdate(category);
			}	
			transaction.commit();
			System.out.println("Category Updated Successfully..");
			
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		
	}

	public void getCategoryById() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			Category category = session.load(Category.class, 5);
			if(category != null)
				System.out.println(category);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}

public class Application {

	public static void main(String[] args) {

		CategoryOperations categoryOperations = new CategoryOperations();
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Get All Categories");
		System.out.println("2 - Insert Categories");
		System.out.println("3 - Get Category By Id");
		System.out.println("4 - Delete Categories");
		System.out.println("5 - Update Categories");
		System.out.print("Enter Your Choice : ");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			categoryOperations.getCategories();
			break;

		case 2:
			categoryOperations.insertCategories();
			break;
			
		case 3:
			categoryOperations.getCategoryById();
			break;

		case 4:
			categoryOperations.deleteCategories();
			break;

		case 5:
			categoryOperations.updateCategories();
			break;

		default:
			System.out.println("Incorrect Choice..");
			break;
		}

	}

}
