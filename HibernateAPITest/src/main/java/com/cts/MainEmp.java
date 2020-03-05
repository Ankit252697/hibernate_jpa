package com.cts;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  

public class MainEmp {    
	public static void main(String[] args) {    
	      
		Configuration conf = new org.hibernate.cfg.Configuration();
		conf.configure();
		SessionFactory sessionFactory = conf.buildSessionFactory();
	    Session session = sessionFactory.openSession();  
	    Transaction t = session.beginTransaction();   
	            
	    Employee e1=new Employee();    
	    e1.setId(102);    
	    e1.setFirstName("Amit");    
	    e1.setLastName("surya");    
	        
	    session.save(e1);  
	    t.commit();  
	    System.out.println("Data saved");    
	    sessionFactory.close();  
	    session.close();    
	        
	}    
}
