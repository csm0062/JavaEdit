package chap07_class;

import chap07_class.car.Car;

public class _01_Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 정의한 클래스는 항상 변수로 선언해서 사용한다.(static 클래스 제외)
		// 그래서 클래스는 사용자가 직업 정의하는 자료형이라고도 한다.
		// 파일명과 클래스명은 항상 맞춰야 한다. 클래스명은 항상 대문자로
		Car car; //Car: 클래스명이지만 '클래스타입'으로사용 car: 인스턴스(객체,변수....)
		
		int a = 10;
		// 2. 정의한 클래스 타입의 값을 만들어주는 작업을 인스터스화라고 한다.
		// 인스턴스화를 진행하게 되면 클래스내의 선언된 변수들과 메소드들이 메모리에 올라가고
		// 그 변수들과 메소드를 사용할 수 있는 클래스 타입의 값이 객체로 하나 만들어지게 된다.
		// 인스턴스화 방식: new 생성자(); (여기서 new는 키워드)
		car = new Car();  // Car car = new Car(); 한 줄로 줄여줄 수 있다.
		
		// println메소드에 매개변수로 객체를 전달하게되면 
		// Object클래스의 toString메소드를 실행시켜준다.
		System.out.println(car);  //출력하면 클래스와클래스네임. + @ + 주소가 출력된다.
		
		
		car.company = "현대";
		car.model = "제네시스";
		car.color = "검정";
		car.price = 5000;
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.price);
		
		// 4. 생성된 객체(car)의 메소드 사용
		car.turnOn();
		car.speedUp();
		car.speedDown();
		car.turnOff();
		car.printCarInfo();
		
		// 인스턴스(객체)를 생성해서 새로운 메모리 공가에 할당 받기 때문에 
		// car와 car2는 서로 영향을 주지 않는다.
		Car car2 = new Car();
		
		System.out.println(car2);
		System.out.println(car == car2);
		System.out.println(car2.company);
		
		Car car3 = generateCar(car);
		car3.printCarInfo();
		

	}
	// 클래스는 타입의 역할도 하기 때문에 
	// 메소드의 리턴타입이나 매개변수로도 사용할 수 있다.
	// static뒤에 Car는 리턴타입이고 괄호안에 Car car는 매개변수
	// 받아온 매개변수들을 통해 속성값의 초기화 가능
	// public 클래스명(매개변수)
	// 매개변수가 있는 생성자를 정의하면 기본 생성자가 제공되지 않는다.
	// 때문에 기본 생성자도 함께 정의해주는 것이 좋다.
	public static Car generateCar(Car car) 
	
	{
		// 특징: 리턴타입이 없고 클래스 명과 동일한 이름을 갖는 메소드
		// 매개변수가 없는 생성자 = '기본생성자'///// new Car();
		// 클래스를 정의하면 생성자를 따로 정의하지 않아도 자동으로 제공되는 생성자.
		Car returnCar = new Car(); //new 뒤 Car는 생성자메소드(생성자)
		
		returnCar.company = car.company;
		returnCar.color = car.color;
		returnCar.model = car.model;
		returnCar.price = car.price;
		
		return returnCar;
	}
	
	

}
