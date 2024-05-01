package _240430_homework;

import _240430_homework_mathod.ConcatString;

public class _01_basic_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2. ConcatString 클래스를 하나 만들고 String 타입의 값 2개를 매개변수로 받아서 
//		문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.
		
		int num = 10;
		String result;
		String str1 = "bit";
		String str2 = "camp";
		
		
		
		ConcatString cs = new ConcatString();
		
		
		result = cs.concat(str1, str2);
		System.out.println(result);
		
		result = cs.add(str1, str2, num);
		System.out.println(result);

	}

}
