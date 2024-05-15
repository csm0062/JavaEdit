package _240514_homework;

public class PrintNum1 extends Thread{
	private NumberPrinter np;



	public NumberPrinter getNp() {
		return this.np;
	}


	public void setNp(NumberPrinter np) {
		this.np = np;
	}



	@Override
	public void run() {
		np.numPrint1(10);
	}
	
	
	

}
