package dao.impl;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.User;
import dao.UserDAO;


public class UserDaoImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getEmail());
		this.getHibernateTemplate().saveOrUpdate(user);
	}

}
