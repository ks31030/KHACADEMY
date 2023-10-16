package com.kh.practice2.func;

public class CastingPractice3 {

	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2);
		int iNum3 = (int) dNum;
		System.out.println(iNum3);
		
		System.out.println(iNum2*dNum);
		float fNum1 = iNum1;
		System.out.println(fNum1);
		
		System.out.println(fNum1/iNum2);
		System.out.println(dNum);
		
		int iNum4 = (int) fNum;
		System.out.println(iNum4);
		System.out.println(iNum1/iNum4);
		
		System.out.println(iNum1/fNum);
		double dNum1 = fNum;
		System.out.println(iNum1/dNum1);
		
		System.out.println(ch);
		int nt = ch;
		System.out.println(nt);
		System.out.println(nt + iNum1);
		char chr = (char)(nt + iNum1);
		System.out.println(chr);
		
	}

}
//구태여 형변환, 추가적인 선언할 것 없이 변수 앞에 변경하고자 하는 자료형 추가하면 됨.
// ex) (double)iNum1 = 10.0;