package _240514_homework;

public class _01_Basic {
	
//	1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고
//	1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다. 각각의 스레드를 실행하십시오.
	
	// 1. 메인스레드: 메인메소드 영역
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		// 2. 서브 스레드 선언
		Thread subThread = new Thread() {
			
			@Override
			public void run() {
				// 3. 서브스레드가 실행할 코드 작성
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0) {
						System.out.println("30의 약수는: " + i);
					}
					try 
					{
						Thread.sleep(500);
					} 
					catch(InterruptedException ie)
					{
						System.out.println(ie.getMessage());
					}
				}
				
			}
						
		};
		
		subThread.start();
		
		for(int i = 1; i <= 20; i++) {
			if(i % 12 == 0) {
				System.out.println("3과 4의 공배수는: " + i);
			}
			try 
			{
				// Threag.sleep(밀리세컨드): 매개변수로 주어진 밀리세컨드만큼 작업을 일시중지
				// 스레드가 일시정지되면 다음스레드가 실행된다.
				Thread.sleep(500);
				subThread.join();
			} 
			catch(InterruptedException ie)
			{
				System.out.println(ie.getMessage());
			}
		
		}
		
				

	}
	

}
