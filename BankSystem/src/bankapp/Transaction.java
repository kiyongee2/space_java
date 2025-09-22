package bankapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	TransactionType type;  //거래 유형
	int amount;            //거래 금액
	LocalDateTime timestamp; //거래 일시
	
	//생성자
	public Transaction(TransactionType type, int amount) {
		this.type = type;
		this.amount = amount;
		this.timestamp = LocalDateTime.now();
	}
	
	//날짜 형식 변환 메서드
	public String getFormattedTimestamp() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return timestamp.format(formatter);
	}
}




