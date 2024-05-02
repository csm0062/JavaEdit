package chap11_abstraction.Tv;

public class SamsungTv extends Tv {
	
	@Override
	public void powerOn()
	{
		System.out.println("OLED TV 전원을 켭니다.");
		// super 키워드로 생성자를 호출할 때는 항상 최상단에서 사용해야지만
		// 인스턴스 메소드를 사용할 때 위치는 중요하지 않다.
	}
	
	@Override
	public void powerOff()
	{
		System.out.println("OLED TV 전원을 끕니다.");
	}
	
	@Override
	public void operate(int channel)
	{
		this.lastChannel = channel;
		System.out.println("OLED" + this.lastChannel + "로 이동합니다.");
	}
	
	@Override
	public void channelUp()
	{
		System.out.println("OLED" + ++this.lastChannel + "로 이동합니다.");
	}
	
	@Override
	public void channelDown()
	{
		System.out.println("OLED" + --this.lastChannel + "로 이동합니다.");
	}
	
}
