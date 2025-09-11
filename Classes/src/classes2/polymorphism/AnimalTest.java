package classes2.polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//Animal을 상속한 Human 클래스
class Human extends Animal{

	@Override
	public void move() { //재정의
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Horse extends Animal{

	@Override
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 날개를 펴고 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		//Human human = new Human();
		//human.move();
		
		//다형성을 사용한 인스턴스 생성
		//부모형으로 인스턴스 생성(부모형 = 자식형) -> 자동 타입(형) 변환
		//Animal human = new Human();
		//human.move();
		
		//배열로 관리
		/*Animal[] animals = new Animal[3];
		
		animals[0] = new Human();
		animals[1] = new Horse();
		animals[2] = new Eagle();*/
		
		/*Animal[] animals = {
			 new Human(),
			 new Horse(),
			 new Eagle()
		};
		
		//출력
		for(Animal animal : animals)
			animal.move();*/
		
		//moveAnimal() 호출
		moveAnimal(new Human());
		moveAnimal(new Horse());
		moveAnimal(new Eagle());
		
	} //main()
	
	//매개변수의 다형성
	public static void moveAnimal(Animal animal) {
		animal.move();  //메서드의 동적 바인딩
	}
}












