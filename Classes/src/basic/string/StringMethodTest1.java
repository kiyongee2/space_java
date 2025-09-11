package basic.string;

public class StringMethodTest1 {

	public static void main(String[] args) {
		//문자열은 1차원 배열이다.
		// charAt(인덱스) : 매개값으로 주어진 인덱스를 문자로 리턴함
		String msg = "행운을 빌어요!";
		
		System.out.println(msg.charAt(0)); //행
		System.out.println(msg.charAt(1)); //운
		
		//주민등록번호에서 남여를 구분(남-1,3, 여-2,4)
		String juminNum = "020815-4234567";
		
		char gender = juminNum.charAt(7); 
		System.out.println(gender);  //4
		
		switch(gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		//indexOf(문자열) - 문자열이 시작되는 인덱스(첫번째)를 리턴함
		String subject = "자바 프로그래밍 입문";
		System.out.println(subject.indexOf("프로그래밍")); //3
		System.out.println(subject.indexOf("파이썬")); //-1
		
		//문자열 검색
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
		
		//lastIndexOf(문자열) - 문자열을 뒤에서 검색하여 인덱스를 리턴
		String url = "http://www.korea.kr/boards";
		int idx = url.lastIndexOf("/");
		System.err.println(idx); //19
		
		//substring(begin, end) - 매개값의 시작인덱스부터 끝(끝-1)까지 문자 추출
		//substring(begin) - 시작인덱스부터 끝까지 문자 추출
		
		System.out.println(url.substring(idx));  ///boards
	}
}












