package com.ms.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountEntry {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(new Account("ac1","sbi", new Emp(111)));
		session.save(new Account("ac2","hdfc", new Emp(111)));
		session.save(new Account("ac3","icici", new Emp(112)));
		session.save(new Account("ac4","boi", new Emp(112)));
		session.save(new Account("ac5","bob", new Emp(113)));
		session.save(new Account("ac6","aubank", new Emp(113)));
		
		transaction.commit();
		session.close();
		System.out.println("Data Stored...");

	}

}
