package com.DAOimpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.DB.RegisterDAOi;
import com.DB.baseDAO;
import com.entity.User;

public class RegisterDAO extends baseDAO implements RegisterDAOi {

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		/*String sql="insert into users values ";
		sql+="(null,?,?,?,?,?,?,?,?,?,?,?)";
		boolean result=false;
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPASSWORD());
			stmt.setString(3, user.getRealname());
			stmt.setString(4, user.getSex());
			stmt.setString(5, user.getAddress());
			stmt.setString(6, user.getQuestion());
			stmt.setString(7, user.getAnswer());
			stmt.setString(8, user.getEmail());
			stmt.setString(9, user.getFavorite());
			stmt.setInt(10, 2);
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal=Calendar.getInstance();
			cal.add(Calendar.DATE, 0);
			stmt.setDate(11, Date.valueOf(sdf.format(cal.getTime())));
			
			stmt.executeUpdate();
			result=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("User creating statement runs failed");
			System.out.println(stmt.toString());
			e.printStackTrace();
		}finally{
			closeTemps();
		}
		
		return result;*/			
		User regUser=null;
		try {
			regUser=(User)user.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("注册信息拷贝失败");
			return false;
		}
		regUser.setScore(2);
		//设置注册日期
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		regUser.setRegDate(sdf.format(cal.getTime()));
		//更新表
		session.save(regUser);
		transaction.commit();
		
		return true;	
	}

}
