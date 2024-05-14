package chap21_multithread.threads;

public class PrintNumWaitNotify {
	private int num;
	
	public void setNum(int num)
	{
		this.num = num;   // 왜 이렇게 지정하는지
	}
	
	public synchronized void printNum1 (int num)
	{
		this.setNum(num);
	
	
		for(int i = 1; i <= this.num; i++)
		{
			System.out.println("스레드 1- " + (i * 2 - 1));
			
			notify();
			
			try
			{
				// 2. 이 스레드를 일시정지 상태로 변경
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie.getMessage());
			}
		}
		
		// 1. 다른 스레드를 실행대기 상태로 변경
		// wait(); 호출하여 이 스레드가 일시정지되기 전에
		// 다른 스레드를 실행대기 상태로 변경해야한다.
		
		
		
	}

	public synchronized void printNum2(int num)
	{
		this.num = num;
		
		for(int i = 1; i <= this.num; i++)
		{
			System.out.println("스레드 2 -" + (i * 2));
			
			notify();
			
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie.getMessage());
			}
			
		}
		
			
	}
}




