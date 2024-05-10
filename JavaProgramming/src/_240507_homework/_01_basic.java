package _240507_homework;

import java.util.Scanner;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(str3);
		
		System.out.println(sb);
		sc.close();

		// 2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    //    비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer sb1 = new StringBuffer(30);
		sb1.append("hello");
		int remainBufferSize = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < remainBufferSize; i++)
		{
			sb1.append("a");
		}
		
		System.out.println(sb1);
		
		

		
		
		
		
		

	}

}
