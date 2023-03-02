package com.khadri.hibernate.assigned;

import java.util.Random;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		 
		
		OrderZomoto orderZomoto = session.get(OrderZomoto.class, "8567517677");
		System.out.println(orderZomoto);

		txn.commit();
		session.close();

	}
}
