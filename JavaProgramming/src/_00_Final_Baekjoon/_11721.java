package _00_Final_Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int n = str.length() / 10;
		
		int index = 0;
				
		for(int i = 0; i < n; i++) {
			System.out.println(str.substring(index, index + 10));
			index += 10;
		}
		
		n = str.length() % 10;
		
		System.out.println(str.substring(str.length() - n));
		
		
		sc.close();
	}

}
