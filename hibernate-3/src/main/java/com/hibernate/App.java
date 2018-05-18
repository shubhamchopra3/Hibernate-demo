package com.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Alien a = new Alien();
	
		a.setName("piyush232");
		a.setColor("yellow");
		

		Address adr1 = new Address();
		adr1.setCity("nagpur");
		adr1.setCountry("india");
		
		Address adr2 = new Address();
		adr2.setCity("anantapur");
		adr2.setCountry("Andhra");
		
		Set<Address> listofAddress1 = new HashSet<>();
		
		
		a.getListofAddress().add(adr1);
		a.getListofAddress().add(adr2);
	
		
		
		
		
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
