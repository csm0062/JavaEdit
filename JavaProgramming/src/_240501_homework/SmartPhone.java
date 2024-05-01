package _240501_homework.basic;

public class SmartPhone {
	
	public int memory;
	public String color;
	public String model;
	
	public SmartPhone()
	{
		
	}
	
	public void turnOn()
	{
		System.out.println("전원을 켜다.");
	}
	
	public void turnOff()
	{
		System.out.println("전원을 끄다.");
	}
	
	public void volumeUp()
	{
		System.out.println("소리를 높인다.");
	}
	
	public void volumeDown()
	{
		System.out.println("소리를 낮춘다.");
	}
	
	public void printCarInfo()
	{
		System.out.println("메모리: " + memory);
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}
	

}
