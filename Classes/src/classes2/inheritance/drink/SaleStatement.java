package classes2.inheritance.drink;

//매출전표 테스트
public class SaleStatement {

	public static void main(String[] args) {
		// Drink 생성자 호출
		Drink coffee = new Drink("커피", 2500, 4);
		// Alcohol 인스턴스 생성
		Alcohol soju = new Alcohol("소주", 4000, 2, 15.2f);
		
		//출력
		Drink.printTitle();
		coffee.printData();
		soju.printData();
		
		//총 금액 계산하기
		int total = 0;
		total = coffee.calcPrice() + soju.calcPrice();
		System.out.println("********** 합계 금액: " + total + "원 **********");
	}
}
