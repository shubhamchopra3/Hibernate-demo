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
		
		
		/*Once a object is created and not saved it is in transient state */
		Alien a = new Alien();
		a.setName("shubham");
		a.setColor("yellow");
		
		/*once an object is saved it is in persistant state*/
	session.save(a);  
	//any changes made to the object in the persistant state will be automatically like below
	
	a.setName("divya");
	//this will be automatically updated without save this is because our object is in persistnat state and hibernate 
 //tracks any changes made to the object 
	
	a.setColor("pink");
	a.setColor("green");
	//only last modified value will be saved , hibernate doesnt run many update queries it only runs for last updated state. 
	

		
			
		

		tx.commit();

		session.close();  //once the session is closed the object is in detached state , once detatched hiberntae won't track any chabges made to the object
		a.setColor("black");  //this wont get updated as object is detached 
		
		/*final output of table is */
		/*
		 *  |  ID |  COLOR  |   NAME  |
		 *  |   1 |  GREEN  |  DIVYA  |
		 * 
		 * 
		 */
		
		
		sf.close();

	}

}
