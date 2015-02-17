package web.admin;

import model.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserManagerAction extends ActionSupport{

	UserDao userDao = new UserDaoImpl();
	
	private String username; 
	private String password; 
	private String sex; 
	private String email; 
	private String userdesc; 
	private String grade; 

	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser() {
		System.out.println("hehe");
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setSex(sex);
		u.setEmail(email);
		u.setGrade("1");
		u.setUserdesc("haha");
		System.out.println("username == " + username);
		userDao.saveUser(u);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserdesc() {
		return userdesc;
	}

	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String register() throws Exception {
		System.out.println("hehe");
		addUser();
		return "success";
	}
	
	public String userlogin() throws Exception {
		if(username == null || username.equals("") || password == null || password.equals("")) {
			return "error";
		}
		User u = userDao.isValidUser(username, password);
		if(u != null){
			return "success";
		} else {
			return "wrong";
		}
	}
	
}
