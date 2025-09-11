package classes2.inheritance.drink;

public class Drink {
	protected String name;  //상품명
	protected int price;    //가격
	protected int quantity; //수량
	
	//생성자
	public Drink(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//금액 = 가격 x 수량
	public int calcPrice() {
		return price * quantity;
	}
	
	//제목행 출력
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	//데이터 출력
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + 
				quantity + "\t" + calcPrice());
	}
}









