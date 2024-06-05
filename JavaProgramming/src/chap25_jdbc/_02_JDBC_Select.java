package chap25_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC를 이용해서 과목별 기말고사의 평균 성적 조회
		// (과목번호, 과목이름, 교수번호, 교수이름, 기말고사 성적의 평균점수)
		
		// 오라클 드라이버 변수 선언 및 사용 클래스를 문자열로 지정
		final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		
		// 필요한 객체들 변수로 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	
		
		try {
			// 위에서 지정한 DateBase 드라이버 로드
			Class.forName(JDBC_DRIVER);
			// Connection 객체 얻기 (JDBCUtil 클래스를 통해 DB 연결 객체 얻기)
			conn = JDBCUtil.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "c##study", "!dkdlxl1234");
			// Connection 객체에서 쿼리를 실행할 수 있는 Statement 객체 얻기
			stmt =  conn.createStatement();
			
			// 실행 시킬 쿼리를 문자열로 작성
			String selectStudentInfo = "SELECT C.CNO"
					+ "                      , C.CNAME"
					+ "                      , P.PNO"
					+ "                      , P.PNAME"
					+ "                      , ROUND(AVG(SC.RESULT), 2) AS AVG_RES"
					+ "                      FROM COURSE C"
					+ "                      JOIN PROFESSOR P"
					+ "                        ON C.PNO = P.PNO"
					+ "                      JOIN SCORE SC"
					+ "                        ON SC.CNO = C.CNO"
					+ "                      GROUP BY C.CNO, C.CNAME, P.PNO, P.PNAME";
			// 쿼리문실행
			// 실행 결과를 ResultSet에 받음
			rs = stmt.executeQuery(selectStudentInfo);
			
			// 쿼리 실행 결과 출력
			while(rs.next()) {
				// ResultSet에서 각각의 타입에 맞게 값을 꺼낸다.
				String cno = rs.getString("cno");
				String cname = rs.getString("cname");
				String pno = rs.getString("pno");
				String pname = rs.getString("pname");
				Double avgRes = rs.getDouble("avg_res");
				
				System.out.println("과목번호: " + cno + " /" +
								   " 과목이름: " + cname + " /" +
								   " 교수번호: " + pno + " /" +
								   " 교수이름: " + pname + " /" +
								   " 기말고사 평균 점수: " + avgRes);
			}
			
		} catch(SQLException se){
			System.out.println(se.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, conn);
		}

	}

}
