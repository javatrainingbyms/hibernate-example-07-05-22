package com.ms.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProjectionExampleOne {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		criteria.add(Restrictions.gt("eno", 112));
		Projection proj2=Projections.property("eno");
		criteria.setProjection(proj2);
		List<Integer> codes=criteria.list();
		for(Integer code:codes) {
			System.out.println(code);
		}
		/*
		Projection proj1=Projections.property("name");
		criteria.setProjection(proj1);
		List<String> names=criteria.list();
		for(String name:names) {
			System.out.println(name);
		}
		*/
		session.close();
		

	}

}
