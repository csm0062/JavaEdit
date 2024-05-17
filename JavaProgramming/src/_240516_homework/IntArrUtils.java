package _240516_homework;

import java.util.Arrays;

public class IntArrUtils {

//	3. 매개변수로 받아온 정수 배열에서 
//	최대값, 최소값, 중간값을 구하는 
//	static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고
//	maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고 
//	람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.
	

	
		public static int getMax(int[] numArr) {
			Arrays.sort(numArr);
			return numArr[numArr.length-1];
		}

		public static int getMin(int[] numArr) {
			Arrays.sort(numArr);
			return numArr[0];
		}

		public static int getMid(int[] numArr) {
			Arrays.sort(numArr);
			if(numArr.length%2==0) return numArr[numArr.length/2];
			else return numArr[numArr.length/2];
		}
		
		
		
		

	}
	


