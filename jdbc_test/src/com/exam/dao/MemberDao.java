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
// 실행할 SQL문을 수행하는 메소드를 정의함.
public class MemberDao {

	public MemberDao() { // 기본생성자
		createTable(); // member 테이블 생성 메소드 호출
	}

	private Connection getConnection() throws Exception {
		// H2DB 드라이버
		String driverName = "org.h2.Driver";
		// H2DB 접속정보
		String url = "jdbc:h2:tcp://localhost/~/h2db";
		String user = "sa";
		String password = "";

		// 강제로 특정 클래스를 메모리에 올리기
		Class.forName(driverName);
		// 메모리에 올라간 드라이버를 이용해서
		// 특정 DB에 접속하기.
		// 연결에 성공하면 Connection 객체를 리턴 -> 연결성공의 의미!
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	} // getConnection()

	// JDBC 객체 닫기 메소드
	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		// JDBC 자원닫기 (사용의 역순으로 닫음)
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
				con.close(); // DB연결 해제
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // close()

	public void createTable() {
		// JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		String sql = "";

		try {
			con = this.getConnection();

			sql = "CREATE TABLE IF NOT EXISTS  member (" + "    id       INTEGER    PRIMARY KEY,"
					+ "    name     VARCHAR(30)," + "    reg_date TIMESTAMP" + ")";

			pstmt = con.prepareStatement(sql);
			// create문 실행
			pstmt.executeUpdate(); // SQL문이 DB서버로 전송되서 실행됨!

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close(con, pstmt, null);
		}
	} // createTable()

	public int insert(Member member) {
		int count = 0; // member테이블에 sql문 수행 후 변경된 행의 개수
		// JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		String sql = "";
		
		try {
			con = getConnection();  // DB접속
			
			sql = "INSERT INTO member (id, name, reg_date) ";
			sql += " VALUES (?, ?, CURRENT_TIMESTAMP)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member.getId()); // 물음표 1번자리에 int형으로 설정 - 테이블 정수형 컬럼과 호환
			pstmt.setString(2, member.getName()); // 물음표 2번자리에 String으로 설정 - 테이블 varchar형 컬럼과 호환
			// sql문 실행.
			count = pstmt.executeUpdate(); // insert문 DB서버로 전송해서 실행함.
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		
		return count;
	} // insert()
	
	
	
	public int deleteAll() {
		int count = 0; // member테이블에 sql문 수행 후 변경된 행의 개수
		// JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		String sql = "";
		
		try {
			con = getConnection();  // DB접속
			
			sql = "DELETE FROM member"; // 테이블 내용만 전부삭제
			
			pstmt = con.prepareStatement(sql);
			// sql문 실행.
			count = pstmt.executeUpdate(); // DELETE문 DB서버로 전송해서 실행함.
			
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
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		ResultSet rs = null; // 결과셋트(SELECT문일때만 사용)
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "SELECT * FROM member ORDER BY id";
			pstmt = con.prepareStatement(sql);
			// sql문 실행. SELECT문일 경우는 executeQuery() 호출해서
			// ResultSet 타입의 테이블 형식으로 결과를 가져옴.
			rs = pstmt.executeQuery(); // SELECT문 전송해서 실행->rs로 가져옴
			
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
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		ResultSet rs = null; // 결과셋트(SELECT문일때만 사용)
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "SELECT * FROM member WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			// sql문 실행. SELECT문일 경우는 executeQuery() 호출해서
			// ResultSet 타입의 테이블 형식으로 결과를 가져옴.
			rs = pstmt.executeQuery(); // SELECT문 전송해서 실행->rs로 가져옴
			
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
		int count = 0; // member테이블에 sql문 수행 후 변경된 행의 개수
		// JDBC(Java DataBase Connectivity) 참조변수 준비
		Connection con = null; // 연결
		PreparedStatement pstmt = null; // 준비된 문장
		String sql = "";
		
		try {
			con = getConnection();
			sql = "UPDATE member SET name=? WHERE id=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setInt(2, member.getId());
			// 실행
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, null);
		}
		
		return count;
	} // updateById()
	
	

} // MemberDao class
