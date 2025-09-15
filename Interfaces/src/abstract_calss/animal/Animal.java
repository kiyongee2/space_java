package abstract_calss.animal;
/*
   추상 클래스
   - 클래스의 공통적인 특성을 선언한 클래스이다.
   - 추상메서드를 선언하고, 상속받는 클래스에서 반드시 구현하도록 강제함
 */

public abstract class Animal {
	
	public void breathe() {
		System.out.println("동물은 숨을 쉽니다.");
	}
	
	//추상 메서드 선언, 구현부는 없음 
	public abstract void cry();
}
