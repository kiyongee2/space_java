package classes.score;

public class Subject {
	private String subjectName;  //과목명
	private int scorePoint;      //점수
	
	//기본 생성자 생략
	//public Subject(){}
	
	//setter, getter
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() { return subjectName; }
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	public int getScorePoint() {return scorePoint;}
}
