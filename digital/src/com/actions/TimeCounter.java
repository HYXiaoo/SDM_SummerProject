package com.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TimeCounter extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String timeMessage;
	
	
	public String getTimeMessage() {
		return timeMessage;
	}


	public void setTimeMessage(String timeMessage) {
		this.timeMessage = timeMessage;
	}


	@Override
	public String execute() throws Exception {
		ActionContext ac=ActionContext.getContext();
		Map<String,Object> session=ac.getSession();
		
		long currentTime=System.currentTimeMillis();
		Long startTime=(Long)session.get("start_time");
		if(startTime==null){ 
			session.put("start_time", currentTime);
			startTime=currentTime;
		}
		long runTime=(currentTime-startTime)/1000/60;
		
		if(runTime>60) setTimeMessage("已访问"+runTime+"分钟,注意休息:");
		else if(runTime==0) setTimeMessage("欢迎您:");
		else setTimeMessage("已访问"+runTime+"分钟:");
		
		session.put("TimeMessage", timeMessage);
		return SUCCESS;
	}
}
