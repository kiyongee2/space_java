package list;

import java.util.ArrayList;
import java.util.List;

class Shape{
	public void draw() {
		System.out.println("도형");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형");
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		
		//요소 추가
		list.add(new Shape());
		list.add(new Circle());
		list.add(new Triangle());
		
		//범위 기반 for
		for(Shape s : list)
			s.draw();
		System.out.println("========");
		
		//순서 기반 for
		for(int i = 0; i < list.size(); i++) {
			Shape s = list.get(i);
			s.draw();
		}
	}
}

