package classes.score2;

public class Main {

	public static void main(String[] args) {
		// 학생 인스턴스 생성
		Student woo = new Student(1001, "우영우");
		
		woo.addSubject("국어", 90);
		woo.addSubject("수학", 80);
		woo.addSubject("과학", 85);
		
		woo.showInfo();

	}

}
