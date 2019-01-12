package javaBean;

import dao.UserDAO;
import items.Beans;

public class UserBean implements Beans{
	private String userId="343";
	private String userName="tong";
	private String userPass="123";
	private boolean isUser=false;
	
	public UserBean() {
//		super();
	}
	
	public UserBean(String userId, String userName, String userPass) {
//		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public boolean isUser() {
		return isUser;
	}
	public void setUser(boolean isUser) {
		this.isUser = isUser;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", userPass=" + userPass + ", isUser=" + isUser
				+ "]";
	}
	public boolean signIn() {
		UserDAO userdao=new UserDAO();
		UserBean user1=(UserBean)userdao.query(getUserId());//调用dao进行数据库查询
		if(user1 !=null) {
			if(user1.getUserPass().equals(this.getUserPass())) {
				user1.setUser(true);
				System.out.println(user1);
				System.out.println("欢迎"+user1.getUserName()+"的到来");
				return true;
			}else return false;
		}
		return false;
	}
}
