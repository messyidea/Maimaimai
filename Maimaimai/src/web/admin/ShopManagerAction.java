package web.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ShopDao;
import dao.impl.ShopDaoImpl;
import model.Shop;

public class ShopManagerAction extends ActionSupport{
	private String shopname;
	
	private String shopdesc;
	
	private String username;
	
	private Integer grade;
	
	private ShopDao shopdao = new ShopDaoImpl();
	
	List<Shop> shoplist;
	public String list(){
		shoplist = shopdao.getAllShop(Shop.class);
		return "list";
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopdesc() {
		return shopdesc;
	}
	public void setShopdesc(String shopdesc) {
		this.shopdesc = shopdesc;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public ShopDao getShopdao() {
		return shopdao;
	}
	public void setShopdao(ShopDao shopdao) {
		this.shopdao = shopdao;
	}
	public List<Shop> getShoplist() {
		return shoplist;
	}
	public void setShoplist(List<Shop> shoplist) {
		this.shoplist = shoplist;
	}
	
	
	

}
