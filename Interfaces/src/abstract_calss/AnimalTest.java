package abstract_calss;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat 인스턴스 생성
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.breathe();
		cat.cry();
		
		dog.breathe();
		dog.cry();

	}

}
