package com.icss.vo;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

/**
 * 用户表和用户类型表创建的视图
 * 视图实体类
 * @author Lydia
 *
 */
public class UserInfoVO implements RowMapper<UserInfoVO>{

	private int userId;
	private int userTypeId;
	private String userName;
	private String userPwd;
	private String userRealName;
	private String userTypeName;
	 
	
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


	public String getUserTypeName() {
		return userTypeName;
	}


	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}


	@Override
	public UserInfoVO mapRow(ResultSet rs, int index) throws Exception {
		UserInfoVO vo=new UserInfoVO();
		vo.setUserId(rs.getInt("user_id"));
		vo.setUserName(rs.getString("user_name"));
		vo.setUserPwd(rs.getString("user_pwd"));
		vo.setUserRealName(rs.getString("user_real_name"));
		vo.setUserTypeId(rs.getInt("user_type_id"));
		vo.setUserTypeName(rs.getString("user_type_name"));
		return vo;
	}
}
