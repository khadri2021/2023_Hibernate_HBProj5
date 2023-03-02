package com.khadri.hibernate.custom;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
		 
		Random random = new Random();
		int randomNumber = random.nextInt();
		
		if(randomNumber < 0)
		{
			randomNumber = randomNumber * -1;
		}
		return "RRV"+String.valueOf(randomNumber).substring(0,5);
	}

	
}
 