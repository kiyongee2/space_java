package classes2.constant;

import java.util.Calendar;

//Week 열거형 상수 정의
enum Week{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATUTDAY
}

public class WeekTest {

	public static void main(String[] args) {
		// 오늘 무슨 요일?
		Week today = null;
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.getTime());
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week); //4 - 수요일
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATUTDAY; break;
		default:
			System.out.println("요일이 없습니다.");
		}
		
		System.out.println("Today is " + today + ".");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 놀러 갑니다.");
		}else {
			System.out.println("평일에는 열심히 코딩합니다.");
		}
	}

}













