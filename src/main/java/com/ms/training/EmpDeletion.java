package com.ms.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDeletion {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Emp emp=new Emp(); emp.setEno(116); emp.setName("abc");
		session.delete(emp);
		transaction.commit();
		session.close();
		System.out.println("Data Removed...");
	}

}
