package math_basic2;

import java.util.Scanner;

public class B4948 {
	//제한 : 1 ≤ n ≤ 123456

	//2n의 수까지 123456 * 2  = 246912,
	//배열은 0부터 시작하므로 246912 + 1 = 246913
	public static boolean[] primeNum = new boolean[246913];
	public static void getPrimeNum() {
		primeNum[0] = true;
		primeNum[1] = true;
		
		for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
			if(primeNum[i]) continue;//primeNum[i] == true 이면 아래 실행하지 않고 다음 반복으로  
			for(int j = i * i; j < primeNum.length; j += i) {
				primeNum[j] = true;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		getPrimeNum();
		
		while(true) {
			int count = 0;//각 수마다 결과값이 달라지므로 count값은 매번 초기화 필요 
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
