package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 访问数据库工具类
 * @author Administrator
 *
 */
public class DBUtil {
	//驱动
	private static final String driver="com.mysql.jdbc.Driver";
	//url
	private static final String url="jdbc:mysql://localhost/logistics?useUnicode=true&characterEncoding=utf-8";
	//用户名
	private static final String user="root";
	//密码
	private static final String password="root";
	//核心接口建立的对象
	protected Connection conn=null;//连接对象
	protected PreparedStatement pstmt=null;//预编译执行sql语句的对象
	protected ResultSet rs=null;//结果集
	//获取连接对象
	public Connection getConnection() {
		if(conn==null) {
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	//释放资源
	public void closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs) throws SQLException {
		//6.释放资源
		try {
			if(rs!=null)
				rs.close();
		}finally{
			try {
				if(pstmt!=null)
					pstmt.close();
			}finally {
				if(conn!=null)
					conn.close();
			}
		}
	}
	/**
	 * 增删改公共方法,返回影响的行数
	 * @return
	 * @throws SQLException
	 */
	public int executeUpdate(String sql,Object... objs) throws SQLException {
		int result=0;
		try {
			pstmt = getConnection().prepareStatement(sql);
			if (objs != null) {//有参数就循环读取设置参数
				for (int i = 0; i < objs.length; i++) {
					pstmt.setObject(i + 1, objs[i]);
				}
			}
			result = pstmt.executeUpdate();
		} finally {
			closeAll(conn, pstmt, null);
		}
		return result;
	}
	//查询公共方法:根据sql语句和参数获得结果集
	public ResultSet executeQuery(String sql,Object... objs ) throws SQLException {
		pstmt = getConnection().prepareStatement(sql);
		if (objs != null) {//有参数就循环读取设置参数
			for (int i = 0; i < objs.length; i++) {
				pstmt.setObject(i + 1, objs[i]);
			}
		}
		rs=pstmt.executeQuery();
		return rs;
	}

}
