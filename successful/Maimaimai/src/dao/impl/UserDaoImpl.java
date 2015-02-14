package dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail());
		Session session = sessionFactory.openSession();
		session.save(user);
		session.flush();
		//session.getTransaction().commit();
		session.close();
		//this.getHibernateTemplate().saveOrUpdate(user);
		System.out.println("success");
	}

}
