package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorizationInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invo) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session=invo.getInvocationContext().getSession();
		if(session.get("userName")==null){
			return Action.ERROR;
		}
		else return invo.invoke();
	}
	
}
