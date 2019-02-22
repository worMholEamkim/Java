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
// 실행할 sql문을 수행하는 메소드를 정의
public class MemberDao {

	public MemberDao() { // 생성자
		createTable(); // member 테이블생성
	}

	private Connection getConnection() throws Exception {
		// H2DB 드라이버
		String driverName = "org.h2.Driver";
		// H2DB 접속정보
		String url = "jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";

		Class.forName(driverName);
		// 메모리에 올라간 드라이버를 이용해서
		// 특정 DB에 접속
		// 연결에 성공하면 Connection 객체를 리턴 -> 연결성공!
		Connection con = DriverManager.getConnection(url, user, password);

		return con;
	}

	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// JDBC 자원닫기 ( 사용의 역순으로 닫음 )
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
			// sql 실행 pstmt.executeUpdate(sql);
			// DB 상태에 변경을 가하는 sql문 실행
			// 예) CREATE, INSERT, UPDATE, DELETE 등
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, null);

		}

	}

	public int insert(Member member) {
		int count = 0;
		// member테이블에 sql문 수행 후 변경된 행의 개수
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {
			con = getConnection(); // DB 접속

			sql = "INSERT INTO member(id, name, reg_date)";
			sql += "	VALUES (?, ?, CURRENT_TIMESTAMP)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member.getId());
			// 물음표 1번자리에 int형으로 설정 - 테이블 정수형 컬럼과 호환
			pstmt.setString(2, member.getName());
			// 물음표 2번자리에 String으로 설정 - 테이블 varchar형 컬럼과 호환

			// sql문 실행
			count = pstmt.executeUpdate(); // insert문 DB서버로 전송해서 실행
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	public int deleteAll() {
		int count = 0;
		// member테이블에 sql문 수행 후 변경된 행의 개수
		// JDBC(Java DataBase Connection)
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {
			con = getConnection(); // DB 접속
			sql = "DELETE FROM member";

			pstmt = con.prepareStatement(sql);
			// sql문 실행
			count = pstmt.executeUpdate(); // DELETE문 DB서버로 전송해서 실행
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
