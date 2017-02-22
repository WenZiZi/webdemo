package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class UserInfoPO implements RowMapper<UserInfoPO> {

	private int userId;
	private int userTypeId;
	private String userName;
	private String userPwd;
	private String userRealName;
	
	
	
	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public int getUserTypeId() {
		return userTypeId;
	}



	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPwd() {
		return userPwd;
	}



	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}



	public String getUserRealName() {
		return userRealName;
	}



	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}



	@Override
	public UserInfoPO mapRow(ResultSet rs, int index) throws Exception {
		 UserInfoPO po=new UserInfoPO();
		 po.setUserId(rs.getInt("user_id"));
		 po.setUserName(rs.getString("user_name"));
		 po.setUserTypeId(rs.getInt("user_type_id"));
		 po.setUserRealName(rs.getString("user_real_name"));
		 po.setUserPwd(rs.getString("user_pwd"));
		return po;
	}

}
