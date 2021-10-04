package math_basic2;

import java.util.ArrayList;
import java.util.Scanner;

public class B9020 {
	// 제한 4 <= n <= 10000
	// 범위 0 ~ 10000
	// main함수, getPrimeNum()에서 사용
	public static boolean[] primeNum = new boolean[10001];

	// static 객체 생성없이 바로 사용
	public static void getPrimeNum() {
		primeNum[0] = primeNum[1] = true;

		for (int i = 2; i <= Math.sqrt(primeNum.length); i++) {
			if (primeNum[i])
				continue;
			for (int j = i * i; j < primeNum.length; j += i) {
				primeNum[j] = true;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();;
		Scanner scan = new Scanner(System.in);
		// 소수 판별
		getPrimeNum();
		int T = scan.nextInt();
		// T를 1개씩 줄여가면서 Testcase 개수만큼 실행

		while (T-- > 0) {
			
			int n = scan.nextInt();
			int firstNum = n / 2;
			int secondNum = n / 2;
			
			//경우의 수는 무조건 있으므로 소수 + 소수를 찾을 때까지 반복
			while (true) {
				if (!primeNum[firstNum] && !primeNum[secondNum]) {
					//System.out.println(firstNum + " " + secondNum);
					list.add(Integer.toString(firstNum) + " " + Integer.toString(secondNum));
					break;
				}
				firstNum--;
				secondNum++;
			}
			
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
