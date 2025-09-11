package basic.string;

public class StringMethodTest2 {

	public static void main(String[] args) {
		// replace(변경전문자, 변경후문자)
		String str1 = "Hello Java!";
		
		String result1 = str1.replace('a', '@');
		System.out.println(result1);
		
		//특수문자 제거
		String phone = "010-1234-5678";
		String result2 = phone.replace("-", "");
		System.out.println(result2);
		
		// split(구분기호) - 구분 기호로 구분하여 배열로 반환됨
		String carts = "potato strawberry garlic";
		String[] array = carts.split(" ");
		
		System.out.println(array[0]); //potato
		System.out.println(array[1]); //strawberry
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		//향상 for
		for(String arr : array)
			System.out.print(arr + " ");

	}

}
