package payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//결제 내역(Payment log) 저장 인터페이스
interface PaymentRepository {
	void save(String paymentType, int amount);
}

//내역 저장(메모리, DB) 구현체
class DBPaymentRepository implements PaymentRepository{

	@Override
	public void save(String paymentType, int amount) {
		System.out.println("DB에 저장됨: " + paymentType +
				" - " + amount + "원");
		
		//DB에 데이터 저장
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javadb", //db의 url(위치)
				 "root", //계정(user)
				 "12345" //패스워드
				 )){
			
			//sql문 처리
			String sql = "insert into payment values (?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, paymentType); //첫째 물음표 대응
			pstmt.setInt(2, amount); //둘째 물음표
			pstmt.executeUpdate();  //커밋 역할
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}








