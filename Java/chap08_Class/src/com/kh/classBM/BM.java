package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM{
	//자바 프로그램의 시작점
		// A 생성자를 classBM에서 만들고 싶어!
	public void am() {
		publicMethod();
		protectedMethod();
		//main 메서드에서 직접 호출을 하거나 무언가를 통해 호출.
		//접근 제한자를 가지고 있어서 같은 패키지 내에서 호출이 가능하지만 extends 사용해서 호출을 한다.
		//defaultMethod(); 같은 패키지 안에서 사용이 가능함. 다른 패키지므로 사용이 안 됨.
	}

}
