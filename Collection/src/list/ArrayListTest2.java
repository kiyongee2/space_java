package list;

import java.util.*;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// 문자를 저장할 ArrayList 생성
		List<String> myList = new ArrayList<>();
		
		//요소 추가
		myList.add("A");  //0번
		myList.add("B");  //1
		myList.add("D");  //2
		
		//객체 출력
		System.out.println(myList); //[A, B, D]
		
		//요소 추가(특정 위치) - add(index, E)
		myList.add(2, "C"); 
		
		System.out.println(myList); //[A, B, C, D]
		
		//요소 삭제 - 안전한 삭제(요소가 있는지 확인후 삭제)
		if(myList.contains("B")) {
			myList.remove("B");
		}
		System.out.println(myList); //[A, C, D]
		
		//순서로 출력
		for(int i = 0; i < myList.size(); i++) {
			String element = myList.get(i);
			System.out.print(element + " ");
		}
		System.out.println();
		
		//범위로 출력
		for(String element : myList)
			System.out.print(element + " ");
	}
}





