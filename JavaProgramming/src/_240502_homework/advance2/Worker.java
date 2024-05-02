package _240502_homework.advance2;

public abstract class Worker {
	public int eno; // 사번
	public String name; // 이름
	public int pay; // 급여
	public int type; //근무형태 1: 정규직, 2: 계약직, 3. 임시직
	
	public Worker(int eno, String name, int pay, int type) 
	{
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		this.type = type;
	}
	
	public abstract double getMonthPay();
	
	
	public void showEmployeeInfo()
	{
		System.out.println("사번: " + eno);
		System.out.println("이름: " + name);
		System.out.println("급여: " + pay);
		System.out.println("근무형태: " + type);
	}
	

}
