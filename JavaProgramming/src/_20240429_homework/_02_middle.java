package _20240429_homework;

import java.util.Random;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 1~100까지의 숫자 중 2와 3의 공배수를 출력하세요.
//		for(int i = 1; i <= 100; i++) 
//		{
//			if(i % 2 == 0 && i % 3 == 0)  
//			{
//				System.out.print(i + ", ");
//			}
//		}
		
//		3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.
//		int num = 1;
//		while(num <= 10)
//		{
//			if(num % 2 == 0)
//			{
//				System.out.println("짝수 값은: " + num);
//			}
//			num++;
//		}

//		4. 1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
//		   그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요.
//		int sum = 0;
//		int i;
//		for(int num = 0; num <= 1000; num++)
//		{
//			if((num % 2 == 0) && (num % 7 == 0))
//			{
//				System.out.println(num);
//				sum += num;
//			}
//			
//		}
//			
//		System.out.println("총 합은: " + sum);
		
//		5. 20개 배열을 선언하세요.
//	    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고
//	    인덱스의 홀수번째는 앞에서부터 출력하고
//	    짝수번째는 뒤에서부터 출력하세요.
		Random random = new Random();
		int[] numArr = new int[20];
	
		for(int i = 0; i < numArr.length; i++)
	    {
			numArr[i] = random.nextInt(100);
	    }
		for(int j = 0; j < numArr.length; j++) {
			if(j % 2 == 1) {
				System.out.println(numArr[j]);
			} else {
				System.out.println(numArr[numArr.length - 2 - j]);
			}
		}
		
		
//	    	System.out.print(numArr[i] + " ");
//	    	sum += numArr[i];
//	    //홀수번쨰가 앞부터 짝수번째가 뒤부터??
//	    
//		System.out.println("총 합은: " + sum);
		
		
	    		
//		6. 중첩 for문을 이용해서 아래와 같이 출력하세요.
//		6-1)  
//		*
//		**
//		***
//		****
//		*****
//		for( int j = 1; j < 6; j++)
//		{
//			for(int k = 0; k < j; k++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		6-2)
//		    *
//		   **
//		  ***
//		 ****
//		*****
		for(int i = 4; i >= 0; i--) 
		{
			for(int j = 0; j < 5; j++) 
			{
				if(i <= j) 
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
//		6-3)
//		*****
//		****
//		***
//		**
//		*
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <5; j++) {
//				if(i <= j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				if(i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
//		6-4)
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
		
		
		
		
	}


