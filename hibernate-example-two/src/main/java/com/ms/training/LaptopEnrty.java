package com.ms.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEnrty {

	public static void main(String[] args) {

		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(new Laptop("l1","dell",50000));
		session.save(new Laptop("l2","hp",55000));
		session.save(new Laptop("l3","lenovo",40000));
		transaction.commit();
		session.close();
		System.out.println("Data Stored...");

	}

}
