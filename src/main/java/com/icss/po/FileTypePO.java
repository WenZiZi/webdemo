package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class FileTypePO implements RowMapper<FileTypePO> {

	private int fileTypeId;
	private String fileTypeName;
	
	public int getFileTypeId() {
		return fileTypeId;
	}

	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}

	public String getFileTypeName() {
		return fileTypeName;
	}

	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}

	@Override
	public FileTypePO mapRow(ResultSet rs, int index) throws Exception {
		FileTypePO po=new FileTypePO();
		po.setFileTypeId(rs.getInt("file_type_id"));
		po.setFileTypeName(rs.getString("file_type_name"));
		return po;
	}

}
