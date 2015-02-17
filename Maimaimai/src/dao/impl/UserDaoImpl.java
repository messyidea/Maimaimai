package dao.impl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.User;
import dao.UserDao;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {
	
	/*private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		/*System.out.println(user.getEmail());
		Session session = sessionFactory.openSession();
		session.save(user);
		session.flush();
		//session.getTransaction().commit();
		session.close();
		//this.getHibernateTemplate().saveOrUpdate(user);
		System.out.println("success");*/
		System.out.println(user.getPassword());
		super.insert(user);
	}

	@Override
	public List<User> getAllUser(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(User.class);
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		User user = (User)super.getObject(User.class, name);
		return user;
	}

	@Override
	public void deleteUserByName(String name) {
		// TODO Auto-generated method stub
		super.delete(User.class, name);
		
	}

	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		List<User> list = super.search("from User where username like '%"+name+"%'");
		return list;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		super.renew(user);
		
	}

	@Override
	public User isValidAdmin(String username, String password) {
		// TODO Auto-generated method stub
		User user = null;
		List<User> list = super.search("from User where grade='2' and username='"+username+"' and password='"+password+"'");
		if(list!=null&&list.size()>0){
			user = list.get(0);
		}
		return user;
	}

	@Override
	public User isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		User user =null;
		List<User> list = super.search("from User where username='"+username+"' and password='"+password+"'");
		if(list!=null&&list.size()>0){
			user = list.get(0);
		}
		return user;
	}
	
	

}
