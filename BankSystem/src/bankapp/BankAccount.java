package bankapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BankAccount {
	private String accountNumber;  //계좌 번호
	private String owner;  //예금주
	private int balance;   //잔고
	List<Transaction> transactions; //거래 
	
	//계좌번호 유효성 검사
	private static final String ACCOUNT_PATTERN = 
			"^[0-9]{2,4}-[0-9]{2,4}-[0-9]{4,8}$";
	
	//생성자
	public BankAccount(String accountNumber, String owner) {
		if(!isValidAccountNumber(accountNumber)) {
			throw new IllegalArgumentException("유효하지 않은 계좌번호 형식입니다.");
		}
		this.accountNumber = accountNumber;
		this.owner = owner;
		int balance = 0;
		transactions = new ArrayList<>();
	}

	//계좌번호 일치 여부 확인 메서드
	private boolean isValidAccountNumber(String accountNumber2) {
		return Pattern.matches(ACCOUNT_PATTERN, accountNumber);
	}
}
