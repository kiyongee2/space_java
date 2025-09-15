package abstract_calss.template_method;

public abstract class Car {
	
	//추상 메서드
	public abstract void drive(); //선언
	public abstract void stop();
	
	//실체 메서드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드 - 일련의 과정(시나리오)을 정의하는 메서드
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
