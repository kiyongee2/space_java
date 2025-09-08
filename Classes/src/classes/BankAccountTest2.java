package classes;

/*
    배열
    - 여러 개의 연속적인 요소(값)을 저장하는 자료 구조이다.
    - 0번 위치(인덱스)에서 시작함
    - 자료형[] 배열이름 = new 자료형[배열의 크기]
    - int[] num = new int[4]
      <변수- num1, num2, num3, num4>
      <num[0], num[1], num[2], num[3]>
 */

public class BankAccountTest2 {

	public static void main(String[] args) {
		// 은행 계좌를 저장할 배열 생성
		BankAccount[] accounts = new BankAccount[2];
		
		System.out.println("배열의 크기: " + accounts.length); //2
		
		// 은행 계좌 인스턴스 생성
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		// 계좌 정보 입력
		account1.setAno("11-22-3333");
		account1.setOwner("이정우");
		account1.setBalance(10000);
		
		account2.setAno("11-22-4444");
		account2.setOwner("김선화");
		account2.setBalance(20000);
		
		// 은행 계좌 인스턴스를 배열에 저장
		accounts[0] = account1;
		accounts[1] = account2;
		
		// 계좌 정보 출력
		for(int i = 0; i < accounts.length; i++) {
			System.out.println("계좌 번호: " + accounts[i].getAno());
			System.out.println("예금주: " + accounts[i].getOwner());
			System.out.println("잔고: " + accounts[i].getBalance());
		}

	}

}
