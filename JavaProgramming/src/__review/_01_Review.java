package __review;

import java.util.Scanner;

public class _01_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
//=============================================	////////////////////변 수////////////////////	=============================================
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
//		int primeCount = 0;//소수의 개수를 세는 변수
//		System.out.println("정수를 입력하세요.");
//		
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println((i + 1) + "번째 정수 입력(2 ~ 30)");
//			int num = sc.nextInt();
//			
//			
//			
//			if(2 <= num && num <= 30) {
//				if(prime(num)) {
//					primeCount++;
//				}
//			} else {
//				System.out.println("입력 할 수 있는 값은 2 ~ 30 입니다. 다시 입력해주세요.");
//				i--;
//			}
//			
//		}
//		System.out.println("입력한 수에서 소수의 개수는 " + primeCount + "개 입니다.");
		
//=============================================	////////////////////형 변 환////////////////////	=============================================	
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
//		System.out.println("2개의 정수를 입력하세요");
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		
//		int sum = num1 + num2;
//		
//		System.out.println("두 문자열의 합은 " + sum);
		
//		-------------------------------------------------------------------------------------------------------------------			
//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
		
//		System.out.print("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		
//		while(b == 0) {
//			System.out.println("두번째 정수는 0을 입력 할 수 없습니다. 다른 정수를 입력해 주세요");
//			System.out.print("두번째 정수를 입력하세요.");
//			b = sc.nextInt();
//		}
//		double num = (double) a / b;
//		System.out.println("두 수의 연산 결과는 " + num );
		
//		-------------------------------------------------------------------------------------------------------------------			
//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
//		System.out.println("실수를 입력해 주세요.");
//		double db = sc.nextDouble();
//		int i = (int)db;
//		System.out.println("정수로 변경시 " + i);
		
//		-------------------------------------------------------------------------------------------------------------------	
//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
//		방법1
//		System.out.println("실수를 입력해 주세요");
//		double db = sc.nextDouble();
//		double dbdb = (db*db);
//		String str = String.valueOf(dbdb);
//		System.out.println("실수의 제곱은 " + str);
		
//		방법2 Math.pow(변수, 몇 승)메소드 사용 
//		System.out.println("실수를 입력해 주세요");
//		double db = sc.nextDouble();
//		double dbdb = Math.pow(db, 2);
//		String str = String.valueOf(dbdb);
//		System.out.println("실수의 제곱은 " + str);		

//		-------------------------------------------------------------------------------------------------------------------	
//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
//		int iNum = 10;
//		long lNum = 20;
//		
//		long itol = (long)iNum;
//		int ltoi = (int)lNum;
//		
//		System.out.println("int를 long으로 바꾼값은" + itol +" 이고 long을 int로 바꾼 값은" + ltoi +"입니다." );
		
//		-------------------------------------------------------------------------------------------------------------------	
//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
//		System.out.println("2개의 문자를 입력하세요");
//		System.out.print("첫 번째 문자는 ");
//		char ch1 = sc.next().charAt(0);
//		System.out.print("두 번째 문자는 ");
//		char ch2 = sc.next().charAt(0);
//		
//		int uniCh1 = (int) ch1;
//		int uniCh2 = (int) ch2;
//		
//		System.out.println("입력하신 문자 2개의 유니코드는 " + uniCh1 + " 과 " + uniCh2 +" 입니다");	
	
//=============================================	////////////////////연 산 자////////////////////	=============================================			       
//		1. 사용자가 입력한 두 정수로 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		  (메소드로 따로 만들지 말고 메인메소드에서 구현)
//		System.out.println("2개의 정수를 입력하세요");
//		System.out.print("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		
//		int sum = a + b;
//		int sub = a - b;
//		int mul = a * b;
//		double div = (double) a / b;
//		double remain = (double) a % b;
//		System.out.println("두 정수를 더하면: " + sum);
//		System.out.println("두 정수를 빼면: " +sub);    
//		System.out.println("두 정수를 곱하면: " + mul);
//		System.out.println("두 정수를 나누면: " + div);
//		System.out.println("두 정수를 나눈 나머지는: " + remain);
		
//		-------------------------------------------------------------------------------------------------------------------	
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
//		21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//		int num = 20;
//		System.out.println(++num);
//		System.out.println(++num);
//		System.out.println(num);
//		System.out.println(--num);
//		System.out.println(--num);
//		System.out.println(num--);
//		System.out.println(num++);
//		System.out.println("마지막 변수의 값: " + num);


//		3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
//		while(true) {
//			System.out.println("정수를 입력하세요");
//			int num = sc.nextInt();
//			
//			if(num == 0) {
//				break;
//			}
//			
//			if(num % 2 == 0 && num % 7 == 0) {
//				System.out.println("2와 7의 공배수");
//				break;
//			}else {
//				System.out.println("2와 7의 공배수가 아님");
//			}
//		}
		
//		-------------------------------------------------------------------------------------------------------------------			
//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
//			while(true) {
//				System.out.println("문자열을 입력하세요");
//				String str = sc.nextLine();
//				
//				if(str.equals("stop")) {
//					break;
//				}
//				
//				if(str.equals("Hello")) {
//					System.out.println("입력하신 문자열은 \"Hello\"입니다");
//					break;
//				}else {
//					System.out.println("입력하신 문자열은 \"Hello\"이 아닙니다.");
//				}
//			}
		

//		5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.	
//		System.out.println("정수을 입력하세요.");
//		int num = sc.nextInt();
//		String str = (num % 2 == 0) ? "짝수"  : "홀수";
//		System.out.println("입력하신 정수는 " + str + "입니다.");
		
//		-------------------------------------------------------------------------------------------------------------------			
//		6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
//		System.out.println("정수을 입력하세요.");
//		int num = sc.nextInt();
//		String str = (num != 100) ? (num < 100) ? "100보다 작음" : "100보다 큼" : "100";
//		System.out.println("사용자가 입력한 정수는 " + str);
		
//		-------------------------------------------------------------------------------------------------------------------	
//		7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//		System.out.println("2개의 실수를 입력하세요");
//		System.out.print("첫번째 실수를 입력하세요.");
//		double a = sc.nextDouble();
//		System.out.print("두번째 실수를 입력하세요.");
//		double b = sc.nextDouble();
//		
//		double sum = a + b;
//		double sub = a - b;
//		double mul = a * b;
//		double div =  a / b;
//		double remain =  a % b;
//		System.out.println("두 실수를 더하면: " + sum);
//		System.out.println("두 실수를 빼면: " +sub);    
//		System.out.println("두 실수를 곱하면: " + mul);
//		System.out.println("두 실수를 나누면: " + div);
		
		
//		-------------------------------------------------------------------------------------------------------------------	
//		8. 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
//		System.out.println("문자열 하나를 입력하세요.");
//		String str = sc.nextLine();
//		System.out.println("정수 하나를 입력하세요.");
//		int num = sc.nextInt();
//		
//		System.out.println("입력한 문자열은 " + str + " 이고, 입력한 숫자는 " + num + " 입니다.");
		
//=============================================	////////////////////조 건 문////////////////////	=============================================	
//		1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
//		System.out.print("첫번째 정수를 입력하세요.");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요.");
//		int b = sc.nextInt();
//		
//		if(a < b) {
//			System.out.println("두 정수중에 큰수는 " + b);
//		}else {
//			System.out.println("두 정수중에 큰수는 " + a);
//		}
		
//		-------------------------------------------------------------------------------------------------------------------	
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
//		while(true) {
//			System.out.println("정수를 입력하세요");
//			int num = sc.nextInt();
//			if(num > 0) {
//				System.out.println("양수");
//				break;
//			}else if(num == 0){
//				System.out.println("입력하신 수는 0 입니다.");
//			}else {
//				System.out.println("음수");
//				break;
//			}
//		}
		
//		-------------------------------------------------------------------------------------------------------------------	
//		3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
//		"Python"인 경우 "공부중인 언어입니다."를 출력하고, 
//		그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
//		System.out.println("문자열을 입력하세요.");
//		String str = sc.nextLine();
//		switch(str) {
//		case "Java": {
//			System.out.println("\"Java\"는 좋아하는 언어입니다.");
//			break;
//		}
//		case "Python":{
//			System.out.println("\"Python\"은 공부중인 언어입니다.");
//			break;
//		}
//		default: System.out.println("다른 언어를 공부해보세요.");
//			break;
//		};
//		
		
//		-------------------------------------------------------------------------------------------------------------------	
//		4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
//		while(true) {
//			System.out.println("정수를 입력하세요");
//			int num = sc.nextInt();
//			switch(num % 3) {
//			case 0: {
//				System.out.println("3의 배수입니다.");
//				break;
//			}
//			default: System.out.println("3의 배수가 아닙니다.");
//				break;
//			}
//		}
		
//		-------------------------------------------------------------------------------------------------------------------	
//		5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		if(num % 2 == 0 && num != 0) {
//			System.out.println("짝수입니다.");
//		}else if(num == 0){
//			System.out.println("입력하신 수는 0 입니다.");	
//		}else {
//			System.out.println("홀수입니다.");
//		}
		
		
//		-------------------------------------------------------------------------------------------------------------------	
//		6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//		int max = 0;
//		System.out.println("5개의 정수를 입력하세요.");
//		for(int i = 0; i < 5; i++) {
//			System.out.println((i + 1) + "번째 입력 숫자: ");
//			int num = sc.nextInt();
//			if(max < num) {
//				max = num;
//			}
//		}
//		System.out.println("가장 큰 수는 " + max);
		
//		-------------------------------------------------------------------------------------------------------------------	
//		7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
//		while(true) {
//			System.out.println("문자열을 입력하세요.");
//			String str = sc.nextLine();
//			if(str.equals("Yes")) {
//				System.out.println("예");
//				break;
//			}else if(str.equals("No")) {
//				System.out.println("아니오");
//				break;
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}
				
//		-------------------------------------------------------------------------------------------------------------------	
//		8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
//		System.out.println("두 정수를 입력하세요.");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		String result = (num1 == num2) ? "두 수가 같습니다." : (num1 > num2) ? "첫 번째 수가 더 큽니다." : "두 번째 수가 더 큽니다.";
//		System.out.println(result);
		
//		-------------------------------------------------------------------------------------------------------------------	
//		9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
//		int even = 0;//짝
//		int odd = 0;//홀
//		
//		System.out.println("정수 3개를 입력하세요.");
//
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		if(num1 % 2 == 0) {
//			even++;
//		}else {
//			odd++;
//		}
//		
//		if(num2 % 2 == 0) {
//			even++;
//		}else {
//			odd++;
//		}
//		
//		if(num3 % 2 == 0) {
//			even++;
//		}else {
//			odd++;
//		}		
//		
//		
//
//// 또 다른 방법
////		for(int i = 0; i < 3; i++) {
////			int num = sc.nextInt();
////			if(num % 2 == 0) {
////				even++;
////			}else {
////				odd++;
////			}
////		}
//		
//		if(even == 3) {
//			System.out.println("모두 짝수 입니다.");
//		}else if(odd == 3) {
//			System.out.println("모두 홀수입니다.");
//		}else {
//			System.out.println("짝수 : "+  even + " 개, 홀수 : " + odd + "개 입니다.");
//		}
		
		
//=============================================	////////////////////반 복 문////////////////////	=============================================	
//		1. 1부터 10까지의 정수의 합을 출력하세요.
//		int sum = 0;
//		for(int i = 1; i <= 10; i++ ) {
//			sum += i;
//		}
//		System.out.println(sum);

		
//		-------------------------------------------------------------------------------------------------------------------	
//		2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//		int mul = 1;//(2의 0승)
//		for(int i = 1; i <= 10; i++) {
//			mul *= 2;
//			System.out.println("2의 " + i + "제곱은 " + mul + "입니다.");
//		}
		
		//직관적으로 콘솔 값에 보여주려면 이방법
//		for (int i = 2; i <= 10; i++) { // 2^2부터 2^10까지 반복
//             int result = 2; // 결과를 2로 초기화
//             String str = "2"; // 처음 연산 과정은 "2"
//
//             for (int j = 1; j < i; j++) { // 현재 i 값에 따라 반복
//                 str += " * 2"; // 연산 과정 문자열에 " * 2" 추가
//                 result *= 2; // 결과에 2 곱함
//             }
//
//             // 연산 과정과 결과를 출력
//             System.out.println("(" + str + " = " + result + ")");
//        }
		
//		-------------------------------------------------------------------------------------------------------------------	
//		3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//		System.out.println("정수를 입력하세요.");
//		int number = sc.nextInt();
//		
//		System.out.println("입력한 정수까지의 모든 소수: ");
//		for(int i = 0; i <=number; i++) {
//			if(prime(i)) {
//				System.out.println(i);
//			}
//		}
//		
//		-------------------------------------------------------------------------------------------------------------------	
//		4. 사용자가 입력한 정수의 약수를 출력하세요.
//		System.out.println("정수를 입력하세요.");
//		int n = sc.nextInt();
//		if(n % )
		
		
//		-------------------------------------------------------------------------------------------------------------------	
//		5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//		int[] numArr = new int[10];
//		
//		System.out.println("정수를 입력하세요.");
//		for(int i = 0; i <  numArr.length; i++) {
//			System.out.println((i + 1)+ "번째 입력한 수는 ");
//			numArr[i] = sc.nextInt();
//		}
//		
//		System.out.println("역순 출력");
//		for(int i = numArr.length -1; i >= 0; i-- ) {
//			System.out.print(numArr[i] + " ");
//		}
//		-------------------------------------------------------------------------------------------------------------------	
//		6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//		System.out.println("문자열을 입력하세요.");
//		String str = sc.nextLine();
//		
//		for(int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i) + " ");
//		}
		
//		-------------------------------------------------------------------------------------------------------------------	
//		7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//		System.out.println("두개의 정수를 입력하세요.");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		
		
		
//		-------------------------------------------------------------------------------------------------------------------	
//		8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
				
//		8-1. *
//	         **
//	         ***
//	         ****
//	         *****
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				if(i >= j) {
//					System.out.print("*");
//				}
//			}System.out.println();
//		}
			
//	    8-2. *****
//	          ****
//	           ***
//	            **
//	             *
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				if(i > j) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}System.out.println("");
//		}
		
//		
//		-------------------------------------------------------------------------------------------------------------------	
//		9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
		
//			System.out.println("정수를 입력하고 종료를 원하면 \"q\"를 입력하세요.");
//			int sum = 0;
//			
//		while(true) {	
//			
//			if(sc.hasNextInt()) {
//				int n = sc.nextInt();
//				sum += n;
//				System.out.println("지금까지의 합은: " + sum);
//			}else {
//				String string = sc.next();
//				if(string.equalsIgnoreCase("q")) {
//					break;
//				}else {
//					System.out.println("입력하신 값은 정수가 아닙니다.");
//				}	
//			}
//		}
//		System.out.println("최종 합은: " + sum);
//	}
//	-------------------------------------------------------------------------------------------------------------------		
// 홀수를 입력받아서 모양을 만드세요.
	
//  *
// ***
//*****	
// ***
//  *
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@메소드 정의 영역@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//----변수-------
	// 변수 8번 소수 메소드
	//소수의 조건
	/*숫자가 1보다 작거나 같으면 소수 x
	숫자가 2보다 크면 2부터 숫자-1까지의 모든 숫자로 나누어 떨어지는지 검사합니다.
	하나라도 나누어 떨어지면 소수가 아니라고 판단합니다.*/
	public static boolean prime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num);i++) {
			if(num % 2 == 0) {
				return false;
			}
		}
		return true;
	}
		
	
}
