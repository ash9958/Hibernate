package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.entity.Office;

public class OfficeDelete {

	public static void main(String[] args) {
		
	
		SessionFactory factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Office.class).buildSessionFactory();
		Session  session =  factory.getCurrentSession();
		try {
		
			
			
		    
		    session.beginTransaction();
		    Office office = session.find(Office.class, "8");
		    
		    session.delete(office);
		    
	        session.getTransaction().commit();
	        
	        
	        System.out.println("successfully removed");
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
