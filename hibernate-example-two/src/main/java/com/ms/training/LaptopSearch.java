package com.ms.training;

import org.hibernate.Session;

public class LaptopSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Laptop laptop=session.get(Laptop.class, "l1");
		System.out.println(laptop.getCode());
		System.out.println(laptop.getDetails());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getEmp().getName());
		
		session.close();
	}

}
