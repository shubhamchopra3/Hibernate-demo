package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {

		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		
		Query query = session.createQuery("from ALIEN_DETAILS");  //this is entity name and this will return a list
		
		List<Alien> aliens = query.getResultList();   
		System.out.print("size is : ");
		System.out.println(aliens.size());
		
		

		tx.commit();

		session.close();  
		
		sf.close();

	}

}
