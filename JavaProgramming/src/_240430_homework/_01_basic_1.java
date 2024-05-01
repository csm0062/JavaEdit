package _240430_homework;

public class _01_basic_1 {
	public static void main(String[] args) {
		
		System.out.println(add(3));
		
	}
	
//	1. int 값을 하나 매개변수로 전달받아서 1부터 매개변수로 전달된 값까지의 총합을 구해서 
//     총합을 리턴하는 메소드를 구현하세요. 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. 
//     static의 위치는 접근제어자와 리턴타입 사이입니다. 
//     (예시 public static void add(int a, int b) { return a + b; })
	public static int add(int a)
	{
		int sum = 0;
		for(int i = 1; i <= a; i++ )
		{
			sum += i;
		}
		 return sum;
	}
	
	

	
	
	



}
