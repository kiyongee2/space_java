package classes.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// 1. 문자열 배열
		/*String[] cars = new String[3];
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("------------------");
		
		//자동차 모델명 입력
		cars[0] = "Sonata";
		cars[1] = "Morning";
		cars[2] = "EV6";*/
		
		//선언과 동시에 초기화
		String[] cars = {"Sonata", "Morning", "EV6"};
		
		//"Morning"을 "BMW"로 수정
		cars[1] = "BMW";
		
		//순서로 출력
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("----------------------");
		
		//향상 for문(범위 기반) - for(자료형 변수 : 배열이름){}
		for(String car : cars)
			System.out.println(car);
	}
}
