package classes;
/*
    접근 제어자
    - private: 같은 클래스 내부에서만 접근 가능
    - default(생략): 같은 패키지내에서만 접근 가능
    - public: 다른 패키지에서도 접근 가능
 */

public class BankAccountTest {

	public static void main(String[] args) {
		// 생성자 호출 - 인스턴스 생성
		BankAccount account1 = new BankAccount();
		
		// 값 입력
		account1.setAno("11-22-3333");
		account1.setOwner("김기용");
		account1.setBalance(20000);
		
		// 출력
		System.out.println("계좌번호: " + account1.getAno());
		System.out.println("예금주: " + account1.getOwner());
		System.out.println("잔액: " + account1.getBalance());

	}

}
