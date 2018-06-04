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
		query.setFirstResult(0);   //starting index of rows
		query.setMaxResults(5);    //number of rows to be fetched , so above two lines will fetch first 5 rows of the table
		
		List<Alien> aliens = query.getResultList();   
		System.out.print("size is : ");
		System.out.println(aliens.size());
		
		

		tx.commit();

		session.close();  
		
		sf.close();

	}

}
