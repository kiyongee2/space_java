package classes2.inheritance.car;

/*
    상속 받기
    - 클래스 이름 extends 상속하는 클래스
    - 생성자 상속 : super(변수1, 변수2) 사용
 * 
 */
public class EV extends Car{
	private int battery;  //배터리 잔량(0 ~ 100%)

	//생성자
	public EV(String brand, String model, int battery) {
		super(brand, model);  //부모 멤버변수 상속
		this.battery = battery;
	}
	
	//충전 기능
	public void charge(int amount) {
		battery += amount;
		if(battery > 100)
			battery = 100;  //최대 제한
		System.out.println(model + " 충전됨 - 배터리: " + "%");
	}

	//메서드 재정의 - 메서드의 내용을 부모클래스와 다르게 변경하는 것
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("배터리 잔량: " + battery + "%");
	}
	
	//EV 정보 출력 - 메서드 재정의(오버라이드-override)
	/*@Override
	public void showInfo() {
		super.showInfo(); //부모 메서드 상속
		System.out.println("배터리 잔량: " + battery + "%");
	}*/
}



