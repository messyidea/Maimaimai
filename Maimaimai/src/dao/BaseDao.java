package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface BaseDao {

	public Object insert(Object po);
	
	public void saveObject(Object o);

	public void renew(Object po);

	public void delete(Object obj);

	public void delete(Class businessClass, java.io.Serializable id);

	public List search(String hsql);

	public List getObjects(Class clazz);

	public Object getObject(Class clazz, Serializable id);
	
}
