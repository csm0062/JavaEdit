package _240502_homework.advance2;

public class Temp extends Worker {
	public int hireYear;

	public Temp(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
//		System.out.println("고용연도: " + hireYear);
	}

	@Override
	public double getMonthPay() {
		double monney = (pay / 12);
		System.out.println("임시직 월급:" + monney);
		return 0;
	}

}
