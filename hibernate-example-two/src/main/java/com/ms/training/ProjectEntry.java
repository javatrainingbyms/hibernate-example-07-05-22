package com.ms.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectEntry {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(new Project("pr1","erp"));
		session.save(new Project("pr2","banking"));
		session.save(new Project("pr3","insurance"));
		session.save(new Project("pr4","ecommerce"));
		session.save(new Project("pr5","firewall"));
		
		transaction.commit();
		session.close();
		System.out.println("Data Stored...");

	}

}
