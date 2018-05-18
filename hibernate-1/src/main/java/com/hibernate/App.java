package com.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Alien a = new Alien();
		a.setId(2);
		a.setName("shubham123");
		a.setColor("yellow2");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(a);
		tx.commit();
	}

	

}
