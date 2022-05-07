package com.ms.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionExampleTwo {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		
		Projection proj1=Projections.property("eno");
		Projection proj2=Projections.property("name");
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1); pList.add(proj2);
		
		criteria.setProjection(pList);
		
		
		List<Object[]> list=criteria.list();
		
		for(Object ar[]:list) {
			for(Object item:ar) {
				System.out.println(item);
			}
			System.out.println("_______________________");
		}
		
		session.close();

	}

}
