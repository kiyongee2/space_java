package classes2.inheritance.drink;

//Drink를 상속한 Alcohol 클래스
public class Alcohol extends Drink{
	private float alcper;  //알콜 도수

	public Alcohol(String name, int price, 
			int quantity, float alcper) {
		super(name, price, quantity);
		this.alcper = alcper;
	}
	
	//제목행 재정의
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}

	@Override
	public void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + 
				quantity + "\t" + calcPrice());
	}
	
	

}





