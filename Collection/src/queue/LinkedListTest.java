package queue;

import java.util.LinkedList;
import java.util.List;

/*
 * 연결 리스트 자료구조
   - 각 요소가 값과 주소를 가진 노드를 구성하고 있고,
     물리적인 메모리는 떨어져 있어도 논리적으로 앞 뒤 순서가 있음
   - 배열이나 ArrayList보다 삽입, 삭제가 빈번한 곳에 사용함 
 */

public class LinkedListTest {

	public static void main(String[] args) {
		// 문자를 저장할 LinkedList 객체 생성
		List<String> myList = new LinkedList<>();
		
		//요소 추가
		myList.add("A");
		myList.add("B");
		myList.add("D");
		
		System.out.println(myList); //[A, B, D]
		
		//요소 추가(특정 위치) - add(인덱스, 값)
		myList.add(2, "C");
		System.out.println(myList);  //[A, B, C, D]
		
		//요소 삭제 - remove()
		if(myList.contains("B")) {
			myList.remove("B");
		}
		System.out.println(myList);  //[A, C, D]
	}
}







