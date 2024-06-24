package __Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _20053 {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				
				int num = Integer.parseInt(st.nextToken());
				
				if(num < min) {
					min = num;
				}
				
				if(num > max) {
					max = num;
				}
			}
			sb.append(min).append(" ").append(max).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
	
}