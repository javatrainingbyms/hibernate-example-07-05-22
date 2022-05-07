package com.ms.training;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {
	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<Project> list1=Arrays.asList(new Project("pr1"), new Project("pr2"));
		List<Project> list2=Arrays.asList(new Project("pr3"), new Project("pr4"));
		List<Project> list3=Arrays.asList(new Project("pr2"), new Project("pr3"));
		
		Emp e1=new Emp(111,"aaa",50000,new Laptop("l1"), list1);
		Emp e2=new Emp(112,"bbb",60000,new Laptop("l2"), list2);
		Emp e3=new Emp(113,"ccc",70000,new Laptop("l3"), list3);
		session.save(e1); session.save(e2); session.save(e3);
		transaction.commit();
		session.close();
		System.out.println("Data Stored...");
	}

}
