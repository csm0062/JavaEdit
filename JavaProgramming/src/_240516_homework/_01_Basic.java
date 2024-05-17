package _240516_homework;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 매개변수로 받아온 정수배열에서
//		 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요. 
		
//		PrintNumber 함수형 인터페이스 생성, 
//		printEvenNum(int[] numArr) 추상 메소드로 선언.
		//이 형태로 동작하게 만든다
		
		numbers(numArr -> { 
			for(int num = 0; num < numArr.length; num++) {
				if(numArr[num] % 2 == 0) {
					System.out.println(numArr[num]);
				}
			}
		});
		
	        
	}
	
	 public static void numbers(PrintNumber printNumber) {
		 int[] numArr = {1,2,3,4,5,6,7,8,9,10};
	     printNumber.printEvenNum(numArr); //이걸
	       
	 }
}
