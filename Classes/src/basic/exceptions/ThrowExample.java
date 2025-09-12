package basic.exceptions;

/*
    throw new 예외 클래스(메시지)
    - 오류 발생시 메시지대로 출력됨
 */

public class ThrowExample {

	public static void main(String[] args) {
		// 나이 검사 프로그램
		// 1 - 나이가 음수인 경우, 2 - 20세 이하 "미성년자 입장불가"
		try {
			//checkAge(-2);
			checkAge(17);
		}catch(IllegalArgumentException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}

	//나이를 검사하는 메서드
	public static void checkAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("나이는 음수가 될 수 없습니다.");
		}else if(age < 20) {
			throw new ArithmeticException("미성년자는 입장할 수 없습니다.");
		}else {
			System.out.println("입장 가능합니다.");
		}
	}
}
