package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KJG","kjg");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement st, Connection con) {
		if(st != null) {
			try {
				st.close();
			}catch (Exception e) {
				
			}finally {
				
			}
		}
		if(con != null) {
			try {
				st.close();
			}catch (Exception e) {
				
			}finally {
				
			}
		}
	}
	
	public static void close(ResultSet rs,PreparedStatement st, Connection con) {
		if(rs != null) {
			try {
				rs.close();
			}catch (Exception e) {
				
			}finally {
				
			}
		
		}
		close(st, con);
	}
}
