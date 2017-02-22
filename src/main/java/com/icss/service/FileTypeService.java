package com.icss.service;

import java.util.List;

import com.icss.dao.FileTypeDAO;
import com.icss.po.FileTypePO;

public class FileTypeService {

	FileTypeDAO  dao=new FileTypeDAO();
	
	public List<FileTypePO>  findAll() throws Exception{
		return dao.findAll();
	}
}
