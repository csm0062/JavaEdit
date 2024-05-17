package _240516_homework;

public class _02_middle {
//	1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후
//	 역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
//	StringBuilderUtils 함수형 인터페이스 선언, 
//	StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
//
//	2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 
//	역순으로 변경하는 메소드 reverseSb를 각각 선언하고
//	 StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
	public static void main(String[] args) {
		//이 형태로 작동시킨다.
		StringBuilder car = combineAndReverse((sb1, sb2) -> { return sb1.append(sb2).reverse();});
		System.out.println(car);
		
		StringBuilder ap = appendSb((sb3, sb4) -> {return sb3.append(sb4);});
		System.out.println(ap);
		
		StringBuilder rv = reverseSb((sb5, sb6) -> {return (sb5.append(sb6)).reverse();});
		System.out.println(rv);
		 
	}
	//이걸
	//두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후 역순으로 바꿔서 리턴하는 combineStrBuilder
	public static StringBuilder combineAndReverse(StringBuilderUtils combine) {
		
		StringBuilder sb1 = new StringBuilder("soo");
		StringBuilder sb2 = new StringBuilder("min");
		
		return combine.combineStrBuilder(sb1, sb2);
	}
	
	// 두 개를 합치는 메소드 appendSb
	public static StringBuilder appendSb(StringBuilderUtils combine) {
		StringBuilder sb3 = new StringBuilder("choi");
		StringBuilder sb4 = new StringBuilder("soomin");
		
		return combine.combineStrBuilder(sb3, sb4);
	}
	
//	역순으로 변경하는 메소드 reverseSb
	public static StringBuilder reverseSb(StringBuilderUtils combine) {
		StringBuilder sb5 = new StringBuilder("so");
		StringBuilder sb6 = new StringBuilder("om");
		
		return combine.combineStrBuilder(sb5, sb6);
	}
	
	

}
