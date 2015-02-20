package web.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;


import model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import dto.UserDto;

public class UserManagerAction extends ActionSupport{

	UserDao userDao = new UserDaoImpl();
	
	private String username; 
	private String password; 
	private String sex; 
	private String email; 
	private String userdesc; 
	private String grade; 
	private String shopname;
	private String haveimg;
	
	private User user;
	
	private File headimg;
	
	private List<User> users = new ArrayList<User>();
	
	private List<UserDto> dtolist = new ArrayList<UserDto>();

	
	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getHaveimg() {
		return haveimg;
	}

	public void setHaveimg(String haveimg) {
		this.haveimg = haveimg;
	}

	public String showUsers() throws Exception {
		UserDto dto = new UserDto();
		//Ê¹ÓÃdto×ª»»list
		dto.convert(userDao.getAllUser(User.class), dtolist);
		return "list";
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<UserDto> getDtolist() {
		return dtolist;
	}

	public void setDtolist(List<UserDto> dtolist) {
		this.dtolist = dtolist;
	}

	public File getHeadimg() {
		return headimg;
	}

	public void setHeadimg(File headimg) {
		this.headimg = headimg;
	}

	public void upload() throws IOException {
		String realPath = ServletActionContext.getServletContext().getRealPath("/headimg");
		System.out.println(realPath);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		username = (String)session.get("username");
		if(headimg != null) {
			System.out.println(username);
			File saveFile = new File(new File(realPath),username + ".jpg");
			if(!saveFile.getParentFile().exists()) {
				saveFile.getParentFile().mkdirs();
			}
			FileUtils.copyFile(headimg, saveFile);
		}
	}
	
	public String updateHead() throws IOException {
		if(headimg != null) {
			upload();
		}
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		username = (String)session.get("username");
		user = userDao.getUserByName(username);
		if(user == null) return "not found";
		user.setHaveimg("1");
		session.put("haveimg", "1");
		userDao.update(user);
		return "success";
	}
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser() {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setSex(sex);
		u.setEmail(email);
		u.setGrade("1");
		u.setUserdesc("haha");
		u.setHaveimg("0");
		userDao.saveUser(u);
	}
	
	/*public void addSeller() {
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setSex(sex);
		u.setEmail(email);
		u.setGrade("2");
		u.setHaveimg("0");
		u.setUserdesc("haha");
		userDao.saveUser(u);
	}*/
	
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


	public String userregister() throws Exception {
		System.out.println("hehe");
		addUser();
		return "success";
	}
	
	public String userlogin() throws Exception {
		if(username == null || username.equals("") || password == null || password.equals("")) {
			return "error";
		}
		User u = userDao.isValidUser(username, password);
		ActionContext actionContext = ActionContext.getContext();
		if(u != null){
			actionContext = ActionContext.getContext();
			Map session = actionContext.getSession();
			session.put("Login", u.getGrade());
			session.put("username", username);
			session.put("userdesc", u.getUserdesc());
			session.put("haveimg", u.getHaveimg());
			session.put("shopname", u.getShopname());
			//session.put("type", u.getGrade());
			return "success";
		} else {
			return "wrong";
		}
	}
	
	public String userlogout() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.put("Login", "");
		return "logout";
	}
	
	/*public String sellerregister() throws Exception {
		addSeller();
		return "success";
	}*/
	
	public String becomeSeller() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		username = (String)session.get("username");
		user = userDao.getUserByName(username);
		if(user == null) return "not found";
		user.setGrade("2");
		user.setShopname(shopname);
		//System.out.println("shopname == " + shopname);
		session.put("shopname", shopname);
		session.put("Login", "2");
		userDao.update(user);
		return "success";
		
	}
	
	public String changeUserdesc() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		username = (String)session.get("username");
		user = userDao.getUserByName(username);
		if(user == null) return "not found";
		user.setUserdesc(userdesc);
		System.out.println(userdesc);
		session.put("userdesc", userdesc);
		userDao.update(user);
		return "success";
	}
	
	
}
