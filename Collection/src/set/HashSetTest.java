package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * Set -> HashSet
 * - 순서가 없고, 중복 저장 안됨
 * 
 */

public class HashSetTest {

	public static void main(String[] args) {
		
		// 문자열을 저장할 HashSet 객체 생성
		Set<String> set = new HashSet<>();
		
		//요소 추가
		set.add("Java");
	    set.add("Python");
	    set.add("C++");
	    set.add("Java");
	    
	    //객체 출력
	    System.out.println(set); //[Java, Python, C++]
	    
	    //인덱싱 - 직접 접근 안됨
	    //set[2]
	    //set.get(2)
	    
	    //특정 요소 검색
	    if(set.contains("Python")) {
	    	System.out.println("Python");
	    }
	    
	    //전체 요소 출력 - Iterator 클래스(반복자)
	    Iterator<String> ir = set.iterator();
	    while(ir.hasNext()) { //요소가 있으면
	    	String element = ir.next(); //가져와서
	    	System.out.println("\t" + element); //출력
	    }
	    System.out.println("------------------");
	    
	    //요소 삭제 - remove()
	    if(set.contains("C++")) {
	    	set.remove("C++");
	    }
	    
	    //범위 기반 for문
	    for(String element : set)
	    	System.out.println("\t" + element);
	}

}









