package _240501_homework;

public class Rect {
	public int width;
	public int height;
	
	public Rect()
	{
		
	}
	
	public Rect(int width)
	{
		this.width = width;
	}
	
	public Rect(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public int Round()
	{
		return 2 * (width + height);
	}
	
	public int Area()
	{
		return  width * height;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
