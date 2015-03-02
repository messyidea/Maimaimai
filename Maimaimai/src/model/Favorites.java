package model;

import java.io.Serializable;

public class Favorites implements Serializable {
	private Integer id;
	private String username;
	private Integer itemid;
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
	public Favorites(Integer id, String username, Integer itemid) {
		super();
		this.id = id;
		this.username = username;
		this.itemid = itemid;
	}
	public Favorites() {
		super();
	}
	
	
	
}
