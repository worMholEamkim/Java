package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTestSelect {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		ResultSet rs = null; // �����Ʈ(SELECT���϶��� ���)

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
			// Ư�� DB�� �����ϱ�.
			// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���Ἲ���� �ǹ�!
			con = DriverManager.getConnection(url, user, password);
			
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
			// sql�� ����. SELECT���� ���� executeQuery() ȣ���ؼ�
			// ResultSet Ÿ���� ���̺� �������� ����� ������.
			rs = pstmt.executeQuery(); // SELECT�� �����ؼ� ����->rs�� ������
			
			while (rs.next()) {//Ŀ���� ���������� �ű��� ���� �����ϸ� true, ���� ������ false ������.
				System.out.print(rs.getInt("id"));// Ŀ���� ����Ű�� ��(������)�� id�� ���� int�� ������.
				System.out.print("\t"+rs.getString("name"));// Ŀ���� ����Ű�� ��(������)�� name�� ���� String�� ������.
				System.out.println("\t"+rs.getTimestamp("reg_date"));// Ŀ���� ����Ű�� ��(������)�� reg_date�� ���� Timestamp�� ������.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main()

}
