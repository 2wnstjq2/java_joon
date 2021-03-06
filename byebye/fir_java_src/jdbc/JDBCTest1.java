package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 완료");
			
			// 호스트, port, db name
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			// 계정
			String user = "scott";
			// 비밀번호
			String pw = "tiger";
			
			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("데이터베이스에 정상적으로 접속되었습니다.");
			
			// 3. 데이터의 검색과 변경처리 : select / DML
			
			
			// 3.2 insert 를 통해서 부서정보를 입력처리
			// PreparedStatement 생성 : 객체 생성 시에 sql 문을 완성
			
//			String sql2 = "insert into "
//					+ " dept (deptno, dname, loc) "
//					+ "    values (?,?,?)";
//			PreparedStatement pstmt = conn.prepareStatement(sql2);
//			// 데이터 메핑
//			pstmt.setInt(1, 50);
//			pstmt.setString(2, "DEV");
//			pstmt.setString(3, "SEOUL");
//			
//			int rCnt = pstmt.executeUpdate();
//			
//			if(rCnt > 0) {
//				System.out.println("데이터 입력이 정상 처리되었습니다.");
//			} else {
//				System.out.println("입력이 되지 않았습니다. 관리자에게 문의하세요.");
//			}
			
			// insert intodept (deptno, dname, loc) values (50, 'DEV', 'SEOUL');
			
			
			
			// 입력 메서드 호출
			//insertDept(conn, 60, "design", "jeju");
			//insertDept(conn, 70, "design", null);
			insertDept(conn, 80, null, null);
			
			
			
			
			// 3.2 dept 테이블의 내용을 출력
			// Statement 객체 생성
			
			Statement stmt = conn.createStatement();
			
			String sql1 = "select * from dept ";
			
			ResultSet rs = stmt.executeQuery(sql1);
			
			while(rs.next()) {
				
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				
				System.out.println(deptno + " | " + dname + " | " + loc);
			}
			
			rs.close();
			stmt.close();
			
			//pstmt.close();
			
			conn.close();
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("입력오류");
		}
		
		
	}
	
	// DB 부서정보 입력
	public static void insertDept(
			Connection conn, 
			int deptno, 
			String dname, 
			String loc) throws SQLException {
		
		// SQL
		String sql = "insert into "
				+ " dept (deptno, dname, loc) "
				+ "    values (?,?,?)";
		
		// PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// Mapping
		pstmt.setInt(1, deptno);
		pstmt.setString(2, dname);
		pstmt.setString(3, loc);
		//executeUpdate
		int rCnt = pstmt.executeUpdate();
		

		if(rCnt > 0) {
			System.out.println("데이터 입력이 정상 처리되었습니다.");
		} else {
			System.out.println("입력이 되지 않았습니다. 관리자에게 문의하세요.");
		}
		
		// pstmt.close
		pstmt.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
