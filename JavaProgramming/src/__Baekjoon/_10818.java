package __Baekjoon;

import java.util.Scanner;

public class _10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int numCnt = sc.nextInt();
		int[] arr = new int[numCnt];
		
		for(int i = 0; i < numCnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
		sc.close();
	} 
}