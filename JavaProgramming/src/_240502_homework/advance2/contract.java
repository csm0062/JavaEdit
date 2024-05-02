package _240502_homework.advance2;

public class Contract extends Worker {
	public int workDay;
	
	public Contract(int eno, String name, int pay, int type, int workDay)
	{
		super(eno, name, pay, type);
		this.workDay = workDay;	
	}

	

	@Override
	public double getMonthPay() {
		double monney = (pay * workDay);
		System.out.println("계약직 월급: " + monney);
		return 0;
	}

}
