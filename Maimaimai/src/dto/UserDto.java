package dto;

import java.util.List;


import model.User;

public class UserDto extends User{
	//public String gradeName;
	
	public void convert(User user,UserDto dto){
		dto.setEmail(user.getEmail());
		dto.setGrade(user.getGrade());
		dto.setPassword(user.getPassword());
		dto.setSex(user.getSex());
		dto.setUserdesc(user.getUserdesc());
		dto.setUsername(user.getUsername());
		dto.setHaveimg(user.getHaveimg());
		//dto.setGradeName(GradeInstance.getInstance().getByKey(user.getGrade()));
	}
	
	public void convert(List<User> list,List<UserDto> dtolist){
		for(int i=0;i<list.size();i++){
			UserDto dto = new UserDto();
			this.convert(list.get(i), dto);
			dtolist.add(dto);
		}	
	}

	/*public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}*/

}
