package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	public static SessionFactory sessionFactory;

	static {
		Configuration cfg;
		cfg = new Configuration().configure();

		ServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		try {
			sessionFactory = cfg.buildSessionFactory(registry);
		} catch (HibernateException e) {
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
