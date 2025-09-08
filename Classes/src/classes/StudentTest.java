package classes;

public class StudentTest {

	public static void main(String[] args) {
		//클래스 인스턴스     생성자
		Student st1 = new Student();
		Student st2 = new Student(1002, "이정우", 1);
		
		//값 입력
		st1.studentId = 1001;
		st1.name = "김기용";
		st1.grade = 2;
		
		//출력
		st1.displayInfo();
		st2.displayInfo();
	}

}
