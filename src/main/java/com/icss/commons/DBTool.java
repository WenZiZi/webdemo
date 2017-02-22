package com.icss.commons;
import java.sql.*;
import java.util.List;

public class DBTool {

	private Connection conn=null;
	//第一步：导入数据库包
	
	//第二步：选择连接方式：纯java驱动
	
	//第三步:加载驱动
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//第四步：获取数据连接对象
	public Connection getConn(){
		//url路径：jdbc:mysql:主机IP:数据库端口号/数据库名称
		try {
			conn=DriverManager.getConnection("jdbc:mysql://10.10.54.233:3306/fsp", "root","oppein123!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public List findAll(){
		
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from file_type";
		try {
			//第五步：获取预处理对象
			pstmt=conn.prepareStatement(sql);
			//第六步：获取结果集
			rs=pstmt.executeQuery();
			//pstmt.executeUpdate();
			
 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//第七步：关闭结果集
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//第八步：关闭预处理对象
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//第九步：关闭数据库连接对象
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return  null;
	}
	
	
}
