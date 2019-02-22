package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTestSelect {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; 			// ����
		PreparedStatement pstmt = null; // �غ�� ����, sql����
		ResultSet rs = null; 			// �����(SELECT���϶��� ���)

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
		
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
		// sql�� ����. select���� ���� executeQuery() ȣ���ؼ�
		// ResultSet Ÿ���� ���̺� �������� ����� ������
			rs = pstmt.executeQuery(); //select�� �����ؼ� ���� -> rs�� ������

		// ���� ���̸� �� �� ���⶧���� ���Ϲ��� ����
		// Ŀ���� ���������� �ű� �� ���� �����ϸ� true, �������������� false ��ȯ
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
