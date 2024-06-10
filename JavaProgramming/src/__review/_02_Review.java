package __review;

import java.util.Scanner;

public class _02_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//=============================================	////////////////////|배 열|////////////////////=============================================
//		1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
		// 1)번방법
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i = 0; i <= arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			
//		}
		// 2)번방법
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length ;i++) {
//			arr[i] = i + 1;
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
//		List<Integer> arrList = new ArrayList<>();
//		 while(true) {
//			 System.out.println("정수를 입력하세요(q를 입력하면 종료합니다.)");
//			 
//			 String num = sc.nextLine(); // 정수를 스트링값으로 받는다.
//			 
//			 if(num.equalsIgnoreCase("q")) { //q를 입력하면 나간다.
//				 break;
//			 }
//			 
//			 int n = Integer.parseInt(num); // 스트링을 인트로 바꿔준다.
//			 arrList.add(n);
//		 }
//		 
//		 System.out.println("입력한 값들은");
//		 for(int number : arrList) {       //입력한 정수들을 뽑아낸다.
//			 System.out.println(number);
//		 }
//		 		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
//		int[] arr = new int[10];
//		
//		int sum = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("정수를 입력하세요.");
//			
//			int num = sc.nextInt();
//			arr[i] = num;
//			sum += arr[i];
//		}
//		
//		System.out.println("입력한 정수의 평균 값은 " + (sum/10));
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
//		int[] arr = new int[50];
//		int index = 0;
//		for(int i = 0; i < 100; i++) {
//			
//			if(i % 2 ==0) {
//				arr[index++] = i;
//			}
//		}
//		
//		int sum = 0;
//		for(int num: arr) {
//			sum += num;
//		}
//		
//		System.out.println("배열의 합은 " + sum);
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
//		int[] arr = new int[10];
//				
//		for(int i = 0; i < 10; i++) {
//			System.out.println("정수 10개를 입력하세요.");
//			int num = sc.nextInt();
//			arr[i] = num;
//		}
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i = 1; i < arr.length; i++ ) {
//			if(arr[0] < arr[i]) {
//				max = arr[i];
//			}
//		}
//		for(int i = 1; i < arr.length; i++ ) {
//			if(arr[0] > arr[i]) {
//				min = arr[i];
//			}
//		}
//		
//		System.out.println("최댓값: " + max);
//		System.out.println("최소값: " + min);
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
		
//		String[] stringArr = new String[5];
//		System.out.println("문자열 1개를 입력하세요.");
//		
//		for(int i = 0; i < stringArr.length; i++) {
//			System.out.println((i + 1) + " 번째 입력할 문자열");
//			String str = sc.nextLine();
//			stringArr[i] = str;
//		}
//		
//		String minStr = stringArr[0];
//		String maxStr = stringArr[0];
//			
//		
//		for(int i = 0; i < stringArr.length; i++) {
//			if(stringArr[0].length() > stringArr[i].length()) {
//				minStr = stringArr[i];
//			}
//			
//			if(stringArr[0].length() < stringArr[i].length()) {
//				maxStr = stringArr[i];
//			}
//		}
//		
//		System.out.println("최댓값: " + maxStr);
//		System.out.println("최소값: " + minStr);
		
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로
//		첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고
//		두 배열을 합친 새로운 배열을 생성하세요.
//		int[] arr1 = new int[4];
//		int[] arr2 = new int[3];
//		int[] arr3 = new int[7];
//		
//		Random rad = new Random(100);
//		
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = rad.nextInt(100);
//		}
//		
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = rad.nextInt(100);
//		}
//		
//		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
//		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
//		
//		System.out.print("arr3번 배열 객체는: ");
//		for(int result : arr3) {
//			System.out.print(result + " ");
//		}
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다.
//		기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에 가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
//		System.out.println("문자열을 입력하세요(띄어쓰기 대신 \"-\" 를 넣어주세요)");
//		String str = sc.nextLine();
//		
//		String[] strArr = str.split("-"); // - 로 단어들을 끊어서 가지고온다.
//		
//		List<String> arrList = new ArrayList();
//		for(String i : strArr) { // strArr에있는 것들을 순차적으로 arrList에 삽입해주는것
//			 arrList.add(i);
//		}
//		
//		int maxLengthString = 0; // 가장 긴 문자열
//		int maxIndex = 0; // 가장 긴 문자열의 인덱스 번호
//		
//		for(int i = 0; i < arrList.size(); i++)  // arrList 요소들의 개수 반환
//		if(arrList.get(i).length() > maxLengthString){ // maxLengthString(가장 긴 문자열 길이) 보다 arrList의 i번째 인덱스에있는 객체의 길이가 더 클때
//			maxLengthString = arrList.get(i).length(); // arrList의 i번째 인덱스에있는 객체의 길이를 maxLengthString에 업데이트
//			maxIndex = i; //  arrList의 가장 긴 String의 인덱스 i에 maxIndex에 업데이트
//		}
//		
//		System.out.println("가장 긴 문자열의 인덱스는 " + maxIndex);
//		System.out.println("가장 긴 문자열은 " + maxLengthString);
		
		
//=============================================	////////////////////|클 래 스|////////////////////=============================================
//		1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
		//Student 클래스 생성
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.
		//Book 클래스 생성
//		-------------------------------------------------------------------------------------------------------------------------------------
//		3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.
//		System.out.println(concatStr("soo","min"));
//		-------------------------------------------------------------------------------------------------------------------------------------
//		4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
//		System.out.println(mul(22, 5.3894f));
//		-------------------------------------------------------------------------------------------------------------------------------------
//		5. 반지름을 속성으로 갖는 원클래스를 만들고 
//		사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
//		System.out.println("반지름을 입력하세요.");
//		int radius = sc.nextInt();
//		sc.nextLine();
//		
//		Circle circle = new Circle(radius);
//		System.out.println("원의 넓이는 " + circle.area());
//		System.out.println("원의 둘레는 " + circle.round());
//		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
		
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
		
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//	    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 
		
		
//=============================================	////////////////////|상 속|////////////////////=============================================
//		1. 성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고
//		Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
//	    ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		2. 일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 
//		만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다
//		메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요.
//		일한 시간과 시간당 급여는 생성자에서 초기화합니다.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		3. 근로자를 인터페이스로 생성하고 출근하다, 퇴근하다, 일한다. 메소드를 선언합니다.
//		근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를 
//	    본인이 원하는 대로 구현하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		4. 게시판 인터페이스를 구현하고 게시글 저장, 수정, 삭제, 조회 메소드를 만들고
//		게시판을 상속받는 자유게시판과 공지게시판 클래스를 만들어서
//		네 개의 메소드를 본인이 원하는 대로 구현하세요.
		
		
//=============================================	////////////////////|컬 렉 션|////////////////////=============================================
//		1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.
		
//		-------------------------------------------------------------------------------------------------------------------------------------
//		7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
//	    List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고 
//	    출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)
		
//		-------------------------------------------------------------------------------------------------------------------------------------
	}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@| 메소드 정의 영역 |@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public static String concatStr(String str1, String str2) {
		return str1 + str2;
	}
	
	public static float mul(int num1, float num2) {
		float floatVal = num1 * num2;
        return (float)Math.round(floatVal * 100)/ 100;
	}
	
	

}
