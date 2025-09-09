package classes2.singleton;

import classes2.car.Car;
/*
    코딩 패턴 - 싱글톤 패턴
    - 자동차 공장에서 자동차를 생산
    - 자동차 공장은 유일한 1개의 인스턴스를 가짐
 */
public class CarFactory {
	//멤버 변수
	private static CarFactory instance; //자동차 공장 인스턴스
	
	//생성자 
	private CarFactory() {}
	
	//인스턴스 반환 메서드
	public static CarFactory getInstance() {
		//instance는 중복 생성이 되지 않음
		if(instance == null)
		  instance = new CarFactory();
		return instance;
	}
	
	//자동차 생성 메서드 정의
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}



