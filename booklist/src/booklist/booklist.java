package booklist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class booklist {
	Connection con;
	Statement stmt;
	ResultSet rs;
	public booklist() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "madang";
		String pwd = "madang";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("데이터 베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터 베이스 연결 성공...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		private void sqlRun() {
			String query = "SELECT * FROM Book";
			try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			while(rs.next()){
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t" + rs.getInt(4));
			}
			
			con.close();
			}catch(SQLException e) {
			e.printStackTrace();
		}
			
				
			
		}
		public static void main(String args[]) {
			booklist so = new booklist();
			so.sqlRun();
	}
}
