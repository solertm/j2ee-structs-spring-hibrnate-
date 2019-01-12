package water.ustc.action;

import java.util.Random;

import items.Beans;
import javaBean.UserBean;

public class LoginAction {
	 private Beans user;
	 
		public Object getuser() {
			return user;
		}
//		注入object
		public void setuser(Object user) {
			this.user = (Beans)user;
		}

		public String handleLogin() {
			if(user.signIn()) {
				return "success";
			}
			else return "failure";
			
		}

		@Override
		public String toString() {
			return "LoginAction [user=" + user + "]";
		}
		
}
