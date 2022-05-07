package com.ms.training;

import java.util.List;

import org.hibernate.Session;

public class EmpSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Emp emp=session.get(Emp.class, 112);
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		System.out.println(emp.getLaptop().getCode());
		System.out.println(emp.getLaptop().getDetails());
		System.out.println(emp.getLaptop().getPrice());
		List<Account> accounts=emp.getAccounts();
		for(Account account:accounts) {
			System.out.println(account.getAno()+","+account.getBank());
		}
		List<Project> projects=emp.getProjects();
		for(Project project:projects) {
			System.out.println(project.getName());
		}
		session.close();
	}

}
