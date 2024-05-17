package _240516_homework;

//1. 매개변수로 받아온 정수배열에서
//짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
//PrintNumber 함수형 인터페이스 생성, 
//printEvenNum(int[] numArr) 추상 메소드로 선언.

@FunctionalInterface
public interface PrintNumber {
	
	
	// 리턴값이나 매개변수를 위해서 추상 메소드 선언
	void printEvenNum(int[] numArr);
	

}
