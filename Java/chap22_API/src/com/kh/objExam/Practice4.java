package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
		pm.Practice4();
		pm.Practice5();
	}
	
	public void Practice1() {
		//연월일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("연월일 : " + forDate);
	}
	public void Practice2() {
		//시분초
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("시분초 : " + forDate);
	}
	public void Practice3() {
		//월일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("월일 : " + forDate);
	}
	public void Practice4() {
		//연도 시간
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy HH:mm:ss");
		String forDate = sdf.format(currentDate);
		System.out.println("연시 : " + forDate);
	}
	public void Practice5() {
		//날짜 요일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM:dd(E)");
		String forDate = sdf.format(currentDate);
		System.out.println("날짜 요일 : " + forDate);
	}
}
