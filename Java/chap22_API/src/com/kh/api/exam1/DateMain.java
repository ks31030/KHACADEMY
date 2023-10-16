package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는 데 사용.
  		java1.1 이후 권장되지 않음.
  			java.time 패키지 LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
//		import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시각 : " + currentTime);
		LocalDateTime currentLDT = LocalDateTime.now();
		System.out.println("현재 날짜 시각 : " + currentLDT);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);
		
		//minus plus 이용해서 각 2개씩 만들어 보기 총 4개
		
		LocalDate today1 = LocalDate.now();
		LocalDate futureDate1 = today.plusDays(4);
		System.out.println("4일 후 날짜 : " + futureDate1);
		
		LocalDate today2 = LocalDate.now();
		LocalDate futureDate2 = today.plusYears(3);
		System.out.println("3년 후 날짜 : " + futureDate2);
		
		LocalDate today3 = LocalDate.now();
		LocalDate pastDate1 = today.minusDays(846);
		System.out.println("846일 전 날짜 : " + pastDate1);
		
		LocalDate today4 = LocalDate.now();
		LocalDate pastDate2 = today.minusDays(7);
		System.out.println("7일 전 날짜 : " + pastDate2);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2024, 9, 26);
		
		//date1.isBefore(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date2);
		} else if(date1.isAfter(date2)) {
			System.out.println(date1);
		} else {
			System.out.println("같은 날짜입니다.");
		}
		
	}

}
