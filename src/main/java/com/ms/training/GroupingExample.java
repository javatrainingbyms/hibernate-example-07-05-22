package com.ms.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class GroupingExample {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
	
		criteria.add(Restrictions.eq("dept", "dev"));
		Projection proj1=Projections.groupProperty("dept");
		Projection proj2=Projections.sum("sal");
		Projection proj3=Projections.avg("sal");
		Projection proj4=Projections.max("sal");
		Projection proj5=Projections.min("sal");
		
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1); pList.add(proj2); pList.add(proj3);
		pList.add(proj4); pList.add(proj5); 
		
		
		criteria.setProjection(pList);
		
		
		List<Object[]> list=criteria.list();
		
		for(Object ar[]:list) {
			for(Object item:ar) {
				System.out.println(item);
			}
			System.out.println("_______________________");
		}

	}

}
