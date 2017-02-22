package com.icss.po;

import java.sql.Date;
import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class FilesPO implements RowMapper<FilesPO>{

	private String fileId;
	private int accessRightId;
	private int fileTypeId;
	private String fileName;
	private Date fileUploadTime;
	private long fileSize;
	private String fileUri;
	private long fileDowmCount;
	private int userId;
	private String fileContent;
	
	
	public String getFileContent() {
		return fileContent;
	}


	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFileId() {
		return fileId;
	}


	public void setFileId(String fileId) {
		this.fileId = fileId;
	}


	public int getAccessRightId() {
		return accessRightId;
	}


	public void setAccessRightId(int accessRightId) {
		this.accessRightId = accessRightId;
	}


	public int getFileTypeId() {
		return fileTypeId;
	}


	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public Date getFileUploadTime() {
		return fileUploadTime;
	}


	public void setFileUploadTime(Date fileUploadTime) {
		this.fileUploadTime = fileUploadTime;
	}


	public long getFileSize() {
		return fileSize;
	}


	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}


	public String getFileUri() {
		return fileUri;
	}


	public void setFileUri(String fileUri) {
		this.fileUri = fileUri;
	}


	public long getFileDowmCount() {
		return fileDowmCount;
	}


	public void setFileDowmCount(long fileDowmCount) {
		this.fileDowmCount = fileDowmCount;
	}


	public FilesPO mapRow(ResultSet rs, int index) throws Exception {
		FilesPO po=new FilesPO();
		po.setFileId(rs.getString("file_id"));
		po.setAccessRightId(rs.getInt("access_right_id"));
		po.setFileTypeId(rs.getInt("file_type_id"));
		po.setFileName(rs.getString("file_name"));
		po.setFileUploadTime(rs.getDate("file_upload_time"));
		po.setFileSize(rs.getLong("file_size"));
		po.setFileUri(rs.getString("file_uri"));
		po.setFileDowmCount(rs.getLong("file_dowm_count"));
		po.setUserId(rs.getInt("user_Id"));
		po.setFileContent(rs.getString("file_content"));
		return po;
	}
}
