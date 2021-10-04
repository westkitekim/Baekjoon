package math_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�Ҽ����ϱ� 

public class B1929 {
	public static boolean[] primeNum;//�ʱⰪ false, if������ primeNum[3]�� ���Ŀ� ���� �� ��������
	public static void getPrimeNum() {
		//false�� �Ҽ�, true �Ҽ�X
		primeNum[0] = true;//�Ҽ�X
		primeNum[1] = true;//�Ҽ�X
		//�����佺�׳׽��� ü ����
		for(int i = 2; i <= Math.sqrt(primeNum.length); i++) {
			//primeNum[i] == true �̸� ���� �������� �ʰ� �ݺϹ��� ���� ������
			if(primeNum[i]) continue;
			//i�� ����� ��� ���� 
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
		getPrimeNum();//�Ҽ��� ���մϴ�
		
		
		//���� ���� ��� �Ҽ� ����ϱ� 
		for(int i = M; i <= N; i++) {
			//false���� ��� 
			if(!primeNum[i]) {
				System.out.println(i + " ");
			}
		}
	}
}
