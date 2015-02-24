package model;

import java.io.Serializable;

public class Shop implements Serializable {
	private String shopname;
	
	private String shopdesc;
	
	private String username;
	
	private Integer grade;

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

	public Shop(String shopname, String shopdesc, String username, Integer grade) {
		super();
		this.shopname = shopname;
		this.shopdesc = shopdesc;
		this.username = username;
		this.grade = grade;
	}

	public Shop() {
		super();
	}
	
	
}
