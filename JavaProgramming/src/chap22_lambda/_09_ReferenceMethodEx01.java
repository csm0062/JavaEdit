package chap22_lambda;

import java.util.Scanner;

import chap22_lambda.basiclambda.ConvertcaseString;

public class _09_ReferenceMethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printConvertCase(s -> s.toLowerCase());
		printConvertCase(String::toLowerCase);
		

	}
	
	public static void printConvertCase(ConvertcaseString convertcaseString) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 단어를 입력하세요.");
		String str = sc.nextLine();
		
		System.out.println("입력받은 문자열: " + str);
		
		// 함수형 인터페이스의 추상메소드 호출
		// 함수형 인터페이스의 메소드는 추상메소드라 어떤 동작을 할지 알 수 없는 상태
		// 리턴타입이랑 매개변수 타입만 알 수 있다.
		// 함수형 인터페이스의 추상메소드의 동작은 추상메소드가 호출되는 메소도의 매개변수로
		// 람다식을 전달하면서 만들어준다.
		                                      //여기에 담긴다.
		String convertStr = convertcaseString.toConvertcase(str);
		
		System.out.println("변환된 문자열: " + convertStr);
		
		sc.close();
	}

}
