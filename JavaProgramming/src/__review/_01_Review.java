package __review;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		/*
		 * System.out.println("사용자의 이름을 입력하세요.");
		 * 
		 * String name = sc.nextLine();
		 * 
		 * System.out.println("사용자의 나이를 입력하세요."); int age = sc.nextInt();
		 * 
		 * sc.nextLine();
		 * 
		 * System.out.println("사용자의 성별를 입력하세요.(남자/여자)"); 
		 * String gender = sc.nextLine();
		 * 
		 * System.out.println("입력하신 사용자 정보는"); 
		 * System.out.println("이름: " + name);
		 * System.out.println("나이: " + age); 
		 * System.out.println("성별: " + gender);
		 */
//		-------------------------------------------------------------------------------------------------------------------
//		
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.		
		
//		  System.out.print("첫번째 정수 입력 ->");
//		  int num1 = sc.nextInt();
//		  
//		  System.out.print("두번째 정수 입력 ->"); 
//		  int num2 = sc.nextInt();
//		  
//		  // 문자열 읽고 charAt으로 첫번째 문자 가져오기
//		  System.out.print("연산 하고 싶은 연산자를 입력하세요.(+, -, *, /, %) -> "); 
//		  char ch = sc.next().charAt(0);
//		  
//		  double result = 0;
//		  
//		  switch(ch) { 
//		  	case '+': 
//		  		result = num1 + num2; break;
//		  
//		  	case '-': 
//		  		result = num1 - num2; break;
//		  
//		  	case '*':
//		  		result = num1 * num2; break;
//		  
//		  	case '/': 
//		  		if(num2 != 0) { 
//		  				System.out.println(result = num1 / num2); 
//		  			}else {
//		  				System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요"); 
//		  			} 
//		  			break;
//		  
//		  case '%': 
//			  if(num2 != 0) { 
//				  System.out.println(result = num1 % num2);
//			  }else {
//				  System.out.println("0으로 나눌 수 없습니다. 다시 입력해 주세요"); 
//			  } 
//			  break;
//		  
//		  default: 
//			  System.out.println("사용 할 수 있는 연산자를 입력해주세요.(+, -, *, /, %)"); 
//			  }
//		  
//		  System.out.println("결과 값은 " + result + "입니다.");
		 
//		-------------------------------------------------------------------------------------------------------------------
//		3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
//	    단, 원주율 3.14는 상수로 선언하세요.
		/*
		 * final double PI = 3.14; int radius = 20;
		 * 
		 *  double area = (2 * PI * radius * radius);
		 *  double round = (4 * PI * radius);
		 * 
		 * System.out.println("원의 둘레: " + round); 
		 * System.out.println("원의 넓이" + area);
		 */
//		-------------------------------------------------------------------------------------------------------------------		
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		/*
		 * System.out.println("5개의 점수를 입력하세요.");
		 *  int sum = 0; 
		 *  for(int i = 1; i <= 5 ;i++) { 
		 *  	System.out.print(i + "번째: "); 
		 *  	int score = sc.nextInt(); 
		 *  	sum += score;
		 *  }
		 * 
		 * double average = sum / 5;
		 * 
		 * System.out.println("점수의 합계: " + sum); 
		 * System.out.println("점수의 평균: " + average);
		 */
//		-------------------------------------------------------------------------------------------------------------------			
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		
//		System.out.println("정수 3개를 입력하세요.");
//		int[] numArr = new int[3];
//		
//		 for(int i = 0; i < numArr.length; i++) {
//			 numArr[i] = sc.nextInt();
//		 }
//		 
//		 Arrays.sort(numArr);
//		 
//		 System.out.println("최소값: " + numArr[0]);
//		 System.out.println("중간값: " + numArr[1]);
//		 System.out.println("최대값: " + numArr[2]);
		
//		-------------------------------------------------------------------------------------------------------------------	
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//				  2 * 2 = 4
//				  .....
//				  2 * 9 = 18 
		
//		System.out.println("단을 입력하세요.");
//		int dan = sc.nextInt();
//		
//		for(int i = 1; i <= 9 ;i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}
		
//		-------------------------------------------------------------------------------------------------------------------			
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		
//		System.out.println("정수를 입력하세요.");
//		int num = sc.nextInt();
//		int pack = 1;
//		for(int i = 1; i <= num; i++) {
//			pack *= i;	
//		}
//		System.out.println(pack);
		
//		-------------------------------------------------------------------------------------------------------------------			
//		8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요. (소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
//		 사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		//소수의 조건
		/*숫자가 1보다 작거나 같으면 소수x
		숫자가 2보다 크면 2부터 숫자-1까지의 모든 숫자로 나누어 떨어지는지 검사합니다.
		하나라도 나누어 떨어지면 소수가 아니라고 판단합니다.*/
		System.out.println("정수를 입력하세요.");
		for(int i = 0; i < 10; i++){
			System.out.println((i + 1) + "번째 정수 입력");
			int num = sc.nextInt();
			
			if(2 <= num && num <= 30) {
				
			} else {
				System.out.println("입력 할 수 있는 값은 2 ~ 30 입니다. 다시 입력해주세요.");
				i--;
			}
			
		}
		
		
		
		

		
		
		
		
				
				
				
			
				
			


		
			

	}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
}
