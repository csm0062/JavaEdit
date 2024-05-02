package _240502_homework.advance2;

public class test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker worker = new regular(1, "수민", 1200000, 1, 44000);
		
		worker.getMonthPay();
		worker.showEmployeeInfo();
		System.out.println();
		
		worker = new temp(2, "민수", 120000, 2, 4);
		
		worker.getMonthPay();
		worker.showEmployeeInfo();
		System.out.println();
		
		worker = new contract(3, "뚜우", 12000, 3, 2);
		
		worker.getMonthPay();
		worker.showEmployeeInfo();
		
		
				

	}

}
