package basic.random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		//입력 클래스 호출
		Scanner sc = new Scanner(System.in);
		//Random 클래스 호출
		Random rnd = new Random();
		//컴퓨터의 난수 발생(1 ~ 30)
		int comNum = rnd.nextInt(30) + 1;
		
		//무한 반복문 - break 사용
		while(true) {
			try {
				System.out.print("숫자(1~30)를 입력하세요: ");
				//문자를 숫자로 변환
				int guessNum = Integer.parseInt(sc.nextLine()); //사용자 입력
				//조건 - 범위를 초과했어요. 다시 입력하세요.
				if(guessNum < 1 || guessNum > 30) {
					System.out.println("범위를 초과했어요. 다시 입력하세요.");
				}else if(guessNum == comNum) {
					System.out.println("정답!");
					break;
				}else if(guessNum > comNum) {
					System.out.println("너무 커요!");
				}else {
					System.out.println("너무 작아요!");
				}
			}catch(NumberFormatException e) {
				System.out.println("유효한 숫자를 입력하세요.");
			}
			
			/*if(guessNum < 1 || guessNum > 30) { //제한 영역
				System.out.println("범위를 초과했어요. 다시 입력하세요.");
			}else { //정상 영역
				if(guessNum == comNum) {
					System.out.println("정답!");
					break;
				}else if(guessNum > comNum) {
					System.out.println("너무 커요!");
				}else {
					System.out.println("너무 작아요!");
				}
			}*/
		}
		sc.close();
	}
}










