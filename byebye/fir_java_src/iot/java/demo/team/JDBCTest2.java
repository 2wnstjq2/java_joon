package iot.java.demo.team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest2 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		
		try {
			// 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Mysql 드라이버 로드 완료");
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
			String user = "kite"; //root
			String pw = "test1111"; //admin
			
			conn= DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("데이터베이스에 접속했습니다.");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
