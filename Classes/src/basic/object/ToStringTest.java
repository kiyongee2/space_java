package basic.object;

public class ToStringTest {

	public static void main(String[] args) {
		
		String name = new String("홍길동");
		System.out.println(name);
		
		// Book 인스턴스 생성
		Book book = new Book(101, "채식주의자");
		
		//문자열 정보 출력
		System.out.println(book);  //객체 주소
		System.out.println(book.showInfo());
	}

}
