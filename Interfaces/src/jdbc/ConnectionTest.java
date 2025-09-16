package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		// Connection 객체 생성
		Connection conn = null;
		
		try {
			//mysql 드라이버 이름
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb", //db의 url(위치)
				 "root", //계정(user)
				 "12345" //패스워드
				);
			System.out.println(conn + "DB 접속 성공!");	
		} catch (ClassNotFoundException e) { //다중 catch문(위쪽에 상위클래스)
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {  //오류가 있던 없던 항상 수행됨
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
