package chap12_interface.device;

public class LgTv implements Tv {

	@Override
	public void showDisplay() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 화면을 보여줍니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 전원 켬");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 전원 끔");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 노래 틈");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("엘지티비 채널 이동: " + channel);
	}

}
