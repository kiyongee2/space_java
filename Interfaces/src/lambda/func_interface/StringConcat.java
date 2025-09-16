package lambda.func_interface;

//함수형 인터페이스 정의
@FunctionalInterface
public interface StringConcat {
	//추상 메서드 선언
	public void makeString(String s1, String s2);
}
