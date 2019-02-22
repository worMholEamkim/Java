package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTestSelect {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; 			// 연결
		PreparedStatement pstmt = null; // 준비된 문장, sql문장
		ResultSet rs = null; 			// 결과셋(SELECT문일때만 사용)

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
		// 특정 DB에 접속
		// 연결에 성공하면 Connection 객체를 리턴 -> 연결성공!
			con = DriverManager.getConnection(url, user, password);
		
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
		// sql문 실행. select문일 경우는 executeQuery() 호출해서
		// ResultSet 타입의 테이블 형식으로 결과를 가져옴
			rs = pstmt.executeQuery(); //select문 전송해서 실행 -> rs로 가져옴

		// 행의 길이를 알 수 없기때문에 와일문이 적합
		// 커서를 다음행으로 옮긴 후 행이 존재하면 true, 존재하지않으면 false 반환
			while(rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print("\t" + rs.getString("name"));
				System.out.println("\t" + rs.getTimestamp("reg_date"));
			};
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
