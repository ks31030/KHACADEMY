package com.kh.scannersample;
import java.util.Scanner;
 
public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt(); //정수형만 받는 next
		System.out.println("내 나이는 " + age + "입니다.");
		
		String name, phoneNumber;
		
		System.out.println("당신의 이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("당신의 전화번호를 입력하세요 : ");
		phoneNumber = sc.next(); //-넣지않기
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " + phoneNumber + "입니다.");
		*/
		//내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		String h, f, a;
		System.out.println("당신의 취미를 입력하세요 : ");
		h = sc.next();
		System.out.println("당신이 좋아하는 음식을 입력하세요 : ");
		f = sc.next();
		System.out.println("당신의 주소를 입력하세요 : ");
		a = sc.next(); //공백을 받지 않음. 붙여 쓰는 것만 가능.
		System.out.println("당신의 취미는 " + h + "입니다.");		
		System.out.println("당신이 좋아하는 음식은 " + f + "입니다.");		
		System.out.println("당신의 주소는 " + a + "입니다.");		
	}
}
