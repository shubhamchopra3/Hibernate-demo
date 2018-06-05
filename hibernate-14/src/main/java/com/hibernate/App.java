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

		Alien a = session.get(Alien.class, 1);  //seelct query run for first time

		tx.commit();

		session.close();

		Session session2 = sf.openSession();

		session2.beginTransaction();

		//no select query executed here 
		Alien a1 = session2.get(Alien.class, 1);  //select query will be run just once even though session was closed before
		//because we have data in second level cache , so even if session is closed no need to hit the database again for getting data
		System.out.println(a1.getName());

		session2.close();

	}

}
