package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest1_1 {

	public static void main(String[] args) {
		
		Connection conn = null;

		try {
		//드라이버로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("오라클드라이버로드완료");
		
		String url = "apfhd";
		String user = "apfhd";
		String password = "apfhd";
		conn = DriverManager.getConnection(url, user, password);
		
		
		
		
		
		} catch (ClassNotFoundException e) {
		e.printStackTrace();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
