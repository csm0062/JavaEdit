package chap24_dataio;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class _05_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Writer 객체 생성
		// Writer는 추상클래스로 객체를 생성할 수 없어서 Writer를 상속받은 자식클래스의 객체를 사용한다.
		try {
			Writer writer = new FileWriter(
					"C:/lecture/Java/JavaProgramming/src/chap24_dataio/Writer.txt"
			);
			
			// 2. 문자 하나씩 출력
			char ch = 'A';
			writer.write(ch);
			
			ch = '가';
			writer.write(ch);
			
			// 3. 이스케이프 문자(\를 붙여서 만드는 문자)
			// 이스케이프 문자는 특수한 기능을 하는 문자
			// \n: 엔터 값
			// \t: 탭만큼 공백 값
			ch = '\n';
			writer.write(ch);
			
			ch = '\t';
			writer.write(ch);
			
			ch = 'c';
			writer.write(ch);
			
			// char로 작은 따옴표를 표시하고 싶을 때도 이스케이프 문자 형태로 사용한다.
			ch = '\'';
			writer.write(ch);
			
			// 4. 문자배열로 출력
			char[] chArr = new char[26];
			for(int i = 0; i < chArr.length; i++) {
				chArr[i] = (char)(i + 65);
			}
			
			writer.write(chArr);
			writer.write('\n');
			
			// 5. 문자열(String)로 출력
			String str = "가나다라마바사";
			writer.write(str);
			
			writer.flush();
			
			writer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
