package dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.BaseDao;

public class BaseDaoImpl implements BaseDao {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Object insert(Object po) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try {
			session.save(po);
			session.flush();
			System.out.println("success");
			return po;
		} catch (HibernateException ex) {
			throw ex;
		}finally{
			session.close();
		}
		
	}

	@Override
	public void saveObject(Object o) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(o);
		session.close();
	}

	@Override
	public void renew(Object po) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try {
			session.update(po); // 记录不存在时,update也不会出错
		} catch (HibernateException ex) {
			throw ex;
		}
		try {
			session.flush();
			session.close();
		} catch (HibernateException ex1) {
			throw ex1;
		}
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try {
			session.delete(obj);
			session.flush();
		} catch (HibernateException ex2) {
			throw ex2;
		}finally{
			session.close();
		}
	}

	@Override
	public void delete(Class businessClass, Serializable id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Object obj = null;
		try {
			obj = session.get(businessClass, id);
		} catch (HibernateException ex) {
			throw ex;
		}
		if (obj != null) {
			try {
				session.delete(obj);
			} catch (HibernateException ex1) {
				throw ex1;
			}
		}
		try {
			session.flush();
			session.close();
		} catch (HibernateException ex2) {
			throw ex2;
		}
	}

	@Override
	public List search(String hsql) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List alist = null;
		try {
			alist = session.createQuery(hsql).list();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
			throw ex;
		}
		return alist;
	}

	@Override
	public List getObjects(Class clazz) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List alist = session.createQuery("from " + clazz.getName()).list();
		session.close();
		return alist;
	}

	@Override
	public Object getObject(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Object o = session.get(clazz, id);
		session.close();
		return o;
	}
	

}
