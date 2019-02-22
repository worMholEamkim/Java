package com.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exam.vo.Member;

// DAO(Data Access Object)
// ������ sql���� �����ϴ� �޼ҵ带 ����
public class MemberDao {

	public MemberDao() { // ������
		createTable(); // member ���̺����
	}

	private Connection getConnection() throws Exception {
		// H2DB ����̹�
		String driverName = "org.h2.Driver";
		// H2DB ��������
		String url = "jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";

		Class.forName(driverName);
		// �޸𸮿� �ö� ����̹��� �̿��ؼ�
		// Ư�� DB�� ����
		// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���Ἲ��!
		Connection con = DriverManager.getConnection(url, user, password);

		return con;
	}

	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// JDBC �ڿ��ݱ� ( ����� �������� ���� )
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void createTable() {
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {
			getConnection();

			sql = "CREATE TABLE IF NOT EXISTS member (" + "	id 			INTEGER 	PRIMARY KEY,"
					+ "	NAME 		VARCHAR(30)," + "	REG_DATE 	TIMESTAMP" + ")";

			pstmt = con.prepareStatement(sql);
			// sql ���� pstmt.executeUpdate(sql);
			// DB ���¿� ������ ���ϴ� sql�� ����
			// ��) CREATE, INSERT, UPDATE, DELETE ��
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, null);

		}

	}

	public int insert(Member member) {
		int count = 0;
		// member���̺� sql�� ���� �� ����� ���� ����
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {
			con = getConnection(); // DB ����

			sql = "INSERT INTO member(id, name, reg_date)";
			sql += "	VALUES (?, ?, CURRENT_TIMESTAMP)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member.getId());
			// ����ǥ 1���ڸ��� int������ ���� - ���̺� ������ �÷��� ȣȯ
			pstmt.setString(2, member.getName());
			// ����ǥ 2���ڸ��� String���� ���� - ���̺� varchar�� �÷��� ȣȯ

			// sql�� ����
			count = pstmt.executeUpdate(); // insert�� DB������ �����ؼ� ����
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	public int deleteAll() {
		int count = 0;
		// member���̺� sql�� ���� �� ����� ���� ����
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {
			con = getConnection(); // DB ����
			sql = "DELETE FROM member";

			pstmt = con.prepareStatement(sql);
			// sql�� ����
			count = pstmt.executeUpdate(); // DELETE�� DB������ �����ؼ� ����
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}// deleteAll

	public List<Member> getMembers() {
		List<Member> list = new ArrayList<Member>();
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {
			con = getConnection();

			sql = "SELECT * FROM member ORDER BY ID";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setRegDate(rs.getTimestamp("reg_date"));

				list.add(member);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}

		return list;

	}
	
	public List<Member> getMemberById(int id) {
		Member member = null;
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {
			con = getConnection();

			sql = "SELECT * FROM member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setRegDate(rs.getTimestamp("reg_date"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}

		return member;

	}
	

	public int updateById(Member member) {
		int count = 0;
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";
		
		try {
			con = getConnection();
			sql = "UPDATE member SET name=? WHERE id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setInt(2,  member.getId());
			
			count = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
