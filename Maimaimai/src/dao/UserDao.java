package dao;

import java.util.List;

import model.User;

public interface UserDao {
	
	public void saveUser(User user);
	
	public List<User> getAllUser(Class clazz);
	
	public User getUserByName(String name);
	
	public void deleteUserByName(String name);
	
	public List<User> findByName(String name);
	
	public void update(User user);
	
	public User isValidAdmin(String username,String password);
	
	public User isValidUser(String username,String password);
	
	
}
