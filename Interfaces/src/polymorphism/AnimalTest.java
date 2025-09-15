package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Horse extends Animal{

	@Override
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
	
	public void run() {
		System.out.println("말이 사람을 태우고 빨리 달립니다.");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void hunting() {
		System.out.println("독수리가 물고기를 사냥합니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		/*// 1. 다형성 - 자동 형변환(업 캐스팅)
		Animal animal = new Human();
		animal.move();
		
		//2. 다형성 - 강제 형변환(다운 캐스팅) : instanceof
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}*/
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human();
		animals[1] = new Horse();
		animals[2] = new Eagle();
		
		//다운 캐스팅
		for(int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Horse) {
				Horse horse = (Horse)animal;
				horse.run();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.hunting();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}
	}

}








