package web.admin;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.mail.Session;

import model.Iorder;
import model.Item;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDao;
import dao.OrderDao;
import dao.impl.ItemDaoImpl;
import dao.impl.OrderDaoImpl;

public class OrderManagerAction extends ActionSupport{
	private Integer id;
	private String username;
	private Integer itemid;
	private Timestamp buytime;
	private Integer num;
	private Integer grade;
	private String orderdesc;
	private String shopname;
	private String status;
	private String useridea;
	private Iorder order;
	String idd;
	private OrderDao orderdao= new OrderDaoImpl();
	private ItemDao itemdao = new ItemDaoImpl();
	List<Iorder> orderlist;
	List<Item> itemlist;
	List<String> itemnames;
	
	public String getIdd() {
		return idd;
	}

	public void setIdd(String idd) {
		this.idd = idd;
	}

	public String buy() {
		//System.out.println("buy id == "+id);
		//System.out.println("idididid == "+id);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		username = (String)session.get("username");
		order = new Iorder();
		order.setUsername(username);
		order.setItemid(id);
		Item item = itemdao.getItemById(id.toString());
		item.setNum(item.getNum() - num);
		itemdao.update(item);
		//System.out.println("itemid == " + id);
		order.setBuytime(new Timestamp(System.currentTimeMillis()));
		order.setNum(num);
		order.setStatus("1");
		order.setShopname(item.getShopname());
		//System.out.println("hehehe");
		order.setOrderdesc(orderdesc);
		orderdao.saveItem(order);
		//order.setOrderdesc(orderdesc);
		//System.out.println("xixixi");
		return "success";
	}
	
	public String list() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		String uname = (String)session.get("username");
		orderlist = orderdao.findByName(uname);
		//itemlist = new ArrayList<Item>();
		itemnames = new ArrayList<String>();
		for(Iorder or:orderlist) {
			Item item = itemdao.getItemById(or.getItemid().toString());
			itemnames.add(item.getItemname());
			//itemlist.add(item);
			//System.out.println(or.getItemid());
			//System.out.println(or.getOrderdesc());
			//System.out.println(or.getBuytime());
		}
		return "list";
	}
	
	public String list2() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		String shopname = (String)session.get("shopname");
		orderlist = orderdao.getOrderByShopname(shopname);
		//itemlist = new ArrayList<Item>();
		itemnames = new ArrayList<String>();
		for(Iorder or:orderlist) {
			Item item = itemdao.getItemById(or.getItemid().toString());
			itemnames.add(item.getItemname());
			//itemlist.add(item);
			//System.out.println(or.getItemid());
			//System.out.println(or.getOrderdesc());
			//System.out.println(or.getBuytime());
		}
		return "list";
	}
	
	public String adds() {
		System.out.println("idd == "+idd);
		order = orderdao.getOrderById(idd);
		status = order.getStatus();
		if(status.equals("0")) {
			order.setStatus("1");
		} else if(status.equals("1")) {
			order.setStatus("2");
		} else if(status.equals("2")) {
			order.setStatus("3");
		} else {
			order.setStatus("4");
		}
		orderdao.update(order);
		return "success";
	}
	
	public String pingjia() {
		//System.out.println("idididid == "+id);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		id = (Integer)session.get("orderid");
		order = orderdao.getOrderById(id.toString());
		//order.setOrderdesc(orderdesc);
		order.setUseridea(orderdesc);
		orderdao.update(order);
		return "success";
	}
	
	public String addid() {
		System.out.println("idididid2 == "+id);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		session.put("orderid", id);
		return "success";
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Timestamp getBuytime() {
		return buytime;
	}

	public void setBuytime(Timestamp buytime) {
		this.buytime = buytime;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getOrderdesc() {
		return orderdesc;
	}

	public void setOrderdesc(String orderdesc) {
		this.orderdesc = orderdesc;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUseridea() {
		return useridea;
	}

	public void setUseridea(String useridea) {
		this.useridea = useridea;
	}

	public OrderDao getOrderdao() {
		return orderdao;
	}

	public void setOrderdao(OrderDao orderdao) {
		this.orderdao = orderdao;
	}

	public List<Iorder> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Iorder> orderlist) {
		this.orderlist = orderlist;
	}

	public Iorder getOrder() {
		return order;
	}

	public void setOrder(Iorder order) {
		this.order = order;
	}

	public ItemDao getItemdao() {
		return itemdao;
	}

	public void setItemdao(ItemDao itemdao) {
		this.itemdao = itemdao;
	}

	public List<Item> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}

	public List<String> getItemnames() {
		return itemnames;
	}

	public void setItemnames(List<String> itemnames) {
		this.itemnames = itemnames;
	}
	
	
}
