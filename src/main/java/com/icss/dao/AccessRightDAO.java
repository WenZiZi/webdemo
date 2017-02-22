package com.icss.dao;

import java.util.List;

import com.icss.po.AccessRightPO;

public  class AccessRightDAO extends DAOSupport<AccessRightPO>{

@Override
public void add(AccessRightPO vo) throws Exception {
	String sql="insert into access_right values(null,?)";
	db.execute(sql, vo.getAccessRightName());
	
}

@Override
public void modify(AccessRightPO vo) throws Exception {
	String sql="update access_right set access_right_name=? where access_right_id=?";
	db.execute(sql,vo.getAccessRightName(),vo.getAccessRightId());
	
}

@Override
public void delete(AccessRightPO vo) throws Exception {
	String sql="delete from access_right where access_right_name=?";
	db.execute(sql,vo.getAccessRightName());
	
}

@Override
public List<AccessRightPO> findAll() throws Exception {
	
	return db.list("select * from access_right", new AccessRightPO()); 
}

@Override
public AccessRightPO findById(AccessRightPO vo) throws Exception {
	return db.get("select * from access_right where access_right_id = ?",
	        new AccessRightPO(), vo.getAccessRightId());
}


}
