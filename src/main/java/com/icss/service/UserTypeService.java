package com.icss.service;
import java.util.List;

import com.icss.dao.UserTypeDAO;
import com.icss.po.UserTypePO;
public class UserTypeService {
	private UserTypeDAO dao=new UserTypeDAO();
	
	public List<UserTypePO> findAll() throws Exception{
		return dao.findAll();
	}
}
