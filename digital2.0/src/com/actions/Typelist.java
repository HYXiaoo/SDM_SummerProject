package com.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.DAOimpl.BrandlistDAO;
import com.DAOimpl.TypelistDAO;
import com.DB.BrandlistDAOi;
import com.DB.TypelistDAOi;
import com.auxiliary.Type_Brand;
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
		BrandlistDAOi dao2=new BrandlistDAO();
		
		ArrayList<Type_Brand> displayList=new ArrayList<Type_Brand>();		
		ArrayList<ProductType> list=dao.returnTypelist();
		
		String result=ERROR;
		Iterator<ProductType> it=list.iterator();
		
		while(it.hasNext()){
			ProductType t=(ProductType)it.next();
			Type_Brand tb=new Type_Brand();
			tb.setType(t);
			tb.setBrandList(dao2.getBrandlist(t));
			displayList.add(tb);
		}
		
		if(displayList.size()>0){			
			request.put("Typelist",displayList);
			result=SUCCESS;
		}
		
		//Iterator<Type_Brand> iterator=displayList.iterator();
		//Type_Brand tbt=(Type_Brand)iterator.next();
		//System.out.println(tbt.getBrandList());
		
		return result;
	}
	
}
