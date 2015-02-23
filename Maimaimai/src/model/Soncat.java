package model;

public class Soncat implements java.io.Serializable{
	private Integer id;
	private String name;
	private Integer fa;
	public Soncat(){
		
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
	public Integer getFa() {
		return fa;
	}
	public void setFa(Integer fa) {
		this.fa = fa;
	}
	public Soncat(Integer id, String name, Integer fa) {
		super();
		this.id = id;
		this.name = name;
		this.fa = fa;
	}
	
	
}
