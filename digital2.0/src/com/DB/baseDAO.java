package com.DB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class baseDAO {
	protected SessionFactory sessionFactory;
	protected Session session;
	protected Transaction transaction;
	
	
	
	public baseDAO() {
		super();
		// TODO Auto-generated constructor stub
		final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		} catch (Exception e) {
			// TODO: handle exception
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("Hibernate initialization error!");
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	
}
