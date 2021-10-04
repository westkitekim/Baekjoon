package math_basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//두 원의 관계(4가지 경우의 수, 접점 1개와 0개의 경우의 수 각각 2개  )
public class B1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testNum = Integer.parseInt(br.readLine());
		int x1, y1, r1, x2, y2, r2;
		
		while(true) {
			if(testNum == 0) break;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			 
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			//두 원의 중심좌표의 거리 
			double d = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1); 
			
			if(x1==x2 && y1==y2 && r1==r2) System.out.println("-1"); 
			else if(Math.pow(r1 + r2, 2) < d || Math.pow(r1 - r2, 2) > d) System.out.println("0");
			else if(Math.pow(r1 + r2, 2) == d || Math.pow(r1 - r2, 2) == d) System.out.println("1");
			else System.out.println("2");
			
			testNum--;
			
		}//for i
		br.close();
		
	}//main
}//class














