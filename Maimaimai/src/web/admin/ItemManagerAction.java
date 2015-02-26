package web.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import model.Item;
import model.Shopcar;
import model.Soncat;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDao;
import dao.ShopcarDao;
import dao.impl.ItemDaoImpl;
import dao.impl.ShopcarDaoImpl;

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
	
	private Shopcar shopcar;
	private File itemimg;
	private ShopcarDao shopcardao= new ShopcarDaoImpl();
	
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
		item.setItemcat(itemcat);
		itemdao.saveItem(item);
		//System.out.println("itemid = "+item.getId());
		id = item.getId();
		session.put("itemid", id);
		return "add";
	}
	
	public String list() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String shopname = (String)session.get("shopname");
		itemlist = itemdao.findByName(shopname);
		
		return "list";
	}
	
	public String show() {
		String idd = id.toString();
		item = itemdao.getItemById(idd);
		return "show";
	}
	public String show2() {
		String idd = id.toString();
		item = itemdao.getItemById(idd);
		return "show";
	}
	
	public String updateimg() throws IOException{
		//System.out.println("id ==" + id);
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		id = (Integer)session.get("itemid");
		item = itemdao.getItemById(id.toString());
		itemname = item.getItemname();
		System.out.println("itemname == "+itemname);
		
		String realPath = ServletActionContext.getServletContext().getRealPath("/itemimg");
		File saveFile = new File(new File(realPath),itemname + ".jpg");
		if(!saveFile.getParentFile().exists()) {
			saveFile.getParentFile().mkdirs();
		}
		FileUtils.copyFile(itemimg, saveFile);
		return "img";
	}
	
	public String addtoshopcar() {
		ActionContext actionContext = ActionContext.getContext();
		Map session = actionContext.getSession();
		String isOnline = (String)session.get("Login");
		if(isOnline == null || isOnline.equals("")) return "not_login";
		String username = (String)session.get("username");
		shopcar = new Shopcar();
		shopcar.setItemid(id);
		shopcar.setUsername(username);
		//System.out.println(username + "  hehe");
		shopcardao.saveShopcar(shopcar);
		//System.out.println(username + "  xixi");
		
		return "success";
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

	public File getItemimg() {
		return itemimg;
	}

	public void setItemimg(File itemimg) {
		this.itemimg = itemimg;
	}
	
	
	
}
