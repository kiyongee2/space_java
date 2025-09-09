package classes2;

import java.util.Calendar;

/*
    java util 패키지(import 해야함)에 있는 Calendar
    Calendar - 날짜 및 시간 관련 메서드를 가지고 있음
    - static이 있는 메서드를 포함하고 있어서 new 하지 않고
      Calendar로 직접 접근함 
 */

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		//현재 날짜와 시간 출력 - getTime()
		System.out.println(cal.getTime()); //Tue Sep 09 12:14:07 KST 2025
		
		//날짜 - 년, 월, 일 - get()
		int year = cal.get(Calendar.YEAR);  //상수표기 - final static int YEAR 
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		//시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println((12 + hour) + " : " + minute + " : " + second);
		
		//요일-{1:일, 2:월, 3:화... }
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + days[day-1] + "요일이다.");
	}

}






