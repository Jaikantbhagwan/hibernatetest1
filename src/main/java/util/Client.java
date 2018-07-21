package util;

import org.hibernate.SessionFactory;

public class Client {

	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		System.out.println(factory);
		
	}
	
}
