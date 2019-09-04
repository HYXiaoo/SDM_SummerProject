package com.DAOimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.DB.BrandlistDAOi;
import com.DB.baseDAO;
import com.entity.ProductType;

public class BrandlistDAO extends baseDAO implements BrandlistDAOi {

	@Override
	public ArrayList<String> getBrandlist(ProductType type) {
		// TODO Auto-generated method stub
		ArrayList<String> result=new ArrayList<String>();
		String hql="select distinct pi.brand from ProductInfo as pi inner join pi.type as pt where pt.name=?";
		Query query=session.createQuery(hql);
		query.setString(0, type.getName());
		query.setCacheable(true);
		List list=query.list();
		Iterator it=list.iterator();
		while(it.hasNext()){
			result.add((String)it.next());
		}
		return result;
	}

}
