package com.icss.dao;

import java.util.List;

import com.icss.po.UserTypePO;

public class UserTypeDAO extends DAOSupport<UserTypePO>{

	@Override
	public void add(UserTypePO vo) throws Exception {
		 String sql="insert into user_type values(null,?,?)";
		 db.execute(sql, vo.getAccessRightId(),vo.getUserTypeName());
		
	}

	@Override//
	public void modify(UserTypePO vo) throws Exception {
		String sql="update user_type set user_type_name=?,access_right_id=? " +
				"where user_type_id=? ";
		db.execute(sql,vo.getUserTypeName(),vo.getAccessRightId(),vo.getUserTypeId());
		
	}

	@Override
	public void delete(UserTypePO vo) throws Exception {
		String sql="delete from user_type where user_type_name=? ";
		db.execute(sql,vo.getUserTypeName());
		
	}

	@Override
	public List<UserTypePO> findAll() throws Exception {
		 
		return db.list("select * from user_type", new UserTypePO());
	}

	@Override
	public UserTypePO findById(UserTypePO vo) throws Exception {
		
		return db.get("select * from user_type where user_type_id = ?",
		        new UserTypePO(), vo.getUserTypeId());
	}

}