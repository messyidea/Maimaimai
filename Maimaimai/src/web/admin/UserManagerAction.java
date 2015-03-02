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


import model.Favorites;
import model.Iorder;
import model.Item;
import model.Shop;
import model.Shopcar;
import model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.FavoritesDao;
import dao.ItemDao;
import dao.OrderDao;
import dao.ShopDao;
import dao.ShopcarDao;
import dao.UserDao;
import dao.impl.FavoritesDaoImpl;
import dao.impl.ItemDaoImpl;
import dao.impl.OrderDaoImpl;
import dao.impl.ShopDaoImpl;
import dao.impl.ShopcarDaoImpl;
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
	private String shopdesc;
	private ShopDao shopdao = new ShopDaoImpl();
	private Shopcar shopcar;
	private ShopcarDao shopcardao = new ShopcarDaoImpl();
	private Favorites fav;
	private FavoritesDao favoritesdao = new FavoritesDaoImpl();
	List<Favorites> favoriteslist;
	List<Shopcar> shopcarlist;
	List<Item> itemlist;
	List<Iorder> orderlist;
	OrderDao orderdao = new OrderDaoImpl();
	
	private Integer id;
	ItemDao itemdao = new ItemDaoImpl();
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String showcount() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String username = (String)session.get("username");
		orderlist = orderdao.findByName(username);
		session.put("numoforder", orderlist.size());
		int now = 0;
		for(Iorder oo:orderlist) {
			now += oo.getNum();
		}
		session.put("numofitem", now);
		return "success";
	}
	
	public String showcount2() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String shopname = (String)session.get("shopname");
		orderlist = orderdao.getOrderByShopname(shopname);
		session.put("numoforder", orderlist.size());
		int now = 0;
		for(Iorder oo:orderlist) {
			now += oo.getNum();
		}
		session.put("numofitem", now);
		return "success";
	}
	
	public String shopcardel() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String username = (String)session.get("username");
		String idd = id.toString();
		Shopcar sc = shopcardao.getShopcarBy2(username, idd);
		//System.out.println("xixihaha");
		//System.out.println("id == "+sc.getId().toString());
		shopcardao.deleteShopcarById(sc.getId());
		return "success";
	}
	
	public String favoritesdel() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String username = (String)session.get("username");
		String idd = id.toString();
		Favorites fav = favoritesdao.getShopcarBy2(username, idd);
		favoritesdao.deleteFavoritesById(fav.getId());
		//shopcardao.deleteShopcarById(sc.getId());
		return "success";
	}
	
	public String showUsers() throws Exception {
		UserDto dto = new UserDto();
		users = userDao.getAllUser(User.class);
		//使用dto转换list
		dto.convert(userDao.getAllUser(User.class), dtolist);
		return "list";
	}
	
	public String shopdel() {
		Shop shop = shopdao.getShopByName(shopname);
		username = shop.getUsername();
		user = userDao.getUserByName(username);
		user.setGrade("1");
		userDao.update(user);
		shopdao.deleteShopByName(shopname);
		return "success";
	}

	public String del() {
		//user = userDao.getUserByName(username);
		userDao.deleteUserByName(username);
		return "success";
	}
	public List<User> getUsers() {
		return users;
	}

	public String getShopdesc() {
		return shopdesc;
	}

	public void setShopdesc(String shopdesc) {
		this.shopdesc = shopdesc;
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
		//System.out.println("hehe");
		if(password.equals("") || password == null || username.equals("") || username == null) {
			addActionError("用户名或密码不能为空！");
			return "error";
		}
		user = userDao.getUserByName(username);
		if(user != null) {
			addActionError("已存在相同用户名用户！");
			return "error";
		}
		
		addUser();
		return "success";
	}
	
	public String userlogin() throws Exception {
		if(username == null || username.equals("") || password == null || password.equals("")) {
			return "error";
		}
		User u = userDao.isValidUser(username, password);
		if(u == null) {
			addActionError("用户名与密码不匹配！");
			return "error";
		}
		//System.out.println(username + password);
		ActionContext actionContext = ActionContext.getContext();
		if(u != null){
			System.out.println("xixixixi");
			actionContext = ActionContext.getContext();
			Map session = actionContext.getSession();
			session.put("Login", u.getGrade());
			session.put("username", username);
			//System.out.println("xixixixi");
			session.put("userdesc", u.getUserdesc());
			session.put("haveimg", u.getHaveimg());
			session.put("shopname", u.getShopname());
			//System.out.println("xixixixi");
			Shop shop = shopdao.getShopByUsername(u.getUsername());
			//System.out.println("xixixixi");
			if(shop != null)
				session.put("ishopdesc", shop.getShopdesc());
			//session.put("type", u.getGrade());
			return "success";
		} else {
			return "wrong";
		}
	}
	
	public String shopcarlist() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		System.out.println("isOnline == "+isOnline);
		if(isOnline == null || isOnline.equals("")) return "not_login";
		username = (String)session.get("username");
		user = userDao.getUserByName(username);
		if(user == null) return "not found";
		shopcarlist = shopcardao.findByName(username);
		itemlist = new ArrayList<Item>();
		for(Shopcar sc:shopcarlist) {
			Item it = itemdao.getItemById(sc.getItemid().toString());
			System.out.println("id == "+it.getId());
			itemlist.add(it);
		}
		System.out.println("size == "+itemlist.size());
		return "success";
	}
	
	public String favoriteslist() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		//System.out.println("isOnline == "+isOnline);
		if(isOnline == null || isOnline.equals("")) return "not_login";
		username = (String)session.get("username");
		user = userDao.getUserByName(username);
		if(user == null) return "not found";
		favoriteslist = favoritesdao.findByName(username);
		//shopcarlist = shopcardao.findByName(username);
		itemlist = new ArrayList<Item>();
		for(Favorites sc: favoriteslist) {
			Item it = itemdao.getItemById(sc.getItemid().toString());
			//System.out.println("id == "+it.getId());
			itemlist.add(it);
		}
		//System.out.println("size == "+itemlist.size());
		return "success";
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
		Shop shop = new Shop();
		shop.setShopname(shopname);
		shop.setGrade(5);
		shop.setShopdesc(shopdesc);
		shop.setUsername(username);
		shopdao.saveShop(shop);
		session.put("ishopdesc", shopdesc);
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
		//System.out.println(userdesc);
		session.put("userdesc", userdesc);
		userDao.update(user);
		return "success";
	}

	public ShopDao getShopdao() {
		return shopdao;
	}

	public void setShopdao(ShopDao shopdao) {
		this.shopdao = shopdao;
	}

	public Shopcar getShopcar() {
		return shopcar;
	}

	public void setShopcar(Shopcar shopcar) {
		this.shopcar = shopcar;
	}

	public ShopcarDao getShopcardao() {
		return shopcardao;
	}

	public void setShopcardao(ShopcarDao shopcardao) {
		this.shopcardao = shopcardao;
	}

	public List<Shopcar> getShopcarlist() {
		return shopcarlist;
	}

	public void setShopcarlist(List<Shopcar> shopcarlist) {
		this.shopcarlist = shopcarlist;
	}

	public List<Item> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}

	public ItemDao getItemdao() {
		return itemdao;
	}

	public void setItemdao(ItemDao itemdao) {
		this.itemdao = itemdao;
	}

	public Favorites getFav() {
		return fav;
	}

	public void setFav(Favorites fav) {
		this.fav = fav;
	}

	public FavoritesDao getFavoritesdao() {
		return favoritesdao;
	}

	public void setFavoritesdao(FavoritesDao favoritesdao) {
		this.favoritesdao = favoritesdao;
	}

	public List<Favorites> getFavoriteslist() {
		return favoriteslist;
	}

	public void setFavoriteslist(List<Favorites> favoriteslist) {
		this.favoriteslist = favoriteslist;
	}

	public List<Iorder> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Iorder> orderlist) {
		this.orderlist = orderlist;
	}

	public OrderDao getOrderdao() {
		return orderdao;
	}

	public void setOrderdao(OrderDao orderdao) {
		this.orderdao = orderdao;
	}
	
	
}
