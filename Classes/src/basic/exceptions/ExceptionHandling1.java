package basic.exceptions;

/*
 *  try{
 *      오류가 발생할 수 있는 코드
 *  }catch(예외 타입 e){
 *  	예외를 처리하는 코드
 *  }
 * 
 */

public class ExceptionHandling1 {
	
	//문자열의 길이(크기)를 세는 메서드 정의
	public static void printLength(String data) {
		int len = data.length(); //문자열의 크기를 세는 메서드 호출
		System.out.println("문자 수: " + len);
	}

	public static void main(String[] args) {
		//실행 예외(Runtime Exception) : 실행했을때 오류 발생
		System.out.println("[프로그램 시작]\n");
		
		try {
			printLength("Hello");
			printLength(null); //NullPointerException
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("문자열을 입력해 주세요");
		}
		
		System.out.println("[프로그램 종료]\n");
	}
}
