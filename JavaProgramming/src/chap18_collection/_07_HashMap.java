package chap18_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _07_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Map 객체 생성
		////////////// Map은 인터페이스 이기 때문에 상속받은 HashMap을통해 상속받아야한다.
		// Map은 Key, Value 쌍으로 데이터(엔트리:entry)가 저장되기 때문에
		// 제네릭 타입도 Key,Value 두 개를 지정해야 한다.
		Map<String, String> carMap = new HashMap<>();
		
		// 2. Map에 데이터 추가
		// put(key, value): key, value 한 쌍의 엔트리를 생성해서 Map에 저장
		// key, value 모두 Map을 생성할 때 지정한 제네릭 타입의 값을 넣어줘야 한다.
		// 순서가 없다.
		// carMap의 형태
		/*
		 * {
		 * 		company: 현대,
		 * 		model: 제네시스,
		 * 		price: 5000,
		 * 		color: 검정
		 * }
		 * 
		 */
		carMap.put("company", "현대");
		carMap.put("model", "제네시스");
		carMap.put("price", "5000");
		carMap.put("color", "검정");
		
		System.out.println(carMap); //{color=검정, price=5000, company=현대, model=제네시스} ->이렇게 순서가 없게 나옴
		System.out.println("----------------------------------");
		
		// 3.key는 중복값이 허용되지 않고, value는 중복값이 허용된다.
		carMap.put("discountPrice", "5000"); //랜덤자리에 새로 만들어지고
		carMap.put("color", "빨강"); // 색상은 같은키 안에 value값이 다르게 넣어주니까 '빨강'으로 덮어쓴다.
		
		System.out.println(carMap);
		System.out.println("----------------------------------");
		
		// 4. key 값에 매핑된 value 값 가져오기
		// get(key) -> key값에 지정된 value값 가져오는것
		System.out.println(carMap.get("company"));
		System.out.println(carMap.get("discountPrice"));
		System.out.println("----------------------------------");
		
		// 5. key의 값을 모를 때
		// keySet 메소드를 통해 Key의 값 가져오기
		// Set<Key>
		Set<String> keySet = carMap.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext())
		{
			String key = iterator.next();
			
			System.out.println(key);
			System.out.println(carMap.get(key));
			
		}
		System.out.println("----------------------------------");
		
		// 6. entrySet 활용하기
		// key, value값을 모두 모르는 상태고 다 확인하고 싶을 때
		/*
		 * enterSet 메소드를 사용하면 Set<Entry> 형태로 리턴되고
		 * Set<Entry>의 형태는
		 * [
		 * 		{company: 현대},
		 * 		{model: 제네시스},
		 * 		{price: 5000},
		 * 		{color: 검정} 	
		 * ] 
		 * 
		 */
		Set<Entry<String,String>> entrySet = carMap.entrySet();
		
		Iterator<Entry<String,String>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext())
		{
			Entry<String, String> entry = entryIterator.next();
			
			// Entry의 getKey, getValue 메소드
			// getKey: Entry 객체에 담겨있는 Key를 리턴하는 메소드
			// getValue: Entry 객체에 담겨있는 Value를 리턴하는 메소드
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
			if(entry.getKey().equals("price"))
			{
				// setValue: Entry 객체에 담겨있는 Value 값 변경
				entry.setValue("6000");
			}
			
		}
		System.out.println("----------------------------------");
		System.out.println(carMap);
		
		
		
		
		
		
		
		
		

	}

}
