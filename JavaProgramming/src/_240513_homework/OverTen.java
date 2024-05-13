package _240513_homework;

import java.util.Map;
import java.util.Map.Entry;

public class OverTen {
//	Map을 어떤형태로든 받아서 Map<K, V> map  /   Map<?,?> map
//	value를 String으로 변경했을 때 String.value
//	길이가 10이상되는 key를 출력하는 key = (value.length >= 10)
//	메소드 void printOverTen을 구현하세요.
	public void printOverTen(Map<?,?> map)
	{
		for(Map.Entry<?, ?> entry : map.entrySet())
		{
			 //value를 String으로 변환하여 길이가 10 이상인 key 출력
			if(String.valueOf(entry.getValue()).length() >= 10)
			{
				System.out.println(entry.getValue());
			}
		}
	}

}
