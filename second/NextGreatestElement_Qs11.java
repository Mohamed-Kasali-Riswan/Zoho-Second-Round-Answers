package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 11. Find the next greater element for each element in given array.
input: array[]={6, 3, 9, 10, 8, 2, 1, 15, 7};
output: {7, 6, 10, 15, 9, 3, 2, _, 8} If we are solving this question using sorting, we need to
use any O(nlogn) sorting algorithm

 */
public class NextGreatestElement_Qs11 {
	public static void main(String[] args) {
		int array[]={6, 3, 9, 10, 8, 2, 1, 15, 7};
		List<Integer> list = new ArrayList<>();
		for(int k:array) list.add(k);
		Collections.sort(list);
		List ans = new ArrayList();
		
		for(int k:array) {
			try {
				ans.add(list.get(list.indexOf(k)+1));
			}catch(Exception e) {
				ans.add("_");
			}
		}
		System.out.println(ans);
	}
}
