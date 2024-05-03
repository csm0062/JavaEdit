package chap12_interface;

import chap12_interface.device.ElectronicDevice;
import chap12_interface.device.LgTv;
import chap12_interface.device.SamsungTv;
import chap12_interface.device.Tv;

public class _02_defaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new SamsungTv();
		
		tv.powerOn();
		tv.changeChannel(11);
		// 오버라이드된 default 메소드 사용
		tv.reset();
		
		tv = new LgTv();
		// LgTv는 reset을 오버라이드 하지 않았기 때문에
		// ElectrinicDevice의 기능이 그대로 실행된다.
		tv.reset();
		
		ElectronicDevice.warn();
		
		// static 메소드는 상속받은 자식클래스에서는 사용이 불가능하다.
//		Tv.warn();
		

	}

}
