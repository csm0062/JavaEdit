package _240507_homework;

import java.util.Scanner;

public class _03_Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
//	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
//	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
//	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		//첫글자는 무조건넣기
		if (str.length() > 0)
		{
			sb.append(str.charAt(0));
		}
		
		// 동일문자제외
		for(int i = 1; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			char ch2 = str.charAt(i-1);
			
			if (ch != ch2)
			{
				sb.append(ch);
			}
		}
		
		System.out.println(sb);
		sc.close();
	}

}
