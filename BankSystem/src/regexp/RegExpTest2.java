package regexp;

public class RegExpTest2 {

	public static void main(String[] args) {
		// String의 replaceAll(정규표현식, 대체문자) 사용
		// 비밀번호 마스킹 처리
		String password = "P@ssw0rd!";
		
		//영문자 또는 숫자가 아닌 글자 '*'로 대체
		//[]안에 들어간 '^'는 부정(not)을 의미함
		String masked = password.replaceAll("[^a-zA-Z0-9]", "*");
		System.out.println(masked); //P*ssw0rd*
		
		//게시글 금칙어 처리
		String text = "안녕@하세요! #스팸";
		
		//한글과 공백을 제외한 문자를 '*' 마스킹
		//\s- 공백문자
		String filtered = text.replaceAll("[^ㄱ-힣\\s]", "*");
		System.out.println(filtered); //안녕*하세요* *스팸
	}
}




