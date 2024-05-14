package chap21_multithread;

import chap21_multithread.threads.SafeExitThread;

public class _10_SafeExitBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeExitThread st = new SafeExitThread();
		
		st.start();
		
		try
		{
			//메인 Thread 일시정지
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}
		
		//SafeExitThread의 run 메소드의 내용을 종료시킨다.
		st.setStop(true);

	}

}
