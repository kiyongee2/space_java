package classes2.car;

public class CarTest {

	public static void main(String[] args) {
		// Car 생성자 호출
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("차량 번호: " + car1.getCarNumber()); //1001
		System.out.println("차량 번호: " + car2.getCarNumber()); //1002
		System.out.println("차량 번호: " + car3.getCarNumber()); //1003
		
		//인스턴스 출력- 클래스 이름은 패키지이름.클래스이름
		System.out.println(car1); //classes2.car.Car@3941a79c
	}

}
