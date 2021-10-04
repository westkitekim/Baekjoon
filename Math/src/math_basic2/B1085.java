package math_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 1. x, y, w - x �� h - y �� 4�� �� �ּҰ� ��ȯ
 * 2. x, y ��  ���� : 1 <= x <= w - 1 
 * 					 1 < = y <= h - 1 
 */
public class B1085 {//main���� throws �ϸ� jvm�� exception ó��(���� ����� �ƴ�)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�������� ����
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//nextToken()�� String���� ��ȯ 
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] arr = {x, y, w - x, h - y};
		int min = x;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		
		/*
		 * Math Ŭ���� �̿�
		 * 
		 * int x_min = Math.min(x, w - x);
		 * int y_min = Math.min(y, h - y);
		 * 
		 * System.out.println(Math.min(x_min, y_min));
		 */
	}
}
