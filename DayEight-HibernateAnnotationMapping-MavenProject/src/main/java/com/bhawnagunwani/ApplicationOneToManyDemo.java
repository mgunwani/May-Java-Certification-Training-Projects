package com.bhawnagunwani;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.bhawnagunwani.models.Address;
import com.bhawnagunwani.models.Answer;
import com.bhawnagunwani.models.Employee;
import com.bhawnagunwani.models.Question;

public class ApplicationOneToManyDemo {
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		Answer ans1 = new Answer();
		ans1.setAnswer("Answer 1");
		ans1.setPostedBy("Bhawna");
		
		Answer ans2 = new Answer();
		ans2.setAnswer("Answer 2");
		ans2.setPostedBy("Gunwani");
		
		ArrayList<Answer> answerList = new ArrayList<Answer>();
		answerList.add(ans1);
		answerList.add(ans2);
		
		Question question1 = new Question();
		question1.setQuestion("What do you mean by deployment?");
		question1.setAnswers(answerList);
	
		session.persist(question1);
		tran.commit();
		session.close();
		System.out.println("Employee Added Successfully..!!");
		
	}

}
