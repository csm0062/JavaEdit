package chap99_homework.homework13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
// 		StringBuilderUtils 함수형 인터페이스 선언, StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언

// 		2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 역순으로 변경하는 메소드 reverseSb를 각각 선언하고 StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("def");

		StringBuilder result = appendSb(sb1, sb2, StringBuilder :: append);
		result = reverseSb(result, StringBuilder :: reverse)
// 		3. 매개변수로 받아온 정수 배열에서 최대값, 최소값, 중간값을 구하는 static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고 maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
		for(int i = 0; i < 20; i++) {
			intArr[i] = (int)(Math.random() * 20) + 1;
			System.out.print(intArr[i] + ", ");
		}
		System.out.println();
		
		action5(IntArrUtils :: getMax);
		action5(IntArrUtils :: getMin);
		action5(IntArrUtils :: getMid);
	}

	public StringBuilder appendSb(StringBuilder sb1, StringBuilder sb2, StringBuilderUtils sbu){
		return sbu.combineStrBuilder(sb1, sb2);
	}

	public StringBuilder reverseSb(StringBuilder sb1, StringBuilderUtils sbu){
		return sbu.combineStrBuilder(sb1);
	}

	public static void maxminmid(MaxMinMid mmm) {
		System.out.println(mmm.maxOrMinOrMid(intArr));
	}
}
