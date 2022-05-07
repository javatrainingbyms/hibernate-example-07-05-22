package com.ms.training;

import java.util.List;

import org.hibernate.Session;

public class AccountSearch {
	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Account account=session.get(Account.class, "ac1");
		System.out.println(account.getAno());
		System.out.println(account.getBank());
		System.out.println(account.getEmp().getName());
		session.close();
	}
}
