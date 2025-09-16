package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest2 {

	public static void main(String[] args) {
		//try ~ with ~ resource 구문: close()를 사용하지 않는다.
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb", //db의 url(위치)
				 "root", //계정(user)
				 "12345" //패스워드
				 )){
			System.out.println(conn + "DB 접속 성공!");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
