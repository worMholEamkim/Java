package com.exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.exam.vo.Member;

// DAO(Data Access Object)
// ������ SQL���� �����ϴ� �޼ҵ带 ������.
public class MemberDao {

	public MemberDao() { // �⺻������
		createTable(); // member ���̺� ���� �޼ҵ� ȣ��
	}

	private Connection getConnection() throws Exception {
		// H2DB ����̹�
		String driverName = "org.h2.Driver";
		// H2DB ��������
		String url = "jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";

		// ������ Ư�� Ŭ������ �޸𸮿� �ø���
		Class.forName(driverName);
		// �޸𸮿� �ö� ����̹��� �̿��ؼ�
		// Ư�� DB�� �����ϱ�.
		// ���ῡ �����ϸ� Connection ��ü�� ���� -> ���Ἲ���� �ǹ�!
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	} // getConnection()

	// JDBC ��ü �ݱ� �޼ҵ�
	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// JDBC �ڿ��ݱ� (����� �������� ����)
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close(); // DB���� ����
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // close()

	public void createTable() {
		// JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		String sql = "";

		try {
			con = this.getConnection();

			sql = "CREATE TABLE IF NOT EXISTS  member (" + "    id       INTEGER    PRIMARY KEY,"
					+ "    name     VARCHAR(30)," + "    reg_date TIMESTAMP" + ")";

			pstmt = con.prepareStatement(sql);
			// create�� ����
			pstmt.executeUpdate(); // SQL���� DB������ ���۵Ǽ� �����!

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, null);
		}
	} // createTable()

	public int insert(Member member) {
		int count = 0; // member���̺� sql�� ���� �� ����� ���� ����
		// JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		String sql = "";
		
		try {
			con = getConnection();  // DB����
			
			sql = "INSERT INTO member (id, name, reg_date) ";
			sql += " VALUES (?, ?, CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member.getId()); // ����ǥ 1���ڸ��� int������ ���� - ���̺� ������ �÷��� ȣȯ
			pstmt.setString(2, member.getName()); // ����ǥ 2���ڸ��� String���� ���� - ���̺� varchar�� �÷��� ȣȯ
			// sql�� ����.
			count = pstmt.executeUpdate(); // insert�� DB������ �����ؼ� ������.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		
		return count;
	} // insert()
	
	
	
	public int deleteAll() {
		int count = 0; // member���̺� sql�� ���� �� ����� ���� ����
		// JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		String sql = "";
		
		try {
			con = getConnection();  // DB����
			
			sql = "DELETE FROM member"; // ���̺� ���븸 ���λ���
			
			pstmt = con.prepareStatement(sql);
			// sql�� ����.
			count = pstmt.executeUpdate(); // DELETE�� DB������ �����ؼ� ������.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		
		return count;
	} // deleteAll()
	
	
	public List<Member> getMembers() {
		List<Member> list = new ArrayList<Member>();
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		ResultSet rs = null; // �����Ʈ(SELECT���϶��� ���)
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
			// sql�� ����. SELECT���� ���� executeQuery() ȣ���ؼ�
			// ResultSet Ÿ���� ���̺� �������� ����� ������.
			rs = pstmt.executeQuery(); // SELECT�� �����ؼ� ����->rs�� ������
			
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
	} // getMembers()
	
	public Member getMemberById(int id) {
		Member member = null;
		// JDBC(Java DataBase Connectivity)
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		ResultSet rs = null; // �����Ʈ(SELECT���϶��� ���)
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "SELECT * FROM member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			// sql�� ����. SELECT���� ���� executeQuery() ȣ���ؼ�
			// ResultSet Ÿ���� ���̺� �������� ����� ������.
			rs = pstmt.executeQuery(); // SELECT�� �����ؼ� ����->rs�� ������
			
			if (rs.next()) {
				member = new Member();
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
	} // getMember()
	
	
	public int updateById(Member member) {
		int count = 0; // member���̺� sql�� ���� �� ����� ���� ����
		// JDBC(Java DataBase Connectivity) �������� �غ�
		Connection con = null; // ����
		PreparedStatement pstmt = null; // �غ�� ����
		String sql = "";
		
		try {
			con = getConnection();
			sql = "UPDATE member SET name=? WHERE id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getId());
			// ����
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		
		return count;
	} // updateById()
	
	

} // MemberDao class
