package __Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList();
		//Queue<Integer> = new LinkedList<>(); 자료형 삽입하면 자료형에 넣은 자료형만 삽입, 삭제가되고
		// 자료형을 입력하지 않으면 어떤 자료형이든 삽입, 삭제가 가능하다.
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if (s.equals("push")) {
                q.add(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.remove()).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(q.size()).append("\n");
            } else if (s.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("front")) {
                if (q.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(q.peek()).append("\n");
                } 
			} else if(s.equals("back")) {
				if(q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					int n = q.size();
					for(int j = 0; j < n-1; j++) {
						q.add(q.remove());
					}
					sb.append(q.peek()).append("\n");
					q.add(q.remove());
				}
			}
		}System.out.println(sb);
		br.close();
		

	}

}
