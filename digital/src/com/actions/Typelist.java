package com.actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.DAOimpl.TypelistDAO;
import com.DB.TypelistDAOi;
import com.entity.ProductType;
import com.opensymphony.xwork2.ActionSupport;

public class Typelist extends ActionSupport implements RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<String, Object> request;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	
	public String getList(){
		TypelistDAOi dao=new TypelistDAO();
		ArrayList<ProductType> list=dao.returnTypelist();
		String result=ERROR;
		if(list.size()>0){
			request.put("Typelist",list);
			result=SUCCESS;
		}
		return result;
	}
	
}
