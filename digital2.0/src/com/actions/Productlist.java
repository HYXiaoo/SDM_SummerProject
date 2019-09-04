package com.actions;

import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import com.DAOimpl.ProductlistDAO;
import com.DB.ProductlistDAOi;
import com.entity.ProductInfo;
import com.opensymphony.xwork2.ActionSupport;

public class Productlist extends ActionSupport implements RequestAware{

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
		ProductlistDAOi dao=new ProductlistDAO();
			
		ArrayList<ProductInfo> list=dao.getProductlist();
		
		String result=ERROR;
		
		if(list.size()>0){			
			request.put("Productlist",list);
			result=SUCCESS;
		}
		
		
		return result;
	}
	
}
