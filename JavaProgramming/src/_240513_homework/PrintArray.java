package _240513_homework;

public class PrintArray {
	public <T> void printArr(T[] arr)
	{
		for(int index = 0; index < arr.length; index++)
		{
			if(index % 3 == 0)
			{
				System.out.println(index + ":" + arr[index]);
			}
		}
	}

}
