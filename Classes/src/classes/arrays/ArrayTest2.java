package classes.arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		//배열의 크기가 4인 정수형 배열 선언
		int[] number = new int[4];
		
		//출력
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("------------------");
		
		//값(요소, 원소) 입력
		number[0] = 10;
		number[1] = 25;
		number[2] = 30;
		number[3] = 40;
		
		//출력
		for(int num : number)
			System.out.println(num);
		System.out.println("------------------");
		
		//계산
		//System.out.println(number[0] + number[1]); //30
		
		int total = 0; //합계 
		
		/*total = total + number[0]; //total = 0 + 10 = 10
		total = total + number[1]; //total = 10 + 20 = 30
		total = total + number[2]; //total = 30 + 30 = 60
		total = total + number[3]; //total = 60 + 40 = 100
		System.out.println(total); //100*/
		
		for(int i = 0; i < number.length; i++) {
			total += number[i]; //total = total + number[i];
		}
		System.out.println("합계: " + total); //100
		
		//평균 = 합계 / 개수
		float average;
		average = (float)total / number.length; //명시적형변환, 실수형 = 실수형
		
		System.out.println("평균: " + average);
	}
}











