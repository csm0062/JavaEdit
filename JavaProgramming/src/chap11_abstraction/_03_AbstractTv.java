package chap11_abstraction;

import chap11_abstraction.Tv.LgTv;
import chap11_abstraction.Tv.SamsungTv;
import chap11_abstraction.Tv.Tv;

public class _03_AbstractTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
			
		System.out.println("--------------------------------------");
		tv = new SamsungTv();
			
		tv.powerOn();
		tv.operate(23);
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();

	}

}
