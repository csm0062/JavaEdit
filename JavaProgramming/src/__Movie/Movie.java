package __Movie;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("=============== 영화 메뉴 =================");
			System.out.println("(1)  영화 예매");
			System.out.println("(2)  예매조회 및 예매취소");
			System.out.println("========================================");
			System.out.println("(9)  영화 관리자 모드");
			System.out.println("========================================");
			System.out.println("(0)  프로그램 종료");
			System.out.println("========================================");
			System.out.println("선택: ");
			
			int menuSelect = sc.nextInt();//nextInt()엔터값을 못빼냄
			sc.nextLine(); //이걸 안할경우 이름을 입력못하고 번호만 입력할 수 있는 상태가 되어버림
			
			boolean isExit = false;
			
			switch(menuSelect) {
			
				case 1:
					System.out.println("=============== 영화 목록 =================");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
