package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcTest {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����, sql����
		ResultSet rs = null; // �����(SELECT���϶��� ���)
		
		// ����Ŭ ����̹�
//		String driverName = "oracle.jdbc.OracleDriever";
		
		// ����Ŭ DB��������
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";		// DB��ǰ���� ������ ���ݾ� �ٸ�
//		String user = "scott"; 		//  
//		String password = "bitc5600";
		
		
		// H2DB ����̹�
		String driverName = "org.h2.Driver";
		// H2DB ��������
		String url = "jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";
		
		String sql = "";
		
		try {
			// ������ Ư�� Ŭ������ �޸𸮿� �ø���
			Class.forName(driverName);
			// �޸𸮿� �ö� ����̹��� �̿��ؼ�
			// Ư�� DB�� ����
			// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���Ἲ��!
			con = DriverManager.getConnection(url, user, password);
			
			sql = "CREATE TABLE IF NOT EXISTS member (" +
			"	id 			INTEGER 	PRIMARY KEY," +
			"	NAME 		VARCHAR(30)," +
			"	REG_DATE 	TIMESTAMP" +
			")";
			
			pstmt = con.prepareStatement(sql);
			// sql ���� pstmt.executeUpdate(sql); 
			// DB ���¿� ������ ���ϴ� sql�� ����
			// ��) CREATE, INSERT, UPDATE, DELETE ��
			pstmt.executeUpdate();
			// sql���� DB ������ ���۵�
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���� ����!!");
	}

}
