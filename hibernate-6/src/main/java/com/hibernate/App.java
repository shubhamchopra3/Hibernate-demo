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
		
		Vehicle v = new Vehicle();
		v.setName("Honda city");
		a.setVehicle(v);

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(a);
		

		tx.commit();

		session.close();
		sf.close();

	}

}
