package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장, sql문장
		ResultSet rs = null; // 결과셋(SELECT문일때만 사용)
		
		// 오러클 드라이버
//		String driverName = "oracle.jdbc.OracleDriever";
		
		// 오러클 DB접속정보
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";		// DB제품마다 형식이 조금씩 다름
//		String user = "scott"; 		//  
//		String password = "bitc5600";
		
		
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
			
			sql = "CREATE TABLE IF NOT EXISTS member (" +
			"	id 			INTEGER 	PRIMARY KEY," +
			"	NAME 		VARCHAR(30)," +
			"	REG_DATE 	TIMESTAMP" +
			")";
			
			pstmt = con.prepareStatement(sql);
			// sql 실행 pstmt.executeUpdate(sql); 
			// DB 상태에 변경을 가하는 sql문 실행
			// 예) CREATE, INSERT, UPDATE, DELETE 등
			pstmt.executeUpdate();
			// sql문이 DB 서버로 전송됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속 성공!!");
	}

}
