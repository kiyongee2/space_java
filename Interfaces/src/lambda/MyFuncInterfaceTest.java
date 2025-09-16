package lambda;

public class MyFuncInterfaceTest {

	public static void main(String[] args) {
		// 인터페이스의 인스턴스 생성
		MyFuncInterface fi;
		
		//람다식으로 익명 함수 구현
		//매개변수가 없고(괄호 생략 불가), 이름이 없는 익명함수
		/*fi = () -> {
			String str = "Hello~ lambda!";
			System.out.println(str);
		};*/
		
		//중괄호 블럭 생략, 한 줄로 출력
		fi = () -> System.out.println("Hello~ lambda!");
		
		fi.method();
	}

}
