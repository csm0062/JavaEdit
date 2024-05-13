package _240510_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Map<String, Integer>을 하나 생성하여
//		key는 알파벳(대소문자 구분) 
//		value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
		
		// 맵 생성
		Map<String, Integer> uniMap = new HashMap<>();
		
		// 키와 벨류저장
		for(char ch = 'A'; ch <= 'Z'; ch++)
		{
			//대문자
			// String.valueOf(ch)는 문자 ch를 문자열로 변환하는 메소드
			// 문자열혈태로 알파벳키 사용가능하게하는 것
//			Integer형태로 저장해야하니까 뒤에 값에해당하는 v칸에는 int를 붙여준다.
			uniMap.put(String.valueOf(ch), (int)ch);
		}
		for(char ch = 'a'; ch <= 'z'; ch++)
		{
			//소문자
			uniMap.put(String.valueOf(ch), (int)ch);
		}
		
		//Map에 저장되어 있는 key, value의 쌍을 
		//Map.Entry(Map 인터페이스 안에 선언되어 있는 내부 인터페이스) 타입으로 저장된걸 리턴
		//맵의 각항목의 키와 값을 포함하는 맵의 항목
		for(Map.Entry<String, Integer> entry : uniMap.entrySet())
		{
			System.out.println(entry.getKey() + "키에 해당하는 값은: " + entry.getValue() );
		}
		
		
		
		
		
//		2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 특정 이름의 전화번호를 조회하는 기능을 구현하세요.
		// 맵생성
		Scanner sc = new Scanner(System.in);
		Map<String, String> numBook = new HashMap<>();
		
		System.out.println("주소록에 저장할 이름과 번호를 입력하세요");
		System.out.println("입력을 마치려면 finish를 입력하세요");
		System.out.println("------------------------------");
		while(true)
		{
			// 주소 저장
			System.out.println("주소록에 저장할 이름를 입력하세요");
			String name = sc.nextLine();
			
			// finish일때 나가기
			if(name.equalsIgnoreCase("finish"))
			{
				break;
			}
			
			//번호저장
			System.out.println("주소록에 저장할 번호를 입력하세요");
			String userNum = sc.nextLine();
			
			//numBook에 값넣기
			numBook.put(name, userNum);
			
		}
		
		
		while(true) 
		{
			// 특정 이름의 전화번호를 조회하는 기능을 구현
			System.out.println("조회하실 이름을 입력하세요.");
			String findname = sc.nextLine();
			
			// finish일때 나가기
			if(findname.equalsIgnoreCase("finish"))
			{
				break;
			}

			// numBook이라는 해쉬맵에서 findname를 키값으로 사용하여 값 조회
			// findname키 값에 해당하는  value반환
			String findUserNum = numBook.get(findname);
			
			if(findUserNum != null)
			{
				System.out.println(findname + "님의 전화번호는 " + findUserNum + " 입니다.");
			}
			else
			{
				System.out.println("주소록에 " + findname + "님이 존재하지 않습니다.");
			}
						
		}
		
		
		
		
		sc.close();
		
		
		
		
		
		

	}

}






