package chap20_enum.enums;

public enum RGB {
	// RED, GREEN, BLUE	상수선언
	// 값은 4개를 같는다
	// 첫 번째 값은 소문자 색상이름
	// 두 번째, 세 번째, 네 번째 값은 int
	// 두 번째 값은 빨간색 농도(255가 최대값) red가 255  나머지 0
	// 세 번째 값은 초록색 농도(255가 최대값) green이 255 나머지 0
	// 네 번째 값은 파란색 농도(255가 최대값) blue가 255 나머지 0
	
	// 1. 값이 여러개인 상수 선언
	// 첫 번째 선언된 상수 값의 타입, 개수와 일치시켜서 만들어야한다.
	RED("red",255,0,0),
	GREEN("green",0,255,0),
	BLUE("blue",0,0,255);
	
	// 2. 상수에 지정된 값을 받아줄 변수 선언. 항상 private으로 선언한다.
	// 변수가 private으로 선언되기 때문에 getter/setter 메소드를 항상 정의한다.
	// 생성자에서 해당 상수 값으로 초기화 될 수 있도록 한다.
	private int redValue;
	private int greenValue;
	private int blueValue;
	private String colorValue;
	
	// 3. 생성자에서도 지정된 값의 개수만큼의 변수를 초기화한다.
	RGB(String colorValue, int redValue, int greenValue, int blueValue)
	{
		this.colorValue = colorValue;
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	// 4. 지정된 값의 개수만큼 getter 메소드 선언
	public String getColor()
	{
		return this.colorValue;
	}
	
	public int getRed()
	{
		return this.redValue;
	}
	
	public int getGreen()
	{
		return this.greenValue;
	}
	
	public int getBlue()
	{
		return this.blueValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
