package com.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.setName("Car");
		
		TwoWheeler t = new TwoWheeler();
		t.setName("bike");
		t.setSteeringhandle("bike steering");
		
		FourWheeler f = new FourWheeler();
		f.setName("Porsche");
		f.setSteeringWheel("Porsche steering wheel");
		
	
		

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(v);
		session.save(t);
		session.save(f);
		

		tx.commit();

		session.close();
		sf.close();

	}

}
