package emp_CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoM {

	private DaoM() {}
	
	private static DaoM dao = new DaoM();
	
	public static DaoM getInstance() {
		return dao;
	}
	
	public void listEmp(Connection conn) throws SQLException {
		Statement stmt = conn.createStatement();
		String sqlE = "select * from emp ";
		ResultSet rs = stmt.executeQuery(sqlE);
		
		System.out.println("부서(EMP) 리스트");
		System.out.println("----------------------------");
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			String hiredate = rs.getString(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			
			System.out.println(empno + " | " + ename + " | " + job + " | " + mgr + " | " 
			+ hiredate + " | " + sal + " | " + comm + " | " + deptno);
		}
			System.out.println("----------------------------");
			
			rs.close();
			stmt.close();
		
	}
	
	//insert
	public void insertEmp(
			Connection conn, 
			int empno, 
			String ename, 
			String job,
			int mgr,
			String hiredate,
			int sal,
			int comm,
			int deptno) throws SQLException {
		
		String sql = "insert into "
				+ " emp (empno, ename, job, mgr, hiredate, sal, comm, deptno) "
				+ "    values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, empno);
		pstmt.setString(2, ename);
		pstmt.setString(3, job);
		pstmt.setInt(4, mgr);
		pstmt.setString(5, hiredate);
		pstmt.setInt(6, sal);
		pstmt.setInt(7, comm);
		pstmt.setInt(8, deptno);
		
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
		
	//edit 선택의 조건 : 부서번호(PK)로 한다.
	public void editEmp(
			Connection conn, 
			int empno, 
			String ename, 
			String job,
			int mgr,
			String hiredate,
			int sal,
			int comm,
			int deptno			
			) throws SQLException {
		
		String sql = "update emp set ename=?, job=?, mgr=?, "
				+ "hiredate=?, sal=?, comm=?, deptno=? where empno=? ";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);	
		pstmt.setString(1, ename);
		pstmt.setString(2, job);
		pstmt.setInt(3, mgr);
		pstmt.setString(4, hiredate);
		pstmt.setInt(5, sal);
		pstmt.setInt(6, comm);
		pstmt.setInt(7, deptno);
		pstmt.setInt(8, empno);
				
		int rCnt = pstmt.executeUpdate();
		
		if(rCnt > 0) {
			System.out.println("수정되었습니다.");
		} else {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
		}
	}
	
	//delete
	public void deleteEmp(Connection conn, int empno) throws SQLException {
		
		String sql = "delete from emp where empno="+empno;
		Statement stmt = conn.createStatement();
		
		int rCnt = stmt.executeUpdate(sql);
		
		if(rCnt>0) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("삭제하고자하는 데이터가 존재하지않습니다.");
		}
		
		stmt.close();
		
	}
	
	//search&print
	public void searchEmp(Connection conn, int empno) throws SQLException {
		String sql = "select * from emp where empno=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, empno);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println("찾으시는 " + empno + "번 부서의 정보");
			System.out.println("-------------------------------");
			System.out.println(
					rs.getInt("empno") + " | " 
			        + rs.getString("ename") + " | " 
					+ rs.getString("job") + " | " 
			        + rs.getString("mgr") + " | " 
			        + rs.getString("hiredate") + " | " 
			        + rs.getString("sal") + " | " 
			        + rs.getString("comm") + " | " 
			        + rs.getString("deptno"));
			System.out.println("-------------------------------");
		} else {
			System.out.println("찾으시는 부서의 정보가 존재하지않습니다.");
		}
		
		rs.close();
		pstmt.close();
	
	}
		
		
	
	
}
