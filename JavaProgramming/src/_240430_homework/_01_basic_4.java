package _240430_homework;

public class _01_basic_4
{
		
//	4. int 배열 한 개를 매개변수로 받아서 인덱스 역순으로 출력하는 메소드를 구현하세요.
//  실행클래스의 메인메소드 아래에 static 메소드로 선언하세요.
//  static의 위치는 접근제어자와 리턴타입 사이입니다.
//  (예시 public static void add(int a, int b) { return a + b; })
	
	
		public static int[] arr(int[] num)
		{
			int[] arr2 = new int[num.length];
			
//			for(int i = num.length -1, j = 0; i >= 0; i--, j++)
//			{
//				arr2[i] = num[j];
//			}
			
			for(int i = 0 ;i<num.length;i++)
			{
				arr2[i] = num[(num.length-1) - i];
			}
			return arr2;
		}
		
		public static void main(String[] args) 
		{
			int[] t = new int[5];
			
			for(int i = 0; i <=4; i++) 
			{
				t[i] = i;
			}
			int[] newArr = arr(t);
			
			for(int j =0; j<=4; j++) 
			{
				System.out.print(newArr[j]);
			}
		
		}

 
}

