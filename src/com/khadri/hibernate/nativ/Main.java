package com.khadri.hibernate.nativ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		PhoneSim p1=  new PhoneSim();
		p1.setPhoneName("Jio");
		
		session.save(p1);
		
		
		txn.commit();
	
	
	}
}
