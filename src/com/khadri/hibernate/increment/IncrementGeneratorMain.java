package com.khadri.hibernate.increment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class IncrementGeneratorMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		for (int i = 0; i < 100; i++) {
			Patient patient = new Patient();
			patient.setName("JHON");
			session.save(patient);
		}
		
		txn.commit();
		session.close();

	}
}
