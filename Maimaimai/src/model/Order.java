package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Order implements Serializable {
	private Integer id;
	private String username;
	private Integer itemid;
	private Timestamp buytime;
	private Integer num;
	private Integer grade;
	private String orderdesc;
	private String shopname;
	
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
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
	public Order(Integer id, String username, Integer itemid,
			Timestamp buytime, Integer num, Integer grade, String orderdesc) {
		super();
		this.id = id;
		this.username = username;
		this.itemid = itemid;
		this.buytime = buytime;
		this.num = num;
		this.grade = grade;
		this.orderdesc = orderdesc;
	}
	public Order() {
		super();
	}
	
	
	
	
}
