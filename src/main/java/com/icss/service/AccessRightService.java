package com.icss.service;

import java.util.List;

import com.icss.dao.AccessRightDAO;
import com.icss.po.AccessRightPO;

public class AccessRightService {

	private AccessRightDAO dao=new AccessRightDAO();
	
	/**
	 * 查看所有进入权限
	 * @return
	 * @throws Exception
	 */
	public List<AccessRightPO> findALl() throws Exception{
		return dao.findAll();
	}
}
