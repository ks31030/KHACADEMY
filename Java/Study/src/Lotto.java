import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
/*
 ���� : ������ �� ���� ����� �̷���� ���� ����(����) 
 */
	public static void main(String[] args) {
		Lotto r = new Lotto();
		r.Lotto();
	}
	public void RanEX() {
	/*
	 ���� : ������ �� ���� ����� �̷���� ���� ����
	 */
			Random rd = new Random(); //Random ��ü ����
			
			//1. ���� ���� ������ ������ ����ڴ�.
			int ranInt = rd.nextInt(100); //0~99 ���̿��� 1��
			System.out.println(ranInt);
			//2. �Ǽ� ���� ������ ������ ����ڴ�.
			double ranD = rd.nextDouble(); //0.0 ~ 1.0 ���̿��� 1��
			System.out.println(ranD);
			
			//3. ���� �����Ͽ� ���� ����
			int minRd = 10;
			int maxRd = 50;
			System.out.println(maxRd - minRd +1);
			System.out.println(maxRd - minRd +1);
			int raMinMax = rd.nextInt(maxRd - minRd +1) + minRd ;
						//   0~ 41 ������ ����           + 10
			System.out.println(raMinMax);
			
			//4. �Ҹ��� �� ����
			boolean Bran = rd.nextBoolean();
			System.out.println(Bran);
		}

	public void Lotto() {
		int six = 6; //�ε� ��ȣ �� �� ���� ������ ����
		
		//Random ��ü ����
		Random rd = new Random();
		//�ߺ����� �ʴ� �ζ� ��ȣ ������ �迭 ����

		//2. ArrayList ����ؼ� ��ٱ��Ϸ� ���!
		List<Integer> lottoNum = new ArrayList<>();
		//�ߺ��� ���ϱ� ���� set�� ����� �� �ִ�.
			// 0����           <6 �̸�
		while(lottoNum.size() < six) {
			int ranNumber = rd.nextInt(45)+1; //1~45 �ڸ��� �������� ��ȣ �ϳ�
			//        ���翩��
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
			if(���࿡ ��ȣ�� ���ٸ�) {
				
			} else {
				����ϰڴ�.
			}
			
		}
 */













//int[]lottoNum = new int[six];
////�ߺ��� ���ϱ� ���� set�� ����� �� �ִ�.
//for(int i =0;i < six;i++) {
//	int isSame;
//	if(lottoNum[i]==)
//}


