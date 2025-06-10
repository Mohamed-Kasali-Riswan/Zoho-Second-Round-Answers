package second;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//Given an array with repeated numbers, Find the top three repeated numbers.
//input: array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3}
//output: 3, 16, 15


public class Top3FrequencyNum_Qs14 {
	
	public static void main(String[] args) {
		
		int array[]={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int k : array) {
			map.put(k, map.getOrDefault(k, 0)+1);
		}
		
		List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		// Collections.sort(list,(a,b)-> b.getValue()-a.getValue());
		list.sort((a,b)-> b.getValue()-a.getValue());
		
		int i=0;
		for(Map.Entry<Integer,Integer> entry : list) {
			i++;
			System.out.print(entry.getKey());
			if(i==3) break;
			System.out.print(" - ");
		}
		
	}
	
}
