package _240502_homework.basic2;

public class Parent {
	public String lastName;
	public String bloodType;
	public int height;
	public String skinColor;
	
	public Parent()
	{
	
	}
	
	public Parent(String lastName, String bloodType, int height, String skinColor)
	{
		this.lastName = lastName;
		this.bloodType = bloodType;
		this.height = height;
		this.skinColor = skinColor;
	}
	
	
	public void personalInfo()
	{
		System.out.println("성씨: " + lastName);
		System.out.println("혈액형: " + bloodType);
		System.out.println("키: " + height);
		System.out.println("피부색: " + skinColor);
	}
	

}
