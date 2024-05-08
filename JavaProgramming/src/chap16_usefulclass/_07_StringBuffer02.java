package chap16_usefulclass;

public class _07_StringBuffer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer(100);
		StringBuffer sb2 = new StringBuffer("bitcamp");
		StringBuffer sb3 = new StringBuffer();
		
		// 1. append: 기존 StringBuffer에 새로운 문자열을 추가하여 StringBuffer타입으로 리턴
		// StringBuffer의 append는 원본 데이터를 수정한다.
		sb1.append("navercloud");
		
		System.out.println(sb1);
		
		sb3.append("bitcamp");
		System.out.println(sb3);
		
		// String은 원본 데이터는 수정되지 않는다.
		// str에 저장되어있는 문자열은 그대로 유지된다.
		
		String str = "";
		str.concat("navercloud");
		System.out.println(str);
		
		// 2. capacity: 버퍼의 크기를 리턴
		//    length: StringBuffer에 저장되어있는 문자열의 길이 리턴
		System.out.println(sb1.capacity()); //100
		System.out.println(sb1.length());  //10
		
		// sb2는 생성할때 문자열 길이 + 16 크기만큼 버퍼의 크기로 잡힌다.
		System.out.println(sb2.capacity()); //23 (7+16)
		System.out.println(sb2.length()); //7
		
		// sb3는 16크기의 버퍼를 생성해서 append 메소드로 문자열을 추가했기 떄문에
		// 버퍼의 크기는 늘어나지 않고 문자열이 추가된다.
		// 버퍼의 크기인 16보다 긴 문자열을 append하면 자동으로 문자열의 길이에 맞춰서
		// 버퍼의 크기가 증가한다.
		System.out.println(sb3.capacity()); //16
		System.out.println(sb3.length()); //7
		
		// 3.  StringBuffer에 남아있는 버퍼의 크기
		int remainBufferSize = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < remainBufferSize; i++)
		{
			sb1.append("a");
		}
		
		System.out.println(sb1);
		
		// 4. delete: 매개변수로 주어진 시작 인덱스부터 끝 인덱스까지의 
		// 문자열을 삭제한 새로운 StringBuffer리턴
		// 끝 인덱스의 문자는 포함되지 않는다.
		sb2.delete(3, 7); //camp만 날라간다.
		System.out.println(sb2);
		
		// deleteCharAt: 해당 인덱스의 문자 하나만 삭제
		sb2.append("camp")
		   .deleteCharAt(3);
		System.out.println(sb2);
		
		// 5. insert: 첫 번째 매개변수 위에 두 번째 값을 삽입
		sb2.insert(3, "c");
		System.out.println(sb2);
		
		// 6. reverse: StringBuffer에 저장되어 있는 문자열을 역순으로 정렬
		StringBuffer sb5 = sb2.reverse();
		System.out.println(sb5);
		
		// 7. setCharAt: 첫 번째 매개변수로 주어진 인덱스 위치에 있는 문자를 두번째 매개변수로 주어진 값으로 변경
		sb2.setCharAt(2, 'u');
		
		System.out.println(sb2);
		
		// 8. setLength: StringBuffer에 저장되어있는 문자열의 길이를 매개변수로 변경
		// 저장되어 있는 길이보다 매개변수가 클 때는 빈 곳을 공백으로 채운다.
		// 저장되어 있는 길이보다 매개변수가 작을 때는 저장되어 있는 문자열에서 남은 부분은 삭제
		sb2.setLength(20);
		sb1.setLength(20);
		
		//공백이있는지 확인하기위해서 예제로 @붙여둠
		System.out.println(sb2 + "@"); 
		System.out.println(sb1);
		
		// capacity는 변경되지 않는다.
		System.out.println(sb2.capacity());
		System.out.println(sb1.capacity());
		
		// sb2에 있는 공백 삭제
		System.out.println(sb2.toString().trim());
		
		
		
		
		
		
		
		
		
		
	}

}
