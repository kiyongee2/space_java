package classes.score;

public class Main {

	public static void main(String[] args) {
		// 학생 인스턴스 생성
		Student woo = new Student(1001, "우영우");
		
		//과목 입력
		woo.setKoreanSubject("국어", 90);
		woo.setMathSubject("수학", 80);
		
		//정보 출력
		woo.showInfo();

	}

}
