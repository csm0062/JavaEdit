package __Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택을 사용해서 푸는 문제

public class _10828 {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			//push면 스텍에 x push
			if (s.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if (s.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb);
		
	}

}
//int[] stack = new int[?];
//int size = 0;
//
//void push (int num) {
//	stack[size]= num;
//	size++;
//}
//
//int pop() {
//	if(size==0) {
//		return -1;
//	} else {
//		int top = stack[size-1];
//		stack[size-1] = 0;
//		size--;
//		return top;
//	}
//}
//
//int empty() {
//	if(size == 0) {
//		return 1;
//	} else {
//		return 0;
//	}
//}
//
//int top() {
//	if(size == 0) {
//		return -1;
//	}
//} else {
//	return stack[size - 1];
//}