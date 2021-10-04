package math_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 1. x, y, w - x 와 h - y 총 4개 중 최소값 반환
 * 2. x, y 의  제한 : 1 <= x <= w - 1 
 * 					 1 < = y <= h - 1 
 */
public class B1085 {//main에서 throws 하면 jvm이 exception 처리(좋은 방법은 아님)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//공백으로 구분
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//nextToken()은 String으로 반환 
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
		 * Math 클래스 이용
		 * 
		 * int x_min = Math.min(x, w - x);
		 * int y_min = Math.min(y, h - y);
		 * 
		 * System.out.println(Math.min(x_min, y_min));
		 */
	}
}
