package __review;

public class Circle {
//  5. 반지름을 속성으로 갖는 원클래스를 만들고
//	사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며
//	원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
	private int radius;
	
	public Circle(int radius) { //	사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며
		this.radius = radius;
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
	
	public double round() {
		return 2 * 3.14 * radius;  
	}
	
}
