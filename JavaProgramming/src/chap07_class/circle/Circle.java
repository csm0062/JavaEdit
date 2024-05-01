package chap07_class.circle;

public class Circle {
	
	// final: 상수
	public final double PI = 3.14;
	public int radius;
	
	// 기본생성자(대소문자도 똑같이 클래스명과 같게)
	public Circle() 
	{
		
	}
	
	//int값 하나를 받아서 radius를 초기화해주는
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	//원의 둘레를 double로 리턴하는 메소드
	public double circleRound() 
	{
		return (2 * PI * radius); 
	}
	
	//원의 넓이를 double로 리턴하는 메소드
	public double circleArea()
	{
		return (PI * radius * radius);
	}
	
	

}
