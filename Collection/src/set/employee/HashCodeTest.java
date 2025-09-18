package set.employee;

/*
    인스턴스의 주소 - 패키지이름.클래스이름@메모리주소(해시코드 - hashCode)
 */

public class HashCodeTest {

	public static void main(String[] args) {
		
		Employee em1 = new Employee(101, "장그래");
		Employee em2 = new Employee(101, "장그래");
		
		System.out.println(em1);
		
		//물리적인 주소이므로 서로 다르다
		System.out.println(em1.hashCode());
		System.out.println(em2.hashCode());
		
		//일치 여부 비교
		System.out.println(em1 == em2);  //false
		
		//논리적으로 문자열 일치 여부 - 재정의 필요함
		System.out.println(em1.equals(em2)); //true
		
		//물리적인 메모리 주소
		System.out.println(System.identityHashCode(em1));
		System.out.println(System.identityHashCode(em2));
		
		//String과 비교
		String str1 = new String("컴퓨터");
		String str2 = new String("컴퓨터");
		
		System.out.println(str1.equals(str2)); //true

	}

}
