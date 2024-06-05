package chap25_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _05_JDBC_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		PreparedStatement stmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("삭제할 학번을 입력하세요");
			String sno = sc.nextLine();
			
			conn = JDBCUtil.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");
			
			String deleteStudent = "DELETE FROM STUDENT"
					+ "                   WHERE SNO  = ? ";
			
			stmt = conn.prepareStatement(deleteStudent);
			
			stmt.setString(1, sno);			
			
			int result = stmt.executeUpdate();

			if(result != 0) {
				System.out.println("쿼리가 잘 동작했습니다.");
			} else {
				System.out.println("영향 받은 행이 없습니다");
			}
			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}
		
	

	}

}
