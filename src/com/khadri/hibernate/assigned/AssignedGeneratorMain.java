package com.khadri.hibernate.assigned;

import java.util.Random;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AssignedGeneratorMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		for(int i=0;i<1000;i++) {
		UUID uuid = UUID.randomUUID();
		Random random = new Random();
		long nextLong = random.nextLong();
		
		if(nextLong < 0) {
			nextLong = nextLong * -1;
		}
		String orderNumber = String.valueOf(nextLong);
		
		OrderZomoto orderZomoto = new OrderZomoto();
		
		orderZomoto.setUuid(uuid.toString());//identifier
		orderZomoto.setOrderId(orderNumber.substring(0, 10));
		orderZomoto.setOrderName("DOSA");
	
		session.save(orderZomoto);
		
		} 

		txn.commit();
		session.close();

	}
}
