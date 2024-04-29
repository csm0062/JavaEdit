package chap03_operator;

public class _02_ArlthmeticOpertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 대입연산자
		// 왼쪽 피연산자에 오른쪽 피연산자의 값을 저장(대입)한다.
		int num1 = 10;
		int num2 = 15;
		int num3 = 30;
		
		// 오른쪽 피연산자에 변수를 사용할 수도 있다.
		int num4 = num3;
		
		System.out.println(num4);
		System.out.println("--------------------------");
		
		// 2. 산술연산자
		int result;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
		
		double dResult = num1 / (double)num2;
		System.out.println("num1 / num2 = " + dResult);
		
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result);
		
		
		// 3. 복합 대입연산자
		num3 = 100;
		num4 = 15;
		
		// num3 = num3 + num4;
		num3 += num4;
		System.out.println(num3);
		//115
		
		//num3 = num3 - num4
		num3 -= num4;
		System.out.println(num3);
		//100
		
		//num3 = num3 * num4
		num3 *= num4;
		System.out.println(num3);
		//1500
		
		//num3 = num3 / num4
		num3 /= num4;
		System.out.println(num3);
		//100
		
		//nu3 = num3 % num4
		num3 %= num4;
		System.out.println(num3);
		//10
		
		
		// 4. 복합 산술연산자
		// 산술 연산자를 혼합해서 사용할 때는 수학에서 사용하는 순서와 동일하게 실행된다.
		// * , / 연산이 먼저 일어나고 +. - 연산은 나중에 일어난다.
		// 항상 ()로 묶인 연산이 먼저 실행된다.
		result = num1 + num2 / num3;
		System.out.println("num1 + num2 / num3 = " + result);
		
		result = (num1 + num2) / num3;
		System.out.println("(num1 + num2) / num3 = " + result);

		
		
		
		
		
		
		
		
		
	}

}
