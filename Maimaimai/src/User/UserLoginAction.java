package User;

import model.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserLoginAction extends ActionSupport{

	private String username;
	private String password;
	UserDao userDao = new UserDaoImpl();
	
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

	@Override
	public String execute() throws Exception {
		System.out.println(username);
		System.out.println(password);
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
