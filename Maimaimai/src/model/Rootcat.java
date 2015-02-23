package model;

public class Rootcat implements java.io.Serializable{
	public Integer id;
	
	public String name;
	
	public Integer count;
	
	public Rootcat(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Rootcat(Integer id, String name, Integer count) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
	}
	
	
	
}
