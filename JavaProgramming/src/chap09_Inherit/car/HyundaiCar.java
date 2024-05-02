package chap09_Inherit.car;

public class HyundaiCar {
	public String company;
	public String model;
	public String color;
	public int price;
	
	public void CarInfo()
	{
		System.out.println("제조사: " + this.company);
		System.out.println("모델: " + this.model);
		System.out.println("색상: " + this.color);
		System.out.println("가겨기 " + this.price);
	}
	
	public void autoPilot()
	{
		System.out.println("자율주행한다.");
	

}


}
