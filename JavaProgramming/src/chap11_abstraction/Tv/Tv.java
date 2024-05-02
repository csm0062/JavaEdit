package chap11_abstraction.Tv;

public abstract class Tv {
	public int lastChannel;
		
		public Tv()    //생성자는 추상화 불가
		{
		lastChannel = 1;
		}
	
	public abstract void powerOn();
		
	public abstract void powerOff();
	
	public abstract void operate(int channel);
	
	public abstract void channelUp();
	
	public abstract void channelDown();
	
	
	
	
	
	
	
	
	
	

}
