import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
/*
 난수 : 예측할 수 없는 값들로 이루어진 수의 나열(수열) 
 */
	public static void main(String[] args) {
		Lotto r = new Lotto();
		r.Lotto();
	}
	public void RanEX() {
	/*
	 난수 : 예측할 수 없는 값들로 이루어진 수의 나열
	 */
			Random rd = new Random(); //Random 객체 생성
			
			//1. 정수 범위 내에서 난수를 만들겠다.
			int ranInt = rd.nextInt(100); //0~99 사이에서 1개
			System.out.println(ranInt);
			//2. 실수 범위 내에서 난수를 만들겠다.
			double ranD = rd.nextDouble(); //0.0 ~ 1.0 사이에서 1개
			System.out.println(ranD);
			
			//3. 범위 지정하여 난수 생성
			int minRd = 10;
			int maxRd = 50;
			System.out.println(maxRd - minRd +1);
			System.out.println(maxRd - minRd +1);
			int raMinMax = rd.nextInt(maxRd - minRd +1) + minRd ;
						//   0~ 41 까지의 난수           + 10
			System.out.println(raMinMax);
			
			//4. 불리언 값 생성
			boolean Bran = rd.nextBoolean();
			System.out.println(Bran);
		}

	public void Lotto() {
		int six = 6; //로도 번호 몇 개 뽑을 것인지 설정
		
		//Random 객체 생성
		Random rd = new Random();
		//중복되지 않는 로또 번호 저장할 배열 생성

		//2. ArrayList 사용해서 장바구니로 담기!
		List<Integer> lottoNum = new ArrayList<>();
		//중복을 피하기 위해 set을 사용할 수 있다.
			// 0부터           <6 미만
		while(lottoNum.size() < six) {
			int ranNumber = rd.nextInt(45)+1; //1~45 자리의 랜덤으로 번호 하나
			//        존재여부
			if(!lottoNum.contains(ranNumber)) {
				lottoNum.add(ranNumber);
			} 
		}
		//Collections.sort(lottoNum);
		System.out.println(lottoNum);
	}
	
}


/*
  		//1. Array
			//int[] lottoNum = new int[six];
		
		
		for(int i =0 ; i < six ; i++) {
			int isSame;
			if(만약에 번호가 같다면) {
				
			} else {
				출력하겠다.
			}
			
		}
 */













//int[]lottoNum = new int[six];
////중복을 피하기 위해 set을 사용할 수 있다.
//for(int i =0;i < six;i++) {
//	int isSame;
//	if(lottoNum[i]==)
//}


