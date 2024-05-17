package _240516_homework;
//1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후
//역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요.
//StringBuilderUtils 함수형 인터페이스 선언, 
//StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언
//
//2. 2번 문제에서 StringBuilder 두 개를 합치는 메소드 appendSb와 
//역순으로 변경하는 메소드 reverseSb를 각각 선언하고
//StringBuilder의 메소드를 참조하여 combineStrBuilder 각각 구현하세요.
@FunctionalInterface
public interface StringBuilderUtils {
	StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2);

}
					