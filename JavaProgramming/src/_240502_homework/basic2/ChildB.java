package _240502_homework.basic2;

public class ChildB extends Parent {
	
	public String fingerPrint;
	
	public ChildB(String lastName, String bloodType, int height, String skinColor, String fingerPrint)
	{
		super(lastName, bloodType, height, skinColor);
		this.fingerPrint = fingerPrint;
	}
	

}
