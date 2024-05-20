package chap24_dataio.car;

import java.io.Serializable;

// 직렬화(Serialization): 객체의 멤버변수들을 바이트로 일렬로 정렬하는 기능
// 역직렬화(DeSerialization): 바이트로 일렬로 정렬된 멤버변수들을 객체형태로 만들어주는 기능
//  Serializable 인터페이스를 상속받으면 입출력이 진행될 때 자동 직렬화, 역직렬화가 일어나게 된다.
public class Car implements Serializable {
	private String company;
	private String model;
	private int price;
	private double maxSpeed;
	
	// 직렬화할 때 제외할 멤버변수에는 transient 키워드를 사용해서 멤버변수를 선언한다.
	private transient int produceYear;
	
	public Car() {
		
	}
	
	public Car(String company, String model, int price, double maxSpeed) {
		this.company = company;
		this.model = model;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

}
