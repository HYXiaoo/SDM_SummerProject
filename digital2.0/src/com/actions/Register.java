package com.actions;

import java.util.Map;

import com.DAOimpl.RegisterDAO;
import com.DB.RegisterDAOi;
import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport{

	private static final long serialVersionUID = 1L;
	User user;
	String repassword;
	
	

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub;
		RegisterDAOi dao=new RegisterDAO();
		Map<String, Object> session=null;
		String result=ERROR;
		if(dao.createUser(user)){ 
			result=SUCCESS;
			ActionContext actionContext=ActionContext.getContext();
			session=actionContext.getSession();
			session.put("regInfo", "×¢²á³É¹¦");
		}
		
		return result;
	}
	
}
