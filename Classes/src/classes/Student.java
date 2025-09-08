package classes;

public class Student {
	//멤버 변수
	int studentId; //학번
	String name;   //이름
	int grade;     //학년
	
	//생성자 오버로딩(이름이 같고 매개변수가 다름)
	//기본 생성자 - 컴파일러가 자동 생성해줌
	Student(){}
	
	//멤버변수를 모두 가진 생성자
	Student(int studentId, String name, int grade){
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}
	
	//학생 정보 출력 메서드
	void displayInfo() {
		System.out.println("학번: " + studentId);
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
	}
}
