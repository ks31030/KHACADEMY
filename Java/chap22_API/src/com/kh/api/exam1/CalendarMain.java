package com.kh.api.exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		//Calendar 클래스를 사용한 현재 날짜와 시간 가져오기
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		System.out.println("calendar 클래스를 사용한 현재 날짜와 시간");
		System.out.println(); //개행 -> enter와 같음.
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
		
		System.out.println();
		//GregorianCalendar 클래스를 활용한 현재 날짜와 시간 가져오기
		GregorianCalendar gCalendar = new GregorianCalendar();
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.	MONTH) + 1;
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}

}
