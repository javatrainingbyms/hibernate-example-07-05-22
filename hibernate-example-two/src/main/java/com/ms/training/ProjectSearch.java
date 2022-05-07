package com.ms.training;

import java.util.List;

import org.hibernate.Session;

public class ProjectSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Project project=session.get(Project.class, "pr2");
		System.out.println(project.getCode());
		System.out.println(project.getName());
		List<Emp> emps=project.getEmployees();
		for(Emp emp:emps) {
			System.out.println(emp.getEno()+","+emp.getName());
		}
		session.close();

	}

}
