package classes2;

/*
   java lang 패키지는 import 하지 않음
   - Math 클래스 : 수학 관련 메서드를 가지고 있음
*/

public class MathTest {

	public static void main(String[] args) {
		// Math 클래스의 메서드 사용
		// static이 있는 메서드는 new 하지 않고, 클래스이름으로 직접 접근
		//절대값 계산 - abs(정수)
		int v1 = Math.abs(-4);
		System.out.println(v1);  //4
		
		//반올림 - round(실수)
		long v2 = Math.round(5.6);
		System.out.println(v2);  //6
		
		//올림 - ceil()
		double v3 = Math.ceil(4.1);
		System.out.println(v3); //5.0
		
		//버림 - floor(실수)
		double v4 = Math.floor(5.9);
		System.out.println(v4); //5.0
		
		//두 수중 작은수 - min()
		int minV = Math.min(10, 20);
		System.out.println(minV);
		
		//무작위수 0.0 <= rand < 1.0
		double rand = Math.random();
		System.out.println(rand);
		
		//동전 던지기 - 앞면 / 뒷면
		//Math.random() * n -> 0 ~ n-1개
		int coin = (int)(Math.random() * 2);
		System.out.println(coin);
		
		if(coin == 0)
			System.out.println("앞면");
		else
			System.out.println("뒷면");
		
		//주사위 눈 : 1 ~ 6
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		
		//문자열 추출
		String[] country = {"한국", "일본", "중국", "미국"};
		
		//System.out.println(country[1]); //일본 
		
		int idx = (int)(Math.random() * 4); //(0 ~ 3)
		System.out.println(country[idx]);
	}
}







