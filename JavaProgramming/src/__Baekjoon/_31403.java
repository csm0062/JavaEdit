package __Baekjoon;

import java.util.Scanner;

public class _31403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = A + B - C;
		String str = String.valueOf(A) + String.valueOf(B);
		int sumStr = Integer.parseInt(str) - C;
//		int sumStr = Integer.parseInt("" + A + B) - C;
		
		System.out.println(sum);
		System.out.println(sumStr);
	}

}
