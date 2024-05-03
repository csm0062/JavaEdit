package _240503_homework.basic;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("속도를 올린다.");

	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("속도를 줄인다.");

	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("연료를 주입한다.");

	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("충전을 시킨다.");

	}

}
