package model;

import java.io.Serializable;

public class Item implements Serializable {
	private Integer id;
	
	private String itemname;
	
	private Float price;
	
	private Integer num;
	
	private String shopname;
	
	private String itemdesc;
	
	private Integer grade;
	
	private Integer itemcat;
	
	

	public Integer getItemcat() {
		return itemcat;
	}

	public void setItemcat(Integer itemcat) {
		this.itemcat = itemcat;
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

	public Item(Integer id, String itemname, Float price, Integer num,
			String shopname, String itemdesc, Integer grade) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.price = price;
		this.num = num;
		this.shopname = shopname;
		this.itemdesc = itemdesc;
		this.grade = grade;
	}

	public Item() {
		super();
	}
	
	
}
