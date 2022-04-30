package com.ms.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpUpdate {

	public static void main(String[] args) {

		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.update(new Emp(116,"fff",180000,"pm", "dev"));
		transaction.commit();
		session.close();
		System.out.println("Data Modified...");
	}

}
