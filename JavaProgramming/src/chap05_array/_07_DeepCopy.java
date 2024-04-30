package chap05_array;

public class _07_DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
		// 2. 깊은 복사
		// 깊은 복사는 heap 메모리 영역에 새로운 배열을 생성해서 전달하기 때문에
		// 서로 다른 배열을 바라보게 하는 것이다.
		// 2-1. clone 메소드 사용
		int[] copyArr1 = arr.clone();
		
		System.out.println(arr);
		System.out.println(copyArr1);
		System.out.println(arr == copyArr1);

	}

}
