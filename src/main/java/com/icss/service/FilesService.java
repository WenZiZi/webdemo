package com.icss.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.icss.dao.FilesDAO;
import com.icss.po.FilesPO;

public class FilesService {

	private FilesDAO dao=new FilesDAO();
	
	public List<FilesPO>  findAll() throws Exception{
		return dao.findAll();
	}
	
	
	public void addFile(FilesPO po) throws Exception{
		
		po.setFileDowmCount(0);
		po.setFileUploadTime(new java.sql.Date(new Date().getTime()));
		po.setFileId(UUID.randomUUID().toString());
		dao.add(po);
	}
	
	public List<FilesPO> file(int page,int rowMax) throws Exception {
		return dao.findAllByPage(page,rowMax).getRows();
	}
	public FilesPO getUriPO(FilesPO po)throws Exception{
		
		return dao.findById(po);
	}
	
	public List<FilesPO> findByTypeId(FilesPO po)throws Exception{
		
		return dao.findByTypeId(po);
	}
} 
