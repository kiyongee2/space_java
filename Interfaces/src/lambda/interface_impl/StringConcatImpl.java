package lambda.interface_impl;

//StringConcat을 구현한 클래스
public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}

}
