package interfaces.calculator;

/*
 * 인터페이스
   - 설계도 역할을 하는 일종의 추상 자료형(data type)이다.
   - 모든 메서드가 추상이다.
   - 선언만 있고, 구현은 없다.
 */

public interface Calculator {
	
	//추상 메서드 선언
	int add(int n1, int n2);      //더하기
	int subtract(int n1, int n2); //빼기
	int times(int n1, int n2);    //곱하기
	int divide(int n1, int n2);   //나누기
}
