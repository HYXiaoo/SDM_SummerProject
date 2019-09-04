package com.actions;

import java.util.Map;


import com.DAOimpl.LoginDAO;
import com.DB.LoginDAOi;
import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	User user;
	String loginMessage;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getLoginMessage() {
		return loginMessage;
	}
	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}
	
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		LoginDAOi dao=new LoginDAO();
		Map<String, Object> session=null;
		ActionContext ac=ActionContext.getContext();
		session=ac.getSession();
		String result=ERROR;
		
		/*if(user==null){
			long currentTime=System.currentTimeMillis();
			Long startTime=(Long)session.get("start_time");
			if(startTime==null){ 
				session.put("start_time", currentTime);
				startTime=currentTime;
			}
			long runTime=(currentTime-startTime)/1000/60;
		
			if(runTime>60) setLoginMessage("已访问"+runTime+"分钟,注意休息:");
			else if(runTime==0) setLoginMessage("欢迎您:");
			else setLoginMessage("已访问"+runTime+"分钟:");
			return INPUT;
		}*/
		
		if(dao.isValid(user)){
			session.put("userName", user.getUserName());
			result=SUCCESS;
			
		}
		else loginMessage="用户名或密码错误";
			
		return result;
	}
	
}
