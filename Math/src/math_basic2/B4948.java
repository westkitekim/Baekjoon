package math_basic2;

import java.util.Scanner;

public class B4948 {
	//���� : 1 �� n �� 123456

	//2n�� ������ 123456 * 2  = 246912,
	//�迭�� 0���� �����ϹǷ� 246912 + 1 = 246913
	public static boolean[] primeNum = new boolean[246913];
	public static void getPrimeNum() {
		primeNum[0] = true;
		primeNum[1] = true;
		
		for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
			if(primeNum[i]) continue;//primeNum[i] == true �̸� �Ʒ� �������� �ʰ� ���� �ݺ�����  
			for(int j = i * i; j < primeNum.length; j += i) {
				primeNum[j] = true;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		getPrimeNum();
		
		while(true) {
			int count = 0;//�� ������ ������� �޶����Ƿ� count���� �Ź� �ʱ�ȭ �ʿ� 
			int n = scan.nextInt();
			if(n == 0) break;
			
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!primeNum[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
