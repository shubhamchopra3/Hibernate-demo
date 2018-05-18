package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Alien a = new Alien();
	
		a.setName("piyush232");
		a.setColor("yellow");
		

		Address adr = new Address();
		adr.setCity("nagpur");
		adr.setCountry("india");
		a.setAddress(adr);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(a);
		
		tx.commit();
		a= session.get(Alien.class, 1);
		System.out.println(a.getColor());
		session.close();
		sf.close();
		
		
	}

}
