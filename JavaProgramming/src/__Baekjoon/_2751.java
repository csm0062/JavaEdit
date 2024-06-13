package __Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 주어지는 수의 개수
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			intList.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(intList);
		
		for(int i : intList) {
			bw.write(i + "\n");
		}
			bw.flush();
		bw.close();
		br.close();
	}
}
