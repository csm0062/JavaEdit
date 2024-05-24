package test;
//------------------------------------------------------------

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		int fst = sc.nextInt();
		int snd = sc.nextInt();
		int trd = sc.nextInt();
		
		int prize = 0;
		
		if(fst == snd && snd == trd) {
			prize = 10000 + (fst * 1000);
		}else if(fst == snd || snd == trd || fst == trd) {
			int num = fst == snd ? 
			prize = 1000 + 
		}
		

		
		
		
		
	}

}
