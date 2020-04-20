package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.example.hibernate.entity.Office;

public class OfficeCreate {

	public static void main(String[] args) {
		
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Office.class).buildSessionFactory();
		Session session= factory.getCurrentSession();
		try {
		
	
	        Office office = new Office();    
	        office.setOfficeCode("8");
	        office.setCity("kolkata");
	        office.setPhone("1234");
	        office.setAddressLine1("Address line 1 .......");
	        office.setAddressLine2("Address line 2 .......");
	        office.setState("West Bengal");
	        office.setCountry("India");
	        office.setPostalCode("700000");
	        office.setTerritory("ASIA");
	        	            
	        session.beginTransaction();
	        session.save(office);  
	       session.getTransaction().commit();
	        
	        System.out.println("successfully created");
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
