package abstract_calss.animal;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat 인스턴스 생성
		/*Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.breathe();
		cat.cry();
		
		dog.breathe();
		dog.cry();*/
		
		//부모형으로 인스턴스 생성 - 다형성
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		cat.cry();
		dog.cry();
		System.out.println("=======================");
		
		//메서드의 다형성
		animalCry(new Cat());
		animalCry(new Dog());
	}
	
	public static void animalCry(Animal animal) {
		animal.cry();
	}
	
}




