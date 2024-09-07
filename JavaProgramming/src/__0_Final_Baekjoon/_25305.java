package __0_Final_Baekjoon;

import java.util.Scanner;

public class _25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] scoreArr = new int[n];
		
		// 모든 응시자의 성적 입력받기
		for(int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = sc.nextInt();
		}
		sc.close();
		
		// 내림차순 정렬하기 -> 삽입정렬로 풀어보기
		for(int index = 1; index < scoreArr.length; index++) {
			int temp = scoreArr[index];	//1번 인덱스부터
			int prev = index - 1;		//0번 인덱스부터
			
			//prev인덱스 값이 temp보다 작으면 자리이동
			while(prev>=0 && scoreArr[prev]<temp) {
				scoreArr[prev+1] = scoreArr[prev];	//낮은 성적 뒤로 한 칸
				prev--;
			}
			scoreArr[prev+1] = temp;	//prev 앞으로 한 칸 or 자리 유지 (while문 통과 x)
		}

		//출력
		System.out.println(scoreArr[k-1]);
        
	}
}
