package classes.score2;

import classes.score.Subject;

/*
    - 배열 자료구조 사용
    - 과목 추가함수 : addSubject() 정의
 */
public class Student {
	private int studentId;
	private String studentName;
	private Subject[] subjects;  //과목 배열
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];
	}
	
	//과목 추가 메서드
	public void addSubject(String name, int score) {
		//과목 인스턴스 생성 -> 배열에 저장
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] == null) { //배열 공간이 비어있으면
				subjects[i] = subject; //인스턴스 저장
				break; //반복문 탈출
			}
		}
	}
	
	//학생의 정보 출력
	public void showInfo() {
		System.out.println(
			"학번: " + studentId +
			"\n이름: " + studentName);
		//과목 출력
		for(int i = 0; i < subjects.length; i++) {
			if(subjects[i] != null) { //과목이 비어있지 않으면
				System.out.println(
					subjects[i].getSubjectName() + 
					"점수: " + subjects[i].getScorePoint());
			}
		}
		System.out.println("---------------------------");
	}
}





