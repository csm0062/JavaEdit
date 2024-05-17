package chap23_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _05_UseFulMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
		}
		
		// 1. forEach: Stream 요소에 하나씩 접근하여 작성한 코드를 실행
		// Stream 에 담겨있는 요소의 개수만큼 코드가 실행된다.
		// 최종단계 메소드이고 리턴값이 없다 (void)
		
		intList.stream()
		       .forEach(num -> System.out.println(num));
		
		intList.stream()
			   .forEach(num -> {
				   if(num % 2 == 0)
					   System.out.println(num);
			   });
		
		System.out.println("@-------------------------------------------------------------------------");
		
		// 2.filter: Stream의 요소중 특정 조건에 만족하는 요소들만 모아서 새로운 Stream을 리턴
		// 중간단계 메소드, 람다식을 구성할 때 구현부에 true나 false가 리턴될 수 있도록 비교식이나 조선식을 사용해야한다.
		intList.stream()
			    // 5보다 큰 숫자만 모아서 Stream<Integer> 형태로 리턴
			   .filter(num -> num > 5)
			   .forEach(num -> System.out.println(num));
	
		System.out.println("@@------------------------------------------------------------------------");
		
		// int 배열 2개 선언해서
		// 첫 번째 배열에서 두 번째 배열에 있는 값을 제거한 후 출력
		// Set, filter, forEach\
		int[] intArr1 = {1, 5, 6 ,9, 8, 10};
		int[] intArr2 = {5, 8, 8, 7, 9, 10, 10};
		
		Set<Integer> intSet = new HashSet<>(); // Set은 중복이 허용이 x
		
		for(int num : intArr2) {
			intSet.add(num);
		}
//		for(int i = 0; i < intArr1.length; i++) {
//			intSet.add(intArr1[i]); //intSet 에 intArr1 의 값들을 넣어주기
//		}
//		
//		for(int i = 0; i < intArr2.length; i++) {
//			intSet.add(intArr2[i]);//intSet 에 intArr2 의 값들을 넣어주기
//		}
		
		Arrays.stream(intArr1) //Arrays?
			  .filter(num -> !intSet.contains(num))
			  .forEach(num -> System.out.println(num));
		
		System.out.println("@@@-----------------------------------------------------------------------");
		
		// 3. map: 실행코드의 결과값들을 모아서 새로운 Stream을 리턴
		// 새로운 Stream에 담길 요소들을 리턴해줘야되기때문에 리턴구문이 필수적이
		intList.stream()
			   // intList에 담긴 요소들의 제곱들로 구성된 새로운 Stream 리턴
		  	   .map(num -> num * num)
		  	   .forEach(num -> System.out.println(num));
		
		// intList에 담긴 값 중 짝수는 제곱으로 변경하고 홀수는 값 그대로 리턴해서 새로운 스트림을 만들고
		// foreach로 출력
		intList.stream()
		       .map(num -> {if(num % 2 == 0) {
		    	  return  num * num;
		       }return num;
		       })
		       .forEach(num -> System.out.println(num));
		
		System.out.println("@@@@------------------------------------------------------------------------");
		
		// 4. reduce: 하나의 결과값(누적)을 도출하기 위해 사용
		// 최종단계
		// reduce(누적값의 초기값, (누적값이 될 변수, 요소에 하나씩 접근할 변수, 요소의 인덱스) -> 누적값에 누적할 실행코드);      여기서 인덱스는 안써도된다 (선택)
		int sum = intList.stream()
						 .reduce(0,(acc, num) -> acc + num)
						 .intValue();
		System.out.println(sum);
		
		// intList 요소들을 모두 곱한 값을 구하세요.
		// stream, reduce 메소드 사용
		int mul = intList.stream()
						 .reduce(1, (acc, num) -> acc * num)
						 .intValue();
		System.out.println(mul);
		
		System.out.println("@@@@@------------------------------------------------------------------------");
		
		// intList에서 짝수는 /2 홀수는 /3 한 값들을 모두 더한 값을 구하세요.(map, reduce 사용)
		int tof = intList.stream()
						 .map(num -> {if(num % 2 == 0) {
					    	  return  num / 2 ;
					       }return num / 3;
					       })
						   .reduce(0, (acc, index) -> acc + index)
						   .intValue();
		System.out.println(tof);
		
		System.out.println("@@@@@@------------------------------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
