package _240508_homework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Calendar 객체를 오늘날짜로 생성하세요.
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 3, 8);
		
		System.out.println(DateToString(calendar));
		
		calendar.add(calendar.YEAR, 5);
		calendar.add(calendar.MONTH, 2);
		calendar.add(calendar.DATE, 3);
		
		System.out.println(DateToString(calendar));
		
//		2. Calendar 객체를 오늘날짜로 생성하세요.
//		   오늘날짜를 2023-03-24 형식으로 출력하세요.
//		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		Calendar calendar1 = Calendar.getInstance();
		System.out.println(printToString(calendar1));
		
		Calendar calendar2 = Calendar.getInstance();
		System.out.println(printToDate(calendar2) +" "+ TimeToString(calendar2));
		
		

//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.
		List<Integer> intList = new ArrayList<Integer>();
		
		intList = IntList();
		
		System.out.println(intList);
	}

	public static String DateToString(Calendar calendar) 
	{
		return
				calendar.get(calendar.YEAR) + "년 " + 
				(calendar.get(calendar.MONTH) + 1) + "월 " +
				calendar.get(calendar.DATE) + "일 ";
	}
	
	public static String TimeToString(Calendar calendar)
	{
		return
				calendar.get(calendar.HOUR_OF_DAY) + "시 " +
				calendar.get(calendar.MINUTE) + "분 " +
				calendar.get(calendar.SECOND) + "초";
	}
	public static String printToDate(Calendar calendar)
	{
		return
				calendar.get(calendar.YEAR)
				+ "년 " + 
				(((calendar.get(calendar.MONTH) + 1) < 10) 
				? "0" + (calendar.get(calendar.MONTH) + 1)
				: + (calendar.get(calendar.MONTH) + 1)) 
				+ "월 " +
				((calendar.get(calendar.DATE) < 10)
				? "0" + calendar.get(calendar.DATE)
				: + calendar.get(calendar.DATE))
				+"일";
	}
	public static String printToString(Calendar calendar)
	{
		return
				calendar.get(calendar.YEAR)
				+ "-" + 
				(((calendar.get(calendar.MONTH) + 1) < 10) 
				? "0" + (calendar.get(calendar.MONTH) + 1)
				: + (calendar.get(calendar.MONTH) + 1)) 
				+ "-" +
				((calendar.get(calendar.DATE) < 10)
				? "0" + calendar.get(calendar.DATE)
				: + calendar.get(calendar.DATE));
	}
	
	public static List<Integer> IntList()
	{
		Scanner sc = new Scanner(System.in);
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("정수를 입력하세요.");
			intList.add(sc.nextInt());
		}
		sc.close();
		
		return intList;
	}
	
	
}
