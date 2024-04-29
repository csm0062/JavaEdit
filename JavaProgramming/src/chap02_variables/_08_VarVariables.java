package chap02_variables;

class _08_VarVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. var 변수 선언 및 초기화
		// 자바의 자료형 추론에 의해 String 타입으로 자동 지정
		var str = "hello";
		
		// 자료형 추론이 끝난 var 변수에 다른타입의 값을 저장하면 에러가 발생한다.
//		str = 20; [오류 발생]
		
		
		// 2. var 변수는 선언과 동시에 초기화가 되지 않으면 에러가 발생한다.
//		var iNum; [오류 발생]
		var iNum = 10;
		iNum = 30;
		
		// 3. 연산의 결과의 타입을 확신할 수 없을 때 주로 사용
		int num = 10;
		double dNum = 12.123;
		
		// 변수의 형태를 알 수 없을 경우 var 변수를 사용한다.
		var result = num + dNum;
		
		System.out.println(result);
		
		
		

	}

}
