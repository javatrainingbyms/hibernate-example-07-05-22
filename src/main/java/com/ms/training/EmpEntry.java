package com.ms.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {
	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(new Emp(111,"aaa",50000,"se", "dev"));
		session.save(new Emp(112,"bbb",60000,"se", "qa"));
		session.save(new Emp(113,"ccc",65000,"sse", "dev"));
		session.save(new Emp(114,"ddd",55000,"sse", "qa"));
		session.save(new Emp(115,"eee",45000,"ase", "qa"));
		session.save(new Emp(116,"fff",160000,"tl", "dev"));
		
		transaction.commit();
		session.close();
		System.out.println("Data Stored...");
	}

}
