package bankapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//전역 공간
	static Scanner scan = new Scanner(System.in);
	static List<BankAccount> accountList = new ArrayList<>();
	
	public static void main(String[] args) {
		// 사용자 입력
		boolean run = true; //토글(상태) 변수
		
		// 메뉴 화면
		while(run) {
			System.out.println("=============================================");
			System.out.println("1.계좌 생성 | 2.예금 | 3.출금 | 4.계좌 검색 | 5.종료");
			System.out.println("=============================================");
			System.out.print("선택> ");
			
			try {
				//선택한 번호(문자열) ->  정수로 변환
				int choice = Integer.parseInt(scan.nextLine());
				switch(choice) {
				case 1:
					createAccount();
					break;
				case 2:
					deposit();
					break;
				case 3:
					withdraw();
					break;
				case 4:
					selectAccount();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					run = false; //상태 바꿈
					break;  //사용가능: return;
				default:
					System.out.println("지원되지 않는 기능입니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("유효한 숫자를 입력하세요.");
			}
		}//while 닫기
		scan.close();
	}

	//계좌 검색
	private static void selectAccount() {
		
		while(true) {
			System.out.print("계좌번호 입력: ");
			String accNum = scan.nextLine();
			
			if(searchAccount(accNum) != null) {
				BankAccount account = searchAccount(accNum);
				
				//계좌 정보, 거래 내역 메서드 호출
				account.displayInfo();
				account.getTransactionHistory();
				break;
			}else {
				System.out.println("계좌가 없습니다. 다시 입력하세요");
			}
		}
	}

	//출금
	private static void withdraw() {
		System.out.print("계좌번호 입력: ");
		String accNum = scan.nextLine();
		
		if(searchAccount(accNum) != null) { //입력한 계좌번호로 계좌를 찾았다면
			BankAccount account = searchAccount(accNum);
			
			System.out.print("출금액 입력: ");
			int amount = Integer.parseInt(scan.nextLine());
			
			if(amount < 0) {
				System.out.println("유효한 금액을 입력하세요.");
			}else if(amount > account.getBalance()) {
				System.out.println("잔액이 부족합니다.");
			}else {
				//출금 처리
				account.setBalance(account.getBalance() - amount);
				System.out.println("입금이 정상 처리되었습니다. 현재 잔액: " + 
													account.getBalance());
				//거래 추가 메서드 호출
				account.addTransaction(TransactionType.출금, amount);
			}
		}else {
			System.out.println("계좌가 없습니다.");
		}
	}

	//예금
	private static void deposit() {
		System.out.print("계좌번호 입력: ");
		String accNum = scan.nextLine();
		
		//계좌 검색
		if(searchAccount(accNum) != null) { //입력한 계좌번호로 계좌를 찾았다면
			BankAccount account = searchAccount(accNum);
			
			System.out.print("입금액 입력: ");
			int amount = Integer.parseInt(scan.nextLine());
			
			if(amount < 0) {
				System.out.println("유효한 금액을 입력하세요.");
			}else {
				//입금 처리
				account.setBalance(account.getBalance() + amount);
				System.out.println("입금이 정상 처리되었습니다. 현재 잔액: " + 
													account.getBalance());
				//거래 추가 메서드 호출
				account.addTransaction(TransactionType.입금, amount);
			}
		}else {
			System.out.println("계좌가 없습니다.");
		}
	}
	
	//계좌 검색
	private static BankAccount searchAccount(String accNum) {
		BankAccount account = null;
		//리스트에 계좌번호와 일치하는지 여부를 반복 -> 계좌 반환
		for(int i = 0; i < accountList.size(); i++) {
			//이미 등록된 계좌번호 가져오기
			String dbAccNum = accountList.get(i).getAccountNumber();
			if(dbAccNum.equals(accNum)) { //등록 계좌번호와 입력 계좌번호가 일치하면
				account = accountList.get(i); //해당 계좌를 반환
				break;
			}
		}
		return account;
	}

	//계좌 생성
	private static void createAccount() {
		
		while(true) {
			try {
				System.out.print("계좌번호 입력: ");
				String accNum = scan.nextLine();
				
				if(searchAccount(accNum) != null) {
					System.out.println("이미 등록된 계좌입니다. 다른 계좌를 입력하세요");
				}else {
					System.out.print("계좌주 입력: ");
					String name = scan.nextLine();
					
					//신규 계좌 생성
					BankAccount newAccount = new BankAccount(accNum, name);
					//list에 저장
					accountList.add(newAccount);
					System.out.println("계좌가 생성되었습니다.(계좌번호: " + accNum + ")");
					break;
				}
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
