package com.icss.dao;

import java.util.List;

import com.icss.po.UserInfoPO;

public class UserInfoDAO extends DAOSupport<UserInfoPO> {

	@Override
	public void add(UserInfoPO vo) throws Exception {
		 String sql="insert into user_info values(null,?,?,?,?)";
		 db.execute(sql, vo.getUserTypeId(),vo.getUserName(),vo.getUserPwd(),vo.getUserRealName());	
	}

	@Override
	public void modify(UserInfoPO vo) throws Exception {
		
		String sql="update user_info set user_type_id=?,user_name=?,user_pwd=?,user_real_name=?where user_id=?";
		db.execute(sql,vo.getUserTypeId(),vo.getUserName(),vo.getUserPwd(),vo.getUserRealName(),vo.getUserId());
	}
	
	
	public void modifyPwd(UserInfoPO vo) throws Exception{
		String sql="update user_info set user_pwd=? where user_id=?";
		db.execute(sql,vo.getUserPwd(),vo.getUserId());
	}
	

	@Override
	public void delete(UserInfoPO vo) throws Exception {
		
		String sql="delete from user_info where user_id=?";
		db.execute( sql, vo.getUserId());
	}

	@Override
	public List<UserInfoPO> findAll() throws Exception {
		
		return db.list("select * from user_info", new UserInfoPO());
	}

	@Override
	public UserInfoPO findById(UserInfoPO vo) throws Exception {
	 
		return db.get("select * from user_info where user_id =? ", new UserInfoPO(), vo.getUserId());
	}
	
	/**
	 * 根据用户名和密码查询
	 * @param userName
	 * @param userPwd
	 * @return
	 * @throws Exception
	 */
	public UserInfoPO findByUserName(String userName,String userPwd)throws Exception{
		return db.get("select * from user_info where user_name=? and user_pwd = ?", new UserInfoPO(),userName, userPwd);
	}
	
	public UserInfoPO  findByUserNameExist(String userName) throws Exception {
		return db.get("select * from user_info where user_name=?", new UserInfoPO(),userName);
	}
	
	
	
 
}
