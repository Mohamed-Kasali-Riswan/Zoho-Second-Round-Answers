package first;

import java.util.HashMap;
import java.util.Map;

/*
8. Find the frequency of all numbers in an array.
Note: use dynamic memory allocation.
For example, if the input is {1, 2, 45, 67, 1, 88}, do not calculate the frequency of all
elements from 1 to 88.
*/

public class FrequencyOfNumbers_Qs8 {

	public static void main(String[] args) {

		int [] arr = {1, 2, 45, 67, 1, 88} ;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue() );
		}
	}

}
