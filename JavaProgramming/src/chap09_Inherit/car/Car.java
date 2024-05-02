package chap09_Inherit.car;

public class Car {
	
	public String company;
	public String model;
	public String color;
	public int price;
	
	public void carInfo()
	{
		System.out.println("제조사: " + this.company);
		System.out.println("모델: " + this.model);
		System.out.println("색상: " + this.color);
		System.out.println("가겨기 " + this.price);
	}
	

}
