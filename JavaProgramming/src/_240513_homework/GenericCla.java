package _240513_homework;

public class GenericCla<T> {
	private T t;
	private T t1;
	private T t2;

	
	
	public T getT() {
		return t;
	}



	public void setT(T t) {
		this.t = t;
	}



	public T getT1() {
		return t1;
	}



	public void setT1(T t1) {
		this.t1 = t1;
	}



	public T getT2() {
		return t2;
	}



	public void setT2(T t2) {
		this.t2 = t2;
	}



	public static <T> String add(T t1, T t2)
	{
		
		return String.valueOf(t1) + String.valueOf(false);
	}

}
