package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.entity.Office;

public class OfficeRead {

	public static void main(String[] args) {
		
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Office.class).buildSessionFactory();
		Session  session = factory.getCurrentSession();
		try {
		
	
			session.beginTransaction();
			Office office = session.find(Office.class, "8");
			session.getTransaction().commit();
	        System.out.println(office);
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
