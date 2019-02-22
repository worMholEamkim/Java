package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTestSelect {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		ResultSet rs = null; // 결과셋트(SELECT문일때만 사용)

		// H2DB 드라이버
		String driverName = "org.h2.Driver";
		// H2DB 접속정보
		String url = "jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";

		String sql = "";

		try {
			// 강제로 특정 클래스를 메모리에 올리기
			Class.forName(driverName);
			// 메모리에 올라간 드라이버를 이용해서
			// 특정 DB에 접속하기.
			// 연결에 성공하면 Connection 객체를 리턴 -> 연결성공의 의미!
			con = DriverManager.getConnection(url, user, password);
			
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
			// sql문 실행. SELECT문일 경우는 executeQuery() 호출해서
			// ResultSet 타입의 테이블 형식으로 결과를 가져옴.
			rs = pstmt.executeQuery(); // SELECT문 전송해서 실행->rs로 가져옴
			
			while (rs.next()) {//커서를 다음행으로 옮긴후 행이 존재하면 true, 행이 없으면 false 리턴함.
				System.out.print(rs.getInt("id"));// 커서가 가리키는 행(기준행)의 id열 값을 int로 가져옴.
				System.out.print("\t"+rs.getString("name"));// 커서가 가리키는 행(기준행)의 name열 값을 String로 가져옴.
				System.out.println("\t"+rs.getTimestamp("reg_date"));// 커서가 가리키는 행(기준행)의 reg_date열 값을 Timestamp로 가져옴.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main()

}
