package classes2.polymorphism.fruit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.복숭아 | 3.바나나");
		System.out.print("선택> ");
		
		int menu = scan.nextInt();
		
		//부모타입 인스턴스 생성
		Fruit fruit = null;
		if(menu == 1) {
			fruit = new Grape();
		}else if(menu == 2) {
			fruit = new Peach();
		}else if(menu == 3) {
			fruit = new Banana();
		}
		fruit.showInfo();
		
		scan.close();
	}
}
