package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcTestInsert {

	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
				Connection con = null; // ����
				PreparedStatement pstmt = null; // �غ�� ����, sql����
				ResultSet rs = null; // �����(SELECT���϶��� ���)
				
				// H2DB ����̹�
				String driverName = "org.h2.Driver";
				// H2DB ��������
				String url = "jdbc:h2:tcp://localhost/~/h2db";
				String user = "sa";
				String password = "";
				
				String sql = "";
				
				// ����� �Է� �޾Ҵٰ� ����
				int id = 3;
				String name = "������";
				
				try {
					// ������ Ư�� Ŭ������ �޸𸮿� �ø���
					Class.forName(driverName);
					// �޸𸮿� �ö� ����̹��� �̿��ؼ�
					// Ư�� DB�� ����
					// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���Ἲ��!
					con = DriverManager.getConnection(url, user, password);
				
					sql = "INSERT INTO member(id, name, reg_date)";
					sql += "	VALUES (?, ?, CURRENT_TIMESTAMP)";
					
					
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, id); 
					// ����ǥ 1���ڸ��� int������ ���� - ���̺� ������ �÷��� ȣȯ
					pstmt.setString(2, name); 
					// ����ǥ 2���ڸ��� String���� ���� - ���̺� varchar�� �÷��� ȣȯ
					
					// sql�� ����.insert�� DB������ �����ؼ� ������.
					int count = pstmt.executeUpdate();
					System.out.println(count + "���� ���� �߰���");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

}
