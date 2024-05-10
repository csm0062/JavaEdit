package _240507_homework;

import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
	    //비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		
		while(sb.length() < 30)
		{
			sb.append("bit");
		}
		
		sb.setLength(30);
		
		System.out.println(sb);
		
		// 2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 사용자가 정수를 입력하고 
		// 위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.
		
		// 버퍼 생성
		StringBuffer sb1 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		// 정수값 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력해 주세요.");
		int index = sc.nextInt();
		
		sb1.reverse();
		System.out.println(sb1.charAt(index));
		sc.close();
		

	}

}
