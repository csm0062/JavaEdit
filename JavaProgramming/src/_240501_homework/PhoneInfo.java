package _240501_homework;

public class PhoneInfo {
	// 1. PhoneInfo 클래스를 생성하세요.
	String[] names = new String[100];
	String[] phoneNums = new String[100];

	int index = 0;

	public void insertPhoneInfo(String name, String phoneNum) 
	{
	    // 매개변수로 전달된 이름과 번호를 각각의 배열에 저장하는 기능 구현
		names[index] = name;
		phoneNums[index] = phoneNum;
		index++; // 증가시켜줘여 다음번 인덱스에 담아준다.

	}
	public void printAllPhoneInfo() 
	{
	    // 배열에 저장된 모든 이름과 번호를 순서대로 출력하는 기능 구현 
		// String은 null로 초기화기때문에 null이 아닐때까지 출력해야함
		// 
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		for(int i = 0; i < phoneNums.length; i++)
		{
			System.out.println(phoneNums[i]);
		}
		
		
	}
	public void printPhoneInfo(int index) 
	{
	    // 매개변수로 전달된 인덱스에 해당하는 이름과 번호 출력하는 기능 구현
		
		System.out.println(names[index]);
		System.out.println(phoneNums[index]);
				
		
	}
	

	
	
	
}
