package com.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		
		/*Inserting data into the databse */
		Alien a = new Alien();
		a.setName("shubham");
		a.setColor("yellow");
		session.persist(a);
		 a = new Alien();
		a.setName("yash");
		a.setColor("pink");
		session.persist(a);
	
	/*getting data from the databse*/	
	Alien a1=session.get(Alien.class,1);
		System.out.println(a1.getName());
		
		
	/*update for that first get the object then update*/
		
		a1.setName("divya");
		session.update(a1);
		
	/*deleting first pull up the object then delete*/
	//	Alien a2=session.get(Alien.class,2);
		//	session.delete(a2);
		
			
		

		tx.commit();

		session.close();
		sf.close();

	}

}
