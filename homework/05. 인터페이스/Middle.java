package chap99_homework.homework05;

import java.util.Scanner;

import chap98_homework.nc230322.reverse.Reverse;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. Reverse라는 클래스를 만들고 메소드로 
//		   String reverseString(String str)를 만듭니다.
//		    매개변수로 받은 str을 거꾸로 만든 String을 리턴하도록 만드세요.
		Reverse reverse = new Reverse();
		
		System.out.print("문자열을 입력하세요.");
		String str1 = sc.nextLine();
		
		System.out.println(reverse.reverseString(str1));
		
//		2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.
		System.out.print("문자열을 입력하세요.");
		String str2 = sc.nextLine();
		int[] idxArr = new int[str2.length()];
		
		int index = 0;
		
		for(int i = 0; i < str2.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(str2.charAt(i) == str.charAt(j)) {
					idxArr[index++] = i;
					break;
				}
			}
		}
		
		String newStr = "";
		
		for(int i = 0; i < str2.length(); i++) {
			boolean isDup = false;
			for(int j = 0; j < index; j++) {
				if(i == idxArr[j]) {
					isDup = true;
					break;
				}
			}
			
			if(!isDup) {
				newStr += str.charAt(i);
			}
		}
		
		System.out.println(newStr);
		
//		3. 사용자가 입력한 문자열에서 3의 배수 자리의 문자는 3으로 
//		5의 배수 자리의 문자는 5로 변경하여 출력하세요.
		System.out.print("문자열을 입력하세요.");
		String str3 = sc.nextLine();
		char[] chArr = str3.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if((i + 1) % 3 == 0) {
				chArr[i] = '3';
			} else if((i + 1) % 5 == 0) {
				chArr[i] = '5';
			}
		}
		
		str3 = new String(chArr);
		
		System.out.println(str3);
		
		sc.close();
	}

}
