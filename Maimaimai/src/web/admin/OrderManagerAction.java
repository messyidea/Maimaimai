package web.admin;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

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
	private OrderDao orderdao= new OrderDaoImpl();
	private ItemDao itemdao = new ItemDaoImpl();
	List<Iorder> orderlist;
	
	public String buy() {
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
		//System.out.println("itemid == " + id);
		order.setBuytime(new Timestamp(System.currentTimeMillis()));
		order.setNum(1);
		order.setStatus("1");
		order.setShopname(item.getShopname());
		//System.out.println("hehehe");
		orderdao.saveItem(order);
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
		for(Iorder or:orderlist) {
			System.out.println(or.getItemid());
			System.out.println(or.getOrderdesc());
			System.out.println(or.getBuytime());
		}
		return "list";
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
	
	
}
