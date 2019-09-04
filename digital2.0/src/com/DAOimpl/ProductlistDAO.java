package com.DAOimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.DB.ProductlistDAOi;
import com.DB.baseDAO;
import com.entity.ProductInfo;

public class ProductlistDAO extends baseDAO implements ProductlistDAOi {

	@Override
	public ArrayList<ProductInfo> getProductlist() {
		// TODO Auto-generated method stub
		ArrayList<ProductInfo> result=new ArrayList<ProductInfo>();
		String hql="from ProductInfo as pi";
		Query query=session.createQuery(hql);
		query.setCacheable(true);
		List list=query.list();
		Iterator it=list.iterator();
		while(it.hasNext()){
			result.add((ProductInfo)it.next());
		}
		
		return result;
	}

}
