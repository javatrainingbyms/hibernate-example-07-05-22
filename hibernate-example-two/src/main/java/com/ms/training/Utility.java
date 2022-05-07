package com.ms.training;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	public static SessionFactory getSessionFactory() {
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}
}
