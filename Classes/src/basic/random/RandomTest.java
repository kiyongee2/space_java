package basic.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 난수 생성
		//1. Math.random()
		int n1 = (int)(Math.random() * 2); //0, 1 중 랜덤
		//System.out.println(n1);
		
		//2. Random 클래스
		Random rnd = new Random();
		//System.out.println(rnd.nextInt());
		int n2 = rnd.nextInt(2);
		//System.out.println(n2); //0, 1 출력
		
		//동전 던지기 - 1(앞면), 2(뒷면)
		int coin = rnd.nextInt(2) + 1; //1, 2 출력
		System.out.println(coin);
		
		if(coin == 1) {
			System.out.println("앞면");
		}else{
			System.out.println("뒷면");
		}
	}
}
