package com.DAOimpl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.DB.TypelistDAOi;
import com.DB.baseDAO;
import com.entity.ProductType;

public class TypelistDAO extends baseDAO implements TypelistDAOi {

	@Override
	public ArrayList<ProductType> returnTypelist() {
		ArrayList<ProductType> result = new ArrayList<ProductType>();
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
		return result;
	}
	
}
