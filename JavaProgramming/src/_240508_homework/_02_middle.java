package _240508_homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _02_middle {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		
		// 오늘 날짜 입력받음
		Calendar calendar = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//날짜를 나눠 넣겠다는 함수
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//빈 캘린더에 date값을 넣음(내가 입력 한 시간을 넣겠다)
		calendar.setTime(date);
		
		calendar.add(calendar.DATE, 3);
		
		date = calendar.getTime();
		
		//sdf의 포맷대로 출력할꺼야
		System.out.println(sdf.format(date));
		
		int year = Integer.parseInt(str.substring(0,4));
		int month = Integer.parseInt(str.substring(5, 7));
		int day = Integer.parseInt(str.substring(9, 11));
		
		
//		2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//		   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		String[] dayArr = {"","일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		System.out.println("날짜를 입력하세요");
		String str2 = sc.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(str2.substring(0,4)), 
				Integer.parseInt(str2.substring(5, 7)) - 1, 
				Integer.parseInt(str2.substring(8, 10)));
		
		//DAY_OF_WEEK 숫자로 뱉어짐 0~8
		//cal에 날짜가 들어있으니 객체를 들여와야한다.
		System.out.println(dayArr[cal.get(Calendar.DAY_OF_WEEK)]);
		
//		3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set(2023, 3, 15, 20, 31, 45);
		cal2.set(2021, 7, 8, 11, 58, 4);
		
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		diff %= ((long)1000 * 60 * 60 * 24);
		long diffTime = diff / ((long)1000 * 60 * 60);
		diff %= ((long)1000 * 60 * 60);
		long diffMin = diff /((long)1000 * 60);
		diff %= ((long)1000 * 60);
		long diffSec = diff / ((long)1000);
	     
		System.out.println(diffTime + "시 " + diffMin +"분 "+ diffSec +"초");
		
	}
	

}
