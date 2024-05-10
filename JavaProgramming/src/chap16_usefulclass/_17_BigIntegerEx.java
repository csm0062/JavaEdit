package chap16_usefulclass;

import java.math.BigInteger;

public class _17_BigIntegerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 까지 곱한 값을 구하세요.(100 팩토리얼, 100!)
		BigInteger bigInt = new BigInteger("1");
		bigInt = BigInteger.ONE;
		
		for(int i = 1; i <= 100; i++) {
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(bigInt);
		
		long num = factorial(10);
		
		System.out.println(num);
		
		// 100!
		System.out.println(factorialBigInteger(BigInteger.valueOf(100L)));
		
		// 1! = 1
		// 2! = 2
		// 3! = 6
		// 4! = 24
		// ...
		// 100! = 9333......
		for(int i = 1; i <= 100; i++)
		{
			factorialBigInteger(BigInteger.valueOf(i));
			System.out.println( i + "! = " + factorialBigInteger(BigInteger.valueOf(i)));
					
		}

		
	}
	
	public static long factorial(long num) 
	{
		if(num == 0) {
			return 1;
		} else {
			//재귀메소드: 현재 메소드를 구현부안에서 호출
			// num = 10 이 들어오면
			// 10 * factorial(9)
			// 10 * 9 * factorial(8)
			// 10 * 9 * 8 * factorial(7)
			// ....
			// 10 * 9 * 8 * 7 * ... * factorial(0)
			return num * factorial(num - 1); 
		}
	}
	
	public static BigInteger factorialBigInteger(BigInteger bigInt) 
	{
		if(bigInt.intValue() == 0) {
//			return new BigInteger("1");
			return BigInteger.ONE;
		} else {
			return bigInt.multiply(factorialBigInteger(bigInt.subtract(BigInteger.ONE)));
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
