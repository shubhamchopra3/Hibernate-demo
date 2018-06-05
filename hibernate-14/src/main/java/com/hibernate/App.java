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

		Alien a = session.get(Alien.class, 1);

		tx.commit();

		session.close();

		Session session2 = sf.openSession();

		session2.beginTransaction();

		Alien a1 = session2.get(Alien.class, 1);
		System.out.println(a1.getName());

		session2.close();

	}

}
