package com.test.profile.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class SessionFactoryUtil {

	private static final SessionFactory sf;
	 static {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	        	sf = new Configuration().configure("com\\test\\profile\\configXML\\hibernate.cfg.xml").buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 public static SessionFactory getSessionFactory() {
	        return sf;
	    }

}
