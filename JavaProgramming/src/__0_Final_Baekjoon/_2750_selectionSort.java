package __0_Final_Baekjoon;

import java.util.Scanner;

public class _2750_selectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] intArr = new int[n];
		
//		for(int i : intArr) {
//			i = sc.nextInt();
//		}
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		
		selectionSort(intArr);
		for(int i : intArr) {
			System.out.println(i);
		}
	}
	
	// 선택정렬 메소드 생성하기
	static void selectionSort(int[] arr) {
		int n = arr.length;
		
		// 바깥 루프 생성하기: 배열의 각 원소에 대해 반복해주기
		for(int i = 0; i < n - 1; i++) {
			// 최소값인덱스 정하는 변수 선언
			int minIndex = i;
			
			// 안쪽 루프 생성하기: 현재 인덱스보다 큰 것들 중에서 최소값 찾기
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			// 최소값 찾고 현재 인덱스랑 교환
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
