package bankapp;

public class Main {

	public static void main(String[] args) {
		// 은행 계좌를 저장할 배열 선언
		BankAccount[] accounts = new BankAccount[3];
		
		//계좌 인스턴스 생성
		accounts[0] = new BankAccount("11-22-1234", "김선화");
		accounts[1] = new BankAccount("11-33-1234", "이우주");
		accounts[2] = new BankAccount("11-44-1234", "박은하");
		
		//입금
		accounts[0].deposit(10000);
		accounts[1].deposit(20000);
		
		//출금
		accounts[1].withdraw(5000);
		
		//출력
		for(int i = 0; i < accounts.length; i++) {
			accounts[i].displayInfo();
			accounts[i].getTransactionHistory();
		}
		

	}

}
