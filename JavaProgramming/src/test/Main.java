package test;
//------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
    }
    public double solution(int[] numbers) {
        numbers = new int[10];
        double answer = 0;
        for(int i = 0; i < 10; i++){
          answer += numbers[i];
        }
        
        return answer/10;
    }
    
}