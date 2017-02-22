package com.icss.service;

import java.util.List;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;

public class UserInfoService {

	private UserInfoDAO dao=new UserInfoDAO(); 
	
	/**
	 * 用户登录信息
	 * @param userName  用户名
	 * @param userPwd   密码
	 * @return
	 * @throws Exception
	 */
	public UserInfoPO login(String userName,String userPwd) throws Exception{
		UserInfoPO po=null;
		try {
			po=dao.findByUserName(userName,userPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return po;
	}
	
	
	public List<UserInfoPO> findAll() throws Exception{
		return dao.findAll();
	}
	
	public void add(UserInfoPO po) throws Exception{
		dao.add(po);
	}
	
	public UserInfoPO exist(String userName) throws Exception {
		UserInfoPO po=null;
		try {
			po=dao.findByUserNameExist(userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return po;
	}
	public void modify(UserInfoPO po)throws Exception{
		dao.modify(po);
	}
	public boolean resetuserinfo(UserInfoPO po) {
		
		try {
			dao.modify(po);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}

	}
	
	public void delete(UserInfoPO user) throws Exception{
		
		dao.delete(user);	
	}
}
