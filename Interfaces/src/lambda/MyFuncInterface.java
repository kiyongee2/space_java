package lambda;

/*
 * 함수형 인터페이스
   - 추상 메서드는 오직 1개만 존재
   - 구현 클래스를 만들지 않고, 람다식을 사용
   - @FunctionalInterface를 사용하면 메서드를 
     추가하면 오류 발생함
 */
@FunctionalInterface
public interface MyFuncInterface {
	
	//추상 메서드
	public void method();
	
	//public void method2();

}
