package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import chap23_stream.car.HyundaiCar;

public class _17_CountingMethodEx_soomin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<HyundaiCar> 생성하고
		// 아반떼, 3000
		// 아반떼, 3500
		// 아반떼, 2500
		// 소나타, 4000
		// 그랜저, 5000
		// 제네시스, 6000
		
		// 스트림처리를 통해서 가격이 최대값인 객체하나와
		// 가격이 최소값인 객체 하나를 찾아서 출력하세요.
		// carInfo
		
		List<HyundaiCar> hCarList = new ArrayList<>();
		
		
		hCarList.add(new HyundaiCar("아반떼", 3000));
		hCarList.add(new HyundaiCar("아반떼", 3500));
		hCarList.add(new HyundaiCar("아반떼", 2500));
		hCarList.add(new HyundaiCar("소나타", 4000));
		hCarList.add(new HyundaiCar("그랜저", 5000));
		hCarList.add(new HyundaiCar("제네시스", 6000));
		
		
		HyundaiCar hCarmax = hCarList.stream()
						   .max(Comparator.comparing(HyundaiCar::getPrice))
						   .orElseThrow();
		// 쌤이 푸신거
//		HyundaiCar hCarmax = hCarList.stream()
//				  .max(Comparator.comparing(hyundaiCar -> hyundaiCar.getPrice()))
//				  .orElseThrow();
		
		hCarmax.carInfo();			  
		
		
		HyundaiCar hCarmin = hCarList.stream()
						  .min(Comparator.comparing(HyundaiCar::getPrice))
						  .orElseThrow();
		// 쌤이 푸신거
//		HyundaiCar minCar = hyundaiCarList.stream()
	             	//<HyundaiCar, Integer> 타입을 지정해주면 .getPrice가 자동으로 잘 뜬다
//				  .min(Comparator.<HyundaiCar, Integer>comparing(hyundaiCar -> hyundaiCar.getPrice()))
//				  .orElseThrow();
		
		hCarmin.carInfo();
		
		
	}

}
