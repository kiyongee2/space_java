package regexp;
/*
 * 정규 표현식
 *  - 특정한 규칙을 가진 문자열을 표현하고 처리하는 것
   Pattern 클래스
   - 문자열이 정규 표현식에 매칭(일치)되는지 여부를 반환함
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest1 {

	public static void main(String[] args) {
		
		// '+' 기호는 a가 1번 이상 반복되어야 함
		// '*' 기호는 a가 0번 이상 반복
		Pattern pat = Pattern.compile("a+b"); //compile(정규표현식)
		Matcher mat = pat.matcher("b"); //matcher(문자열)
		System.out.println(mat.matches()); 
		
		//숫자만 허용하는 패턴 검사
		String pattern = "^[0-9]+$";
		String str = "2025ai";
		
		//matches(정규표현식, 문자열)
		boolean bool = Pattern.matches(pattern, str);
		System.out.println(bool);  //false
		
		//한글 이름과 전화 번호 검사
		String name = "을지문덕";
		String tel = "010-123-5678";
		
		//{2,5} - 2글자에서 5글자까지임
		boolean name_check = Pattern.matches("[가-힣]{2,5}", name);
		boolean tel_check = Pattern.matches("010[-](\\d{3}||\\d{4})[-]\\d{4}", tel);
		
		System.out.println(name_check);
		System.out.println(tel_check);
		
		//한글 이름 유효성 검사(사용자 입력)
		Scanner sc = new Scanner(System.in);
		System.out.print("한글 이름을 입력하세요: ");
		String inputName = sc.nextLine();
		
		//정규 표현식 사용
		if(!Pattern.matches("^[가-힣]{2,5}$", inputName)) {
			System.out.println("올바른 한글 이름이 아닙니다.");
		}else {
			System.out.println("이름: " + inputName);
		}
		
		sc.close();
	}
}








