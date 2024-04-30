package chap06_method.calc;

public class CompleteCalculator {
	// int 형 매개변수 2개를 받는 메소드
	// add, sub, mul, div, mod를 구현하세요.
	// 접근제어자는 모두 public으로 생성하고
	// div리턴타입만 double 나머지 메소드는 int로 지정하세요.
	// div와 mod의 두 번째 매개변수가 분모이고 분모에 0이 들어오면 0을 리턴하세요.
	
	// add라는 메소드를 만들어서 int a, b값을 받아서 아래식으로 리턴된다.
	public int add(int a, int b)
	{
		// return문은 결과 값을 반환하는 의미도 있지만 메소드의 종결을 의미하기도 한다.
		return (a + b);
		// return a + b; 라고 해도된다.
	}
	
	public int sub(int a, int b)
	{
		return (a - b);
	}
	
	public int mul(int a, int b)
	{
		return (a * b);
	}
	
    	
	public double div(double a, double b)
	{
		if(b == 0)
		{
			return 0;
		}
		return (a / b);
	}
	
	public int mod(int a, int b)
	{
		if(b == 0)
		{
			return 0;
		}
		return (a % b);
	}
	
	
	
	
	
	

}
