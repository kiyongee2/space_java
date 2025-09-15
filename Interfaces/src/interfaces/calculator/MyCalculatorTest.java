package interfaces.calculator;

public class MyCalculatorTest {

	public static void main(String[] args) {
		// MyCalculator 인스턴스 생성
		MyCalculator calc = new MyCalculator();
		
		try {
			int num1 = 10, num2 = 0;
			
			System.out.println(calc.add(num1, num2));
			System.out.println(calc.subtract(num1, num2));
			System.out.println(calc.times(num1, num2));
			System.out.println(calc.divide(num1, num2));
		}catch(ArithmeticException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
}
