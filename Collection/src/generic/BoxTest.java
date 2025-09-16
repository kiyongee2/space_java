package generic;

public class BoxTest {

	public static void main(String[] args) {
		// String형 사용
		Box<String> box1 = new Box<>();
		
		box1.set("행운을 빌어요!");
		System.out.println(box1.get());
		
		// Integer형 사용
		Box<Integer> box2 = new Box<>();
		
		box2.set(12);
		Integer num = box2.get();
		System.out.println(num);
		
		//Car 사용
		Box<Car> box3 = new Box<>();
		
		box3.set(new Car("아이오닉6"));
		Car car = box3.get();
		System.out.println(car);

	}

}
