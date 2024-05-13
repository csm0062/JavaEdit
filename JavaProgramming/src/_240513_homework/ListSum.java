package _240513_homework;

import java.util.List;

public class ListSum {
	
	public static Integer sum(List<?> list)
	{
		int sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += (int)list.get(i);
		}
		return sum;
		
	}

}
