package noname.nosshv1.dao;

import java.util.List;

import noname.nosshv1.pojo.Account;
import noname.nosshv1.util.Util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDaoImpl implements AccountDao {
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Account> searchAllAccounts() {
		Transaction tx = null;
    	List<Account> accounts = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			accounts = session.createQuery("from Account").list();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return accounts;
	}
	
	public void saveAccount(String account, String username, String password, String comment) {
    	Transaction tx = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			Account act = new Account();
			act.setAccount(account);
			act.setUsername(username);
			act.setPassword(password);
			act.setComment(comment);
			session.save(act);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void updateDao(int id, String account, String username, String password, String comment) {
		Transaction tx = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			Account act = new Account();
			act = session.get(Account.class, id);
			act.setAccount(account);
			act.setUsername(username);
			act.setPassword(password);
			act.setComment(comment);
			session.persist(act);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	public Account searchAccount(int id) {
		Transaction tx = null;
    	Account account = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			account = (Account)session.get(Account.class, id);
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return account;
	}
	
	public void deleteAccount(int id) {
		Transaction tx = null;
    	Account account = null;
    	Session session = sessionFactory.openSession();
		try {
			account = (Account)session.get(Account.class, id);
			tx = session.beginTransaction();
			session.delete(account);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
