package model;

public class User implements java.io.Serializable {
	
	private String username; 
	private String password; 
	private String sex; 
	private String email; 
	private String userdesc; 
	private String grade; 
	private String haveimg;
	private String shopname;
	
	
	public String getHaveimg() {
		return haveimg;
	}

	public void setHaveimg(String haveimg) {
		this.haveimg = haveimg;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	/** default constructor */
	public User() {
	}

	public User(String username, String password, String sex, String email,
			String userdesc, String grade) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.userdesc = userdesc;
		this.grade = grade;
	}

	/** minimal constructor */
	public User(String username, String password, String sex, String email) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserdesc() {
		return userdesc;
	}

	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
