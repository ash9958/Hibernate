package com.example.hibernate.crud.office;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.entity.Office;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class OfficeUpdate {

	public static void main(String[] args) {
		
	SessionFactory factory = (SessionFactory) new Configuration().configure().addAnnotatedClass(Office.class).buildSessionFactory();
	Session session = factory.getCurrentSession();
		
		try {
		
			
		    session.beginTransaction();

		    Office office = session.find(Office.class, "8");

	        office.setAddressLine1("New Address line 1 .......");
	        office.setAddressLine2("New Address line 2 .......");
	        	            
	        session.save(office);  
	        
	       session.getTransaction().commit();
	        
	        System.out.println("successfully updated");
			
		
		} catch(Exception e) {
			
			e.printStackTrace();
	
		} finally {
			
			if(session != null) {
				session.close();
			}
			
		}
		
		
	}
	
}
