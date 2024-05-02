package _240502_homework.middle;

public class ArrayUtility {

		// TODO Auto-generated method stub
//		다음 두 개의 static 메소드를 갖는 ArrayUtility클래스를 만들어보고 사용해보세요
//		static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//		static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
		
	
	
		static double[] intToDouble(int[] source)
		{
			double[] arr = new double[source.length];
			for(int i = 0; i < source.length; i++)
			{
				arr[i] = source[i];
			}
			return arr; 
		}
		static int[] doubleToInt(double[] source)
		{
			int[] arr2 = new int[source.length];
			return arr2;
		}

	

}
