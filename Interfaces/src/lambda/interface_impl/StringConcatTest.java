package lambda.interface_impl;

public class StringConcatTest {

	public static void main(String[] args) {
		
		StringConcatImpl concat = new StringConcatImpl();
		String str1 = "Demon";
		String str2 = "Hunters";
		
		concat.makeString(str1, str2);
	}
}
