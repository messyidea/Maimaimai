package web.admin;

import java.util.List;
import java.util.Map;

import model.Item;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDao;
import dao.impl.ItemDaoImpl;

public class ItemManagerAction extends ActionSupport{
	private Integer id;
	
	private String itemname;
	
	private Float price;
	
	private Integer num;
	
	private String shopname;
	
	private String itemdesc;
	
	private Integer grade;
	
	private Integer itemcat;
	
	private List<Item> itemlist;
	
	private ItemDao itemdao = new ItemDaoImpl();
	
	private Item item;
	
	public String add() {
		item = new Item();
		item.setGrade(5);
		item.setItemdesc(itemdesc);
		item.setItemname(itemname);
		item.setNum(num);
		item.setPrice(price);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String shopname = (String)session.get("shopname");
		item.setShopname(shopname);
		itemdao.saveItem(item);
		return "add";
	}
	
	public String list() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String shopname = (String)session.get("shopname");
		itemlist = itemdao.findByName(shopname);
		return "list";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getItemdesc() {
		return itemdesc;
	}

	public void setItemdesc(String itemdesc) {
		this.itemdesc = itemdesc;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getItemcat() {
		return itemcat;
	}

	public void setItemcat(Integer itemcat) {
		this.itemcat = itemcat;
	}
	
	
	
}
