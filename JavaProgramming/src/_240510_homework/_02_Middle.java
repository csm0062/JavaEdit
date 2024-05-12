package _240510_homework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)
		
		// 스캐너 받아오고 맵생성해서 학생들의 데이터를 입력
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> score = new HashMap<>();
		
		for(int i = 1; i <= 4; i++)
		{
			System.out.println("학생의 이름을 입력해주세요.");
			String name = sc.nextLine();
			System.out.println("학생의 점수를 입력해주세요.");
			int testScore = sc.nextInt();
			score.put(name, testScore);
			
			//최고점 점수 학생 이름과 점수출력
			String highestName;
			
			// 반복문 없이도 Collections.max() 메소드를 사용
			// 주어진 컬렉션중 가장 큰 요소를 반환하는 메서드
//			이 메서드는 Collections 클래스의 정적 메서드로 제공
//			예를 들어, List<Integer>와 같은 정수형 리스트가 주어졌을 때,
//			Collections.max()를 사용하면 해당 리스트에서 가장 큰 정수를 찾아줌
//			Collections.max() 메서드는 제네릭 타입을 받기 때문에
//			다양한 종류의 컬렉션(리스트, 셋, 맵)에 대해 사용할 수 있습니다.
			int highestScore= Collections.max(score.values());
					
			for(Map.Entry<String, Integer> entry : score.entrySet())
				{
					if(entry.getValue() > highestScore)
					{
						highestName = entry.getKey();
						highestScore = entry.getValue();
							
					}
				}
			
		}
		

		
		
//		2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.

		
		
		
		
		
		
//		3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
//		{1: 3, 2: 4, 3: 5}
//		1 : 5
//		2 : 4
//		3 : 3

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
