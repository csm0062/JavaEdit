package _240513_homework;

//5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
public class GetMin {
	//제네릭 메소드 선언, Number를 상속받은 클래스 타입의 배열을 받아 최소값을 리턴
	public static <T extends Number> T getMin(T[] arr)
	{
		// 최소값 초기화
		T min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i].intValue() > min.intValue() )
			min = arr[i];
		}
		
		return min;
	}
	

}
