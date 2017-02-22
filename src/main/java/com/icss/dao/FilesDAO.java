package com.icss.dao;

import java.util.List;

import com.icss.po.FilesPO;
import com.icss.vo.PageVO;

public class FilesDAO extends DAOSupport<FilesPO>{

	@Override
	public void add(FilesPO vo) throws Exception {
		String sql="insert into files  values(?,?,?,?,?,?,?,?,?,?)";
		 db.execute(sql, vo.getFileId(),vo.getAccessRightId(),vo.getFileTypeId(),vo.getFileName(),vo.getFileUploadTime(),vo.getFileSize(),vo.getFileUri(),vo.getFileDowmCount(),vo.getUserId(),vo.getFileContent());
		
	}

	@Override
	public void modify(FilesPO vo) throws Exception {
		String sql="update files set file_name=?,file_upload_time=?," +
				   "file_size=?,file_uri=?,file_dowm_count=?,file_type_id=?," +
				   "access_right_id=? where file_id=? ";
		db.execute(sql,vo.getFileName(),vo.getFileUploadTime(),
				   vo.getFileSize(),vo.getFileUri(),vo.getFileDowmCount(),
				   vo.getFileTypeId(),vo.getAccessRightId(),vo.getFileId());
	}

	@Override
	public void delete(FilesPO vo) throws Exception {
		String sql="delete from files where file_id=?";
		db.execute(sql,vo.getFileId());
		
	}

	@Override
	public List<FilesPO> findAll() throws Exception {
		return db.list("select * from files", new FilesPO()); 
	}

	@Override
	public FilesPO findById(FilesPO vo) throws Exception {
		return db.get("select * from files where file_id = ?",
		        new FilesPO(), vo.getFileId());
	}

	public PageVO<FilesPO>  findAllByPage(int page,int rowMax) throws Exception{
		
		return page("select * from files", page, rowMax, new FilesPO());
		
	}
	public List<FilesPO> findByTypeId(FilesPO vo) throws Exception {
		 
		return db.list("select * from files where file_type_id =? ", new FilesPO(), vo.getFileTypeId());
	}

}
