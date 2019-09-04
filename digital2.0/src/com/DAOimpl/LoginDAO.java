package com.DAOimpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;

import com.DB.LoginDAOi;
import com.DB.baseDAO;
import com.entity.User;

public class LoginDAO extends baseDAO implements LoginDAOi {

	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		/*String sql="select * from users where userName=? and PASSWORD=?";
		boolean result=false;
		//if(user==null) return false;
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPASSWORD());
			rSet=stmt.executeQuery();
			if(rSet.next()) result=true;
		} catch (SQLException e) {
			System.out.println("Login validation sql statement execute error");
			System.out.println(stmt.toString());
		}finally{
			closeTemps();
		}
		return result;*/
		String hql="from User as u where u.userName=? and u.PASSWORD=?";
		boolean result=false;
		if(user==null) return false;
		Query query=session.createQuery(hql);
		query.setCacheable(true);
		query.setString(0, user.getUserName());
		query.setString(1, user.getPASSWORD());
		List list=query.list();
		Iterator it=list.iterator();
		if(it.hasNext()) result=true;
		return result;
	}

	public LoginDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
