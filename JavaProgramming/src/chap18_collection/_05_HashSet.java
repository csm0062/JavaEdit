package chap18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _05_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Set 객체 생성
		Set<String> strSet = new HashSet<>();
		
		// 2. Set 데이터 추가
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("JavaSvript");
		strSet.add("HTML/CSS");
		
		System.out.println(strSet); //[Java, HTML/CSS, JavaSvript, JDBC]
		System.out.println(strSet.size());
		
		// 3. Set 중복된 데이터 추가
		// ArrayList는 중복된데이터가 허용되어 뒤에 붙지만
		// Set은 중복된 데이터를 허용하지 않는다.
		strSet.add("Java");
		strSet.add("JDBC");
		
		System.out.println(strSet); //[Java, HTML/CSS, JavaSvript, JDBC] 위와 동일하다 중복된 데이터를 허용하지 x
		System.out.println(strSet.size());
		
		// 4. Set은 데이터의 순서가 없기 떄문에 인덱스로 데이터에 접근할 수 있는 방법이 없다.
		// Collection의 Iterator를 이용해서 Set에 담겨있는 데이터에 하나씩 접근해서 사용한다.
		// Iterator 객체를 생성할 때는 Collection이 생성된 제네릭 타입과 동일하게 지정해야한다.
		Iterator<String> iterator = strSet.iterator();
		
		// Iterator의 hasNext(): 데이터가 남아있는지 검사하는 메소드, 남아있으면 true, 없으면 false
		while(iterator.hasNext())
		{
			// Iterator의 next(): Iterator 객체를 생성할 때 지정한 제네릭 타입의 데이터를 하나씩 꺼내주는 메소드
			String str = iterator.next();
			
			System.out.println(str);
//			Java
//			HTML/CSS
//			JavaSvript      이렇게 값이 나온다.
//			JDBC
		}
		
		
		// 5. 특정 값 제거
		strSet.remove("Java"); //값을 지정해서 삭제해준다. //값을 지정하지 않으면 삭제할 수 없다.
		strSet.remove("C"); //없는건 당연하게도 삭제하지 x
		strSet.remove(10); // 스트링으로 만들었기때문에 이것또한 삭제x
		
		System.out.println(strSet);
		System.out.println(strSet.size()); //Java만 삭제 했으니 3개가 남는다.
		
		// 6. Set 비우기
		strSet.clear();
		
		System.out.println(strSet.size()); // 모두 삭제해서 0개가 남는다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
