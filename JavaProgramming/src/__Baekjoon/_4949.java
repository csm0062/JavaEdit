package __Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _4949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stackChar = new Stack<>();
		List<String> strList = new ArrayList<>();
		
		while(true) {
			String input = sc.nextLine();
			stackChar.clear(); // Stack 초기화
			
			if(input.equals(".")) // while문 종료조건
				break;
			
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == '(' || input.charAt(i) == '[') { // 왼괄호일 때는 stack에 저장
					stackChar.push(input.charAt(i));
				}
				
				if(input.charAt(i) == ')') { // 우괄호일 때는 stack에서 해당하는 왼괄호가 있는지 확인 후 있으면 왼괄호 삭제, 없으면 break;
					if(stackChar.empty()) { // 만약 처음부터 우괄호로 시작할 경우, peek() 메소드에서 에러가 발생하므로 아무 값이나 넣어서 뒤에서 "no"가 저장되게 해주고 break;
						stackChar.push('0');
						break;
					}
					
					if(stackChar.peek() == '(') {
						stackChar.pop();
					} else {
						break;
					}
				}
				
				if(input.charAt(i) == ']') {  // 위와 대괄호인 것만 빼면 동일
					if(stackChar.empty()) {
						stackChar.push('0');
						break;
					}
					
					if(stackChar.peek() == '[') {
						stackChar.pop();
					} else {
						break;
					}
				}
			}
			
			if(stackChar.empty()) { // List<String>에 결과값 저장
				strList.add("yes");
			} else {
				strList.add("no");
			}
			
		}
		
		for(String s : strList) { // List<String>에 저장해둔 결과값 출력
			System.out.println(s);
		}
		
		sc.close();
	}
}