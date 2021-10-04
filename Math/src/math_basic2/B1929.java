package math_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//소수구하기 

public class B1929 {
	public static boolean[] primeNum;//초기값 false, if문에서 primeNum[3]에 이후에 대한 값 지정없음
	public static void getPrimeNum() {
		//false가 소수, true 소수X
		primeNum[0] = true;//소수X
		primeNum[1] = true;//소수X
		//에라토스테네스의 체 구현
		for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
			//primeNum[i] == true 이면 이후 수행하지 않고 반북문의 다음 번으로
			if(primeNum[i]) continue;
			//i의 배수들 모두 제거 
			for(int j = i * i; j < primeNum.length; j += i ) {
				primeNum[j] = true;
			}
		}
		
		
	}
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
			
		primeNum = new boolean[N + 1];
		getPrimeNum();//소수를 구합니다
		
		
		//범위 안의 모든 소수 출력하기 
		for(int i = M; i <= N; i++) {
			//false값만 출력 
			if(!primeNum[i]) {
				System.out.println(i + " ");
			}
		}
	}
}
