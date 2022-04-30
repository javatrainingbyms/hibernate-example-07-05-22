package com.ms.training;

import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) {

		Session session = Utility.getSessionFactory().openSession();
		Emp emp = session.get(Emp.class, 115);
		if (emp != null) {
			System.out.println(emp.getName());
			System.out.println(emp.getSal());
		}else {
			System.out.println("Wrong Id...");
		}
		session.close();
	}

}
