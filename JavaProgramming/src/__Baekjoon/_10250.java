package __Baekjoon;

import java.util.Scanner;

public class _10250 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int T = in.nextInt();	// 테스트 케이스
 
 
		for(int i = 0; i < T; i++) {
			
			int H = in.nextInt();
			int W = in.nextInt(); 	// 쓸모없는 변수다.
			int N = in.nextInt();
			
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
 
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
		in.close();
	}
}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1. 방 개수를 입력하세요.");
//		int testCnt = sc.nextInt();
//		
//				
//		//각 테스트 데이터는 한 행으로서 H(층수), W(층의 방수), N(번째 손님)
//		// 층수 = 몇번째 손님N인지 나누기 총 층수H의 나머지
//		// 손님N 나누기 높이H가 0일때 그 층이 배정받는 층수Y
//		// YXX 또는 YYXX Y의 시작점이 100자리수
//		for(int i = 0; i < testCnt; i++) {
//			
//			int H = sc.nextInt();; //층 수 (층)
//			int W = sc.nextInt();; //방 수 (호수) XX
//			int N = sc.nextInt();; //몇 번째 손님 
//			
////			int Y = 0;
////			int X = 0;
//			
////			if(N % H == 0) {
////				Y = H * 100;
////			} else {
////				Y = (N % H) * 100;
////			}
////			
////			if(N % H == 0) {
////				X = N / H;
////			} else {
////				X = (N / H) + 1;
////			}
//			
//			if(N % H == 0) {
//				System.out.println((H * 100) + (N / H));
//			} else {
//				System.out.println(((N % H) * 100) + ((N / H) + 1));
//			}
//		}
//	}	
//}

//방 번호는 YXX 나 YYXX 형태인데
//여기서 Y 나 YY 는 층 수를 나타내고 XX 는 엘리베이터에서부터 세었을 때의 번호
//프로그램은 표준 입력에서 입력 데이터를 받는다. 
//프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
//각 테스트 데이터는 한 행으로서 H(층수), W(층의 방수), N(번째 손님), 세 정수를 포함하고 있으며
//각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W). 