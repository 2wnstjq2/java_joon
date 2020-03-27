package jdbc;

import java.sql.Connection;

public class JdbcTest2_1 {

	public static void main(String[] args) {
		
		Connection conn = null;

		try {
		//드라이버로드
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Mysql드라이버로드완료");
		
		
		
		
		
		} catch (ClassNotFoundException e) {
		e.printStackTrace();	
		}
		
	}

}
