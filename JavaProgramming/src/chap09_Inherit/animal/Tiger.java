package chap09_Inherit.animal;

public class Tiger extends Animal{
	String skin;
	
	public Tiger()
	{
		//super(); => 자동적으로 호출됐다고 생각하면된다.
	}
	
	public Tiger(int age, String size, boolean hasWing)
	{
		// 자식클래스에서만 사용할 수 있는
		// 부모클래스를 호출 할 수 있는 super키워드
		// super(age,size,hasWing) == Animal(age,size,hasWing)
		super(age,size,hasWing);	
	}
	
	// @Override (@Override 라는 어노테이션) => 메소드마다 달아줘야한다.
	// 원래래는 컴파일러가 자식클래스와 부모클래스를 비교하면서
	// 해당메소드가 오버라이드 됐는지를 비교한다
	// @Override 사용하면 컴파일러에게 미리 이 메소드가 오브라이된 메소드라는 것을 알린다.
	
	@Override
	public void eat()
	{
		// 인스턴스 메소드에서도 super 키워드를 사용할 수 있다.
		// 부모 클래스에 정의되어있는 eat() 메소드 실행
		super.eat();
		System.out.println("육식을 한다.");
	}
	
	@Override
	public void sleep()
	{
		super.sleep();
		System.out.println("누워서 잔다.");
	}

}
