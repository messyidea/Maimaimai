package User;

import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport{

	private String username;
	private String password;
	
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

	@Override
	public String execute() throws Exception {
		//System.out.println(username);
		//System.out.println(password);
		if(username == null || username.equals("") || password == null || password.equals("")) {
			return "error";
		} else if(username.equals("admin")){
			return "success";
		} else {
			return "error";
		}
	}

	
}
