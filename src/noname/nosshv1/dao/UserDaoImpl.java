package noname.nosshv1.dao;

import java.util.List;

import noname.nosshv1.pojo.User;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.opensymphony.xwork2.ActionContext;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<User> searchAllUsers() {
    	Transaction tx = null;
    	List<User> users = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			users = session.createQuery("from User").list();
			ActionContext.getContext().put("users", users);
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return users;
    }
    
    public boolean saveUser (String name, String password, String role) {
    	boolean flag = true;
    	Transaction tx = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			User user = new User();
			user.setName(name);
			user.setPassword(password);
			user.setRole(role);
			session.save(user);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			flag = false;
		} finally {
			session.close();
		}
    	return flag;
    }
    
    public List<User> searchUser(String name, String password) {
    	String hql = "from User u where u.name=?0 and u.password=?1";
    	Transaction tx = null;
    	List<User> users = null;
    	Session session = sessionFactory.openSession();
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter(0, name);
			query.setParameter(1, password);
			users = query.list();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return users;
    }
}