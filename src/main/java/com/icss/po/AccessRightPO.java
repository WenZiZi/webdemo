package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class AccessRightPO implements RowMapper<AccessRightPO>{

	private int accessRightId;
	private String accessRightName;
	
	
	public int getAccessRightId() {
		return accessRightId;
	}


	public void setAccessRightId(int accessRightId) {
		this.accessRightId = accessRightId;
	}


	public String getAccessRightName() {
		return accessRightName;
	}


	public void setAccessRightName(String accessRightName) {
		this.accessRightName = accessRightName;
	}


	@Override
	public AccessRightPO mapRow(ResultSet rs, int index) throws Exception {
		AccessRightPO po=new AccessRightPO();
		po.setAccessRightId(rs.getInt("access_right_id"));
		po.setAccessRightName(rs.getString("access_right_name"));
		return po;
	}


	 

}
