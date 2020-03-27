package emp_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import emp_CRUD.DaoM;

public class Main {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클 드라이버 로드 완료");

			// 호스트, port, db name
			String jdbcUr2 = "jdbc:oracle:thin:@localhost:1521:orcl";
			// 계정
			String user = "scott";
			// 비밀번호
			String pw = "tiger";

			// 2. 데이터베이스에 접속
			conn = DriverManager.getConnection(jdbcUr2, user, pw);

			System.out.println("데이터베이스에 정상적으로 접속되었습니다.");

			DaoM dao = DaoM.getInstance();

			// insert
			//dao.insertEmp(conn, 6999, "dragon", "flyer", 0, "91/11/24", 500, 2000, 70);

			// 부서 정보 수정
			//dao.editEmp(conn, 6999, "DICE", "NUMBERING", 1000, "2019/12/25", 3000, 0, 80);
			
			// 부서정보 삭제
			//dao.deleteEmp(conn, 6999);

			// 부서 리스트 출력
			//dao.listEmp(conn);

			// 부서 검색

			dao.searchEmp(conn, 6999);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			// System.out.println("입력오류");
		}

	}

}
