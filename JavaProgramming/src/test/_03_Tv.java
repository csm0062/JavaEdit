package test;

import chap11_abstraction.Tv.LgTv;
import chap11_abstraction.Tv.SamsungTv;
import chap11_abstraction.Tv.Tv;

public class _03_Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.powerOff();
		tv.operate(11);
		tv.channelUp();
		tv.channelDown();
		
		tv = new SamsungTv();
		
		tv.powerOn();
		tv.powerOff();
		tv.operate(9);
		tv.channelUp();
		tv.channelDown();
		
		

	}

}
