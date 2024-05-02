package _240502_homework.advance2;

public class temp extends Worker {
	public int hireYear;

	public temp(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double monney = (pay / 12);
		System.out.println("임시직 월급:" + monney);
		return 0;
	}

}
