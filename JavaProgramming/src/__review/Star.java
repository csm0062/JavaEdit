package __review;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	    //--*--
		//-***-
		//*****	
		//-***-
		//--*--
//		System.out.println("홀수를 입력하세요.");
//		int n = sc.nextInt(); //3번째 줄
//		
//		for(int i = 1; i <= n; i++ ) 
//		{
//			for(int j = 0 ; j < n - i; j++) 
//			{
//				System.out.print("-");
//			}
//			for(int k = 0; k < i + (i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		
//		for(int i = n - 1; i > 0; i--) {
//			for(int j = 0 ; j < n - i; j++) 
//			{
//				System.out.print("-");
//			}
//			for(int k = 0; k < i + (i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		홀수를 입력하세요.
//		3
//		--*
//		-***
//		*****
//		-***
//		--*
		
		
//---------------------------------------------------------------------------------------
		System.out.println("홀수를 입력하세요.");
		int num = sc.nextInt(); //제일 많은 별의 개수
		
		for(int i = 1; i <= (num / 2) + 1; i++ ) //줄 수 (몇 번째 줄인지) 
		{
			for(int j = 0 ; j < (num - i) - 2; j++) //-갯수
			{
				System.out.print(" ");
			}
			for(int k = 0; k < i + (i - 1); k++) {
				System.out.print("*"); //*갯수
			}
			System.out.println();
			
		}
		
		for(int i = (num / 2); i > 0; i--) {
			
			for(int j = 0 ; j < (num - i) - 2; j++) //-갯수
			{
				System.out.print(" ");
			}
			for(int k = 0; k < (2 * i) - 1; k++) {
				System.out.print("*"); //*갯수
			}
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
