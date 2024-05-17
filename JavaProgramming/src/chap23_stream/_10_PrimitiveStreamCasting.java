package chap23_stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _10_PrimitiveStreamCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = i;
		}
		
		
		IntStream intStream = Arrays.stream(intArr);
		
		// 1. 기본 타입 스트림의 형변환
		// 1-1. 다른 기본타입 스트림으로 형변환
		LongStream longStream = intStream.asLongStream();
		
		intStream = Arrays.stream(intArr);
		
		DoubleStream doubleStream = intStream.asDoubleStream();
		
		doubleStream.forEach(dNum -> System.out.println(dNum));
		
		// 1-2. 기본 타입 스트림에서 래퍼클래스 타입의 스트림으로 변환
		// boxed()를 사용해서 래퍼클래스 타입의 스트림으로 변환한다.
		intStream = Arrays.stream(intArr);                         //?
		
		Stream<Integer> integerStream = intStream.boxed();         //래퍼클래스 타입의 스트림으로 변환
		
		integerStream.forEach(num -> {                             //foreach 향상된 포문
			System.out.println(num);
			System.out.println(num.getClass().getSimpleName());
		});
		
		Stream<Double> wrapperStream = doubleStream.boxed();         //래퍼????클래스 타입의 스트림으로 변환
		
			wrapperStream.forEach(num -> {                             //?  
				System.out.println(num);
				System.out.println(num.getClass().getSimpleName());
		});
		
	}

}
