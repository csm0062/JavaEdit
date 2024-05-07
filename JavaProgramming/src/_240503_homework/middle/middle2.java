package _240503_homework.middle;
import java.util.Scanner;

public class middle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너를 써서 사용자로부터 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String instr = sc.nextLine();
		sc.close(); //스캐너가 끝났으니 스캐너를 닫는다. ----입력끝----
		
		//중복된걸 제거된 문자열을 내보낸다.
		String result = removestr(instr);
		System.out.println("중복된 문자를 제거한 문자열: " + result);
	}
	//중복된 문자를 제거하는 메소드를 만들어야한다.
	public static String removestr(String str)
	{	
		String result = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			result += str.charAt(i);
		}return result;
				
	
			
		
			
		
		
		
		
		
	}

}
