package com.DAOimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.DB.TypelistDAOi;
import com.DB.baseDAO;
import com.entity.ProductType;

public class TypelistDAO extends baseDAO implements TypelistDAOi {

	@Override
	public ArrayList<ProductType> returnTypelist() {
		/*ArrayList<ProductType> result = new ArrayList<ProductType>();
		try {
			stmt=conn.prepareStatement("SELECT * FROM product_type");
			rSet=stmt.executeQuery();
			while(rSet.next()){
				ProductType type=new ProductType();
				type.setId(rSet.getInt("id"));
				type.setName(rSet.getString("name"));
				result.add(type);
			}
		} catch (SQLException e) {
			System.out.println("Type selection error");
			e.printStackTrace();
		} finally {
			closeTemps();
		}
		return result;*/
		ArrayList<ProductType> result = new ArrayList<ProductType>();
		String hql="select new ProductType(pt.name) from ProductType as pt";
		Query query=session.createQuery(hql);
		query.setCacheable(true);
		List list=query.list();
		Iterator it=list.iterator();
		while(it.hasNext()){
			ProductType type=(ProductType)it.next();
			result.add(type);
		}
		return result;
	}
}
