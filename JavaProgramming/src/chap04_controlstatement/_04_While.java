
package chap04_controlstatement;

public class _04_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 1 ~ 100까지의 합
		int num = 1;
		int sum = 0;
		
		while(num <= 100)
		{
			sum += num++;
		}
		
		System.out.println("1~100까지의 합: " + sum);
		System.out.println("------------------------");
		
		
		// 2. while문을 이용해서 1~10까지 거꾸로 출력하세요.
		int num1 = 10;
		
		while(num1 >= 1)
		{
			System.out.println("1~10까지 거꾸로 출력: " + (num1--)
					);
		}
		
		for(int j =10; j > 0; j--)
		{
			System.out.println("1~10까지 거꾸로 출력: " + j);
		}
		
	
		

	}

}
