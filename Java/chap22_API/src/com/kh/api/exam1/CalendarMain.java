package com.kh.api.exam1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		//Calendar Ŭ������ ����� ���� ��¥�� �ð� ��������
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int day = calendar.get(calendar.DAY_OF_MONTH);
		int hour = calendar.get(calendar.HOUR_OF_DAY);
		int minute = calendar.get(calendar.MINUTE);
		int second = calendar.get(calendar.SECOND);
		System.out.println("calendar Ŭ������ ����� ���� ��¥�� �ð�");
		System.out.println(); //���� -> enter�� ����.
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "��");
		
		System.out.println();
		//GregorianCalendar Ŭ������ Ȱ���� ���� ��¥�� �ð� ��������
		GregorianCalendar gCalendar = new GregorianCalendar();
		year = gCalendar.get(Calendar.YEAR);
		month = gCalendar.get(Calendar.	MONTH) + 1;
		day = gCalendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "�� " + month + "�� " + day + "��");
	}

}
