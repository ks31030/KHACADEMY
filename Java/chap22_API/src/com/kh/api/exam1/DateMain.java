package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���� �� ���.
  		java1.1 ���� ������� ����.
  			java.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
//		import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		LocalDateTime currentLDT = LocalDateTime.now();
		System.out.println("���� ��¥ �ð� : " + currentLDT);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		
		//minus plus �̿��ؼ� �� 2���� ����� ���� �� 4��
		
		LocalDate today1 = LocalDate.now();
		LocalDate futureDate1 = today.plusDays(4);
		System.out.println("4�� �� ��¥ : " + futureDate1);
		
		LocalDate today2 = LocalDate.now();
		LocalDate futureDate2 = today.plusYears(3);
		System.out.println("3�� �� ��¥ : " + futureDate2);
		
		LocalDate today3 = LocalDate.now();
		LocalDate pastDate1 = today.minusDays(846);
		System.out.println("846�� �� ��¥ : " + pastDate1);
		
		LocalDate today4 = LocalDate.now();
		LocalDate pastDate2 = today.minusDays(7);
		System.out.println("7�� �� ��¥ : " + pastDate2);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2024, 9, 26);
		
		//date1.isBefore(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date2);
		} else if(date1.isAfter(date2)) {
			System.out.println(date1);
		} else {
			System.out.println("���� ��¥�Դϴ�.");
		}
		
	}

}
