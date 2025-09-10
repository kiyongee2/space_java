package bankapp;

public class BankAccount {
	private String accountNumber; //계좌 번호
	private String owner; //예금주
	private int balance;  //잔고
	private Transaction[] transactions; //거래 내역
	private int transactionCount;  //현재 거래의 수
	
	//생성자
	public BankAccount(String accountNumber, String owner) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = 0;  //잔고 0으로 초기화
		transactions = new Transaction[100];
		this.transactionCount = 0;
	}
	
	//거래 추가
	public void addTransaction(TransactionType type, int amount) {
		//거래 인스턴스 1개 생성한 후 거래 배열에 저장 
		transactions[transactionCount] = new Transaction(type, amount);
		transactionCount++;  //인덱스 1 증가
	}
	
	//입금 기능
	public void deposit(int amount) {
		if(amount < 0) {
			System.out.println("유효한 금액을 입력하세요.");
		}else {
			balance += amount; //balance = balance + amount;
			System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + 
						balance + "원");
			//거래 추가(입금)
			addTransaction(TransactionType.입금, amount);
		}
	}
	
	//출금 기능
	public void withdraw(int amount) {
		if(amount < 0) {
			System.out.println("유효한 금액을 입력하세요.");
		}else if(amount > balance) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance -= amount; //balance = balance - amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + 
						balance + "원");
			//거래 추가(출금)
			addTransaction(TransactionType.출금, amount);
		}
	}
	
	//계좌 정보 출력
	public void displayInfo() {
		System.out.println(
				"[계좌 정보]" + 
		        "\n계좌 번호: " + accountNumber +
		        "\n계좌주: " + owner + 
		        "\n잔고: " + balance);
		System.out.println("-----------------------");
	}
	
	//거래 내역 출력
	public void getTransactionHistory() {
		if(transactionCount == 0) {
			System.out.println("거래 내역이 없습니다.");
		}
		
		//거래 내역
		for(int i = 0; i < transactionCount; i++) {
			// | 입금 | = 20000원
			String typeStr = (transactions[i].type == TransactionType.입금) ? 
					"입금" : "출금";
			System.out.println(" | " + typeStr + " | " + 
					transactions[i].amount + "원");
		}
		System.out.println("=======================");
	}
}











