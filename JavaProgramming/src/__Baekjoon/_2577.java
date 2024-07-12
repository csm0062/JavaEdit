package __Baekjoon;

import java.util.Scanner;

public class _2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//
//예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
//계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(num);
		sc.close();
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				//여기서 '0'와 아스키코드 48이 같은값이라 원래 아스키코드 51이 3이기 때문에 -48을 해주던 -'0'을 해줘야한다.
				if((str.charAt(j) - '0') == i) { 
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
