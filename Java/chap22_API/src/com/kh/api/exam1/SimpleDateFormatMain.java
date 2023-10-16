package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain {

/*
 SimpleDateFormat
 날짜와 시간을 원하는 형식으로 포맷하거나
 문자열로부터 날짜와 시간을 파싱하는 데 사용 되는 클래스 
 */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//포맷팅 된 문자열 반환
		String forDate = sdf.format(currentDate);
		
		//결과 출력
		System.out.println("포멧 된 날짜 시간 : " + forDate);
	}
}
