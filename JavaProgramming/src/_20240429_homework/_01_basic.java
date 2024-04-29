package _20240429_homework;

import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. int num = 10;을 선언하고 증감연산자를 통해 다음과 같이 출력하세요. 출력된 값은 모두 증감연산자가 포함된 상태입니다.
//	     11
//	     12
//	     12
//	     10
//	     10
//	     8
//		System.out.println("1번 답");
//		int num = 10;
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(num--);
//		System.out.println(--num);
//		System.out.println(num--);
//		System.out.println(--num);
//		System.out.println("------------------------------------------------");
		
//		2. 관계연산자(<, >) 두 개를 사용하여 int a = 10; int b = 20; 의 관계를 다음과 같이 출력하세요.
//	    true
//	    false
//		System.out.println("2번 답");
//		int a = 10; int b = 20;
//		
//		System.out.println(a<b);
//		System.out.println(a>b);
//		System.out.println("------------------------------------------------");
//		
//		3. 10 ~ 1까지 거꾸로 while문으로 출력
//		System.out.println("3번 답");
//		int i = 10;
//		while(i >= 1)
//		{
//			System.out.print((i--) + " ");
//		}
//		System.out.print("\n");
//		System.out.println("------------------------------------------------");
		

//		4. 10 ~ 1까지 거꾸로 do ~ while문으로 출력
//		int j = 10;
//		System.out.println("4번 답");
//		do
//		{
//			System.out.print((j--) + " ");
//		} while(j >= 1);
//		System.out.print("\n");
//		System.out.println("------------------------------------------------");
		
		
//		5. 10 ~ 1까지 거꾸로 for문으로 출력
//		System.out.println("5번 답");
//		for(int k = 10; k >= 1; k--) 
//		{
//		System.out.print((k) + " ");
//		}
//		System.out.println("\n");
//		System.out.println("------------------------------------------------");
		
		
//		6. 1 ~ 100까지 합을 while문으로 출력
//		System.out.println("6번 답");
//		int l = 1;
//		int sum = 0;
//		
//		while(l <= 100)
//		{
//			sum += l++; //  sum = sum + l++
//		}
//		System.out.println("1~100까지 합: " + sum);
//		
//		System.out.println("\n");
//		System.out.println("------------------------------------------------");
		
//		7. 1 ~ 100까지 합을 do ~ while문으로 출력
//		System.out.println("7번 답");
//		int num1 = 1;
//		int sum1 = 0;
//		do
//		{
//			sum1 += num1++;	
//		}while(num1 <= 100);
//		
//		System.out.println("1~100까지 합: " + sum1);
//		System.out.print("\n");
//		System.out.println("------------------------------------------------");
		
//		8. 1 ~ 100까지 합을 for문으로 출력
//		System.out.println("8번 답");
//		int sum2 =0;
//		for(int num2 = 1; num2 <= 100; num2++)
//		{
//			sum2 += num2;
//		}
//		System.out.println("1~100까지 합: " + sum2);
//		
//		System.out.print("\n");
//		System.out.println("------------------------------------------------");
		
		
//		9. int 10개짜리 배열 생성하여
//		 int배열에 3의 배수를 차례대로 저장하세요.
//		 그리고 거꾸로 출력하세요.
//		System.out.println("9번 답");
//		int[] numArr = new int[10];
//		for(int n = numArr.length -1; n >= 0; n--)
//		{
//			numArr[n] = (n + 1) * 3;
//			System.out.print(numArr[n] + " ");
//		}
//					
//		System.out.print("\n");
//		System.out.println("------------------------------------------------");
		
//		10. int배열을 10개 생성해서
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 총합을 구하세요.
//		System.out.println("10번 답");
//		Scanner sc = new Scanner(System.in);
//		int[] numArr1 = new int[10];
//		
//		int sum3 = 0;
//		
//		System.out.println("입력하세요.");
//		
//		for(int h = 0; h < numArr1.length; h++)
//		{
//			int userNum = sc.nextInt();
//			numArr1[h] += userNum;
//			System.out.print(numArr1[h] + " ");
//			
//			sum3 += userNum;
//		}
//		System.out.println();
//		System.out.println("총 합은: "+ sum3);
//
//		System.out.println("------------------------------------------------");
//		
//		11. int 배열로 10개의 공간을 생성하세요.
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하세요.
//		System.out.println("11번 답");
//		Random random = new Random();
//		int[] numArr = new int[10];
//		
//		for(int i = 0; i < numArr.length; i++)
//		{
//			int randomVal = random.nextInt(10) + 1;
//			numArr[i] += randomVal;
//		if(!(numArr[i] % 2 ==0))
//			System.out.print(numArr[i] + " ");			
//		}
//		
//		System.out.print("\n");
//		System.out.println("------------------------------------------------");
		
//		12. 정수 10개를 입력받아 배열에 저장하고, 
//		    이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		System.out.println("12번 답");
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[10];
		System.out.println("입력하세요.");
		
		for(int i = 0; i < numArr.length; i++)
		{
			numArr[i] = sc.nextInt();
		}
			
			
		for(int i = 0; i < numArr.length; i++)
		{
			if(numArr[i] % 2 == 0 || numArr[i] % 3 == 0)
			{
				System.out.print(numArr[i] + " ");
			}
		}
		
		sc.close();
		

	}

}
