package com.icss.dao;

import java.util.List;

import com.icss.po.FileTypePO;

public class FileTypeDAO extends DAOSupport<FileTypePO>{

	@Override
	public void add(FileTypePO vo) throws Exception {
		String sql="insert into file_type values(null,?)";
		db.execute(sql, vo.getFileTypeName());
		
	}

	@Override
	public void modify(FileTypePO vo) throws Exception {
		
		String sql="update file_type set file_type_name=? where file_type_id=?";
		db.execute(sql,vo.getFileTypeName(),vo.getFileTypeId());
	}

	@Override
	public void delete(FileTypePO vo) throws Exception {
		String sql="delete from file_type where file_type_name=?";
		db.execute(sql,vo.getFileTypeName());
	}

	@Override
	public List<FileTypePO> findAll() throws Exception {
		
		return db.list("select * from file_type", new FileTypePO()); 
	}

	@Override
	public FileTypePO findById(FileTypePO vo) throws Exception {
		 
		return db.get("select * from file_type where file_type_id = ?",
				        new FileTypePO(), vo.getFileTypeId());
	}

	

}

