package _240517_homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
//		 intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
		// 리스트 생성
//		List<Integer> intList = new ArrayList<>();
//		
//		Random rd = new Random();
//		
//		// 랜덤 값 저장
//		for(int i = 0; i < 10; i++) {
//			intList.add(rd.nextInt(10) + 1); //1~10까지 랜덤값 1더해준건 0부터니까 1부터로 바꾸려고
//		}
//		System.out.println(intList);
//		
//		
//		List<Integer> intList2 = intList.stream()
//										.map(num -> num * 3)
//										.collect(Collectors.toList());
//		
//		System.out.println(intList2);
//			   

//		2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
		List<String> strList = new ArrayList<>();
		
		System.out.println("문자를 입력하세요.");
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "번째 문자입력: ");
//			String str = sc.nextLine();
//			strList.add(str);
			strList.add(sc.nextLine());
		}
		
		List<String> strList2 = strList.stream()
									   .filter(strl -> strl.length() >= 5)
									   .collect(Collectors.toList());
		System.out.println(strList2);
//		
//		
		
		
		

//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 
//		스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.

		List<String> strList3 = new ArrayList<String>();
		
		System.out.println("문자를 입력하세요.");
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print((i+1) + "번째 문자입력: ");
			String str = sc.nextLine();
			strList3.add(str);
		}
		
		
		
		List<String> strList4 = strList3.stream()
									   .filter(str -> str.matches(".*[a-zA-Z]+.*"))
									   .collect(Collectors.toList());
		System.out.println(strList4);
		
		
		
		
		
		
		
		
		

	}

}
