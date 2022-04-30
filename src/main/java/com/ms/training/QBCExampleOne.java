package com.ms.training;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QBCExampleOne {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		Order order=Order.asc("sal");
		criteria.addOrder(order);
		
		criteria.add(Restrictions.like("name", "c%"));
		//List<String> desgList=Arrays.asList("se","sse");
		//criteria.add(Restrictions.in("desg", desgList));
		//criteria.add(Restrictions.between("sal", 25000, 50000));
		//Criterion crt1=Restrictions.eq("dept", "qa");
		//Criterion crt2=Restrictions.ge("sal", 50000);
		//Restrictions.between("sal", 25000, 50000);
		//Criterion crt3=Restrictions.or(crt1,crt2);
		//criteria.add(crt1);
		//criteria.add(crt2);
		//criteria.add(crt3);
		List<Emp> employees=criteria.list();
		for(Emp employee:employees) {
			System.out.println(employee);
		}
		session.close();
		
		
	}

}
