package com.khadri.hibernate.uuid;

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
		Adhaar adhaar = new Adhaar();
		adhaar.setCitizenName("JHON");
		session.save(adhaar);
		
		txn.commit();
	}
}
