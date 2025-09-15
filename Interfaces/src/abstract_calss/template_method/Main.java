package abstract_calss.template_method;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new HumanCar();
		hisCar.run();
	}
}
