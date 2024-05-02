package chap99_homework.homework03;

import java.util.Scanner;

import _240501_homework.PhoneInfo;

public class UseOfPhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		PhoneInfo phoneInfo = new PhoneInfo();
		
		while(true)
		{
			System.out.println("---------연락처-----------");
			System.out.println("1. 연락처 입력");
			System.out.println("2. 모든 연락처 출력");
			System.out.println("3. 인덱스로 연락처 검색");
			System.out.println("4. 종료");
			
			int menuSelect = sc.nextInt(); //nextInt()엔터값을 못빼냄
			sc.nextLine();//이걸 안할경우 이름을 입력못하고 번호만 입력할 수 있는 상태가 되어버림
			
			boolean isExit = false;
			
			switch(menuSelect)
			{
				case 1:
					System.out.println("이름을 입력하세요");
					String name = sc.nextLine();
					System.out.println("번호를 입력하세요");
					String phoneNum = sc.nextLine();
					
					phoneInfo.insertPhoneInfo(name, phoneNum);
					
					break;
					
				case 2:
					phoneInfo.printAllPhoneInfo();
					break;
				case 3:
					System.out.println("검색할 연락처의 인덱스를 입력하세요.");
					
					int index = sc.nextInt();
					
					phoneInfo.printPhoneInfo(index);
					break;
				case 4:
					isExit = true;
					break;
			
					
			}
			 if(isExit)
			 {
				 System.out.println("종료합니다.");
				 break;
			 }
			
			
			
		}
		sc.close();

	}

}
