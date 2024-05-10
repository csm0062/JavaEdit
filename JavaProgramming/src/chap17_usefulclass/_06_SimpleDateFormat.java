package chap17_usefulclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _06_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		
		// 1. SimpleDateFormat 객체 생성
		// SimpleDateFormat 객체를 생성할 때 생성자의 매개변수로 지정할 날짜 포맷을 전달한다.
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yy년 MM월 dd일");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// 2. format 메소드
		// format 메소드를 통해서 Date객체의 날짜 데이터를 SimpleDateFormat 객체에
		// 지정한 형식으로 변경할 수 있다. 리턴 값은 String 타입이고 String으로 값이 리턴되기 때문에
		// 날짜 연산은 불가능 하다.
		System.out.println(today);
		System.out.println(simpleDateFormat1.format(today));
		System.out.println(simpleDateFormat2.format(today));
	}

}
