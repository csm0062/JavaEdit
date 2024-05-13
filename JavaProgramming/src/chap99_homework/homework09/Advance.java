package chap99_homework.homework09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Advance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
//	    (Map<Character, Integer> 형태의 Map과 Entry 사용)
		
		Scanner sc = new Scanner(System.in);
		
		/// aabccdea
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		
		Map<Character, Integer> chMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < input.length(); i++) {
			// chMap = {'a': 2}
			// chMap = {a: 2, b: 1}
			// chMap = {a: 2, b: 1, 'c': 1}
			// chMap = {a: 2, b: 1, 'c': 2}
			// chMap = {a: 2, b: 1, 'c': 2, 'd': 1}
			// chMap = {a: 2, b: 1, 'c': 2, 'd': 1, 'e': 1}
			// chMap = {a: 3, b: 1, 'c': 2, 'd': 1, 'e': 1} //최종값 
			
			// 새로운 문자를 넣을때
			// 첫 번째 문자인 경우, 바로 HashMap에 추가합니다.
			if(i == 0) {
				// chMap = {a: 1}
				chMap.put(input.charAt(i), 1);
			} 
			//다음 반복되는 문자
			// HashMap의 entrySet을 가져와서 반복자(Iterator)를 생성합니다.

			else 
			{
				Set<Entry<Character, Integer>> entrySet = chMap.entrySet();
				
				// 순서대로 출력할 수 있게 해주는 클래스
				Iterator<Entry<Character, Integer>> it = entrySet.iterator();
				
				
				// 현재 문자와 일치하는 key를 찾았을 때 사용할 변수들을 초기화합니다.
				int cnt = 0;
				char key = 0;
				
				// 반복자를 사용하여 HashMap의 모든 entry를 순회합니다.
//				hasNext 메서드로 다음 요소의 존재 여부를 확인하고
				//만약 이걸 갖고있으면
				while(it.hasNext()) {
					
					// {a: 1}
					// {a: 2}
					// {a: 2}, {b: 1}
					
					//순서를 넘어가면서 키랑 값을 순번넘기는 메소드.
//					next 메서드로 다음 요소를 가져와서 키와 값을 출력
					Entry<Character, Integer> ent = it.next();
					//iterator.next()로 객체를 꺼내와서
					//그 내용을 변경하게 되면 iterator가 인식하지 못하게
					
					//되어 에러발생
					// a == a
					// a == b
					// a == c, b == c
					if(ent.getKey() == input.charAt(i)) {
						// a
						// last a
						key = ent.getKey(); 
						// 1
						// last 2
						cnt = ent.getValue();
						//System.out.println(ent.getKey() + " : " + ent.getValue());
						break;
					} 
				}
				
				// key = 'a' cnt = 1
				if(key != 0 && cnt != 0) {
					// {'a', 2}
					// last {'a', 3}
					chMap.put(key, ++cnt);
				} else {
					// {'b', 1}
					// {'c', 1}
					chMap.put(input.charAt(i), 1);
				}
				
			}
		}
		
		System.out.println(chMap);
		
		int maxCnt = 0;
		char maxCh = 0;
		
		for(Entry<Character, Integer> ent: chMap.entrySet()) {
			if(ent.getValue() > maxCnt) {
				maxCnt = ent.getValue();
				maxCh = ent.getKey();
			}
		}
		
		System.out.println(maxCh + " : " + maxCnt);

		sc.close();
	}

}
