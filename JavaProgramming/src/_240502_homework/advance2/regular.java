package _240502_homework.advance2;

public class regular extends Worker {
	public int bonus;
		
	public regular(int eno, String name, int pay, int type,int bonus) 
	{
		super(eno, name, pay, type);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() 
	{
		double monney = (pay / 12 + bonus / 12);
		System.out.println("정규직 월급:" + monney);
		return 0;
	}
	
	
	
	
	

}
