package second;

import java.util.*;

public class ArrayPermutation_Qs12 {
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		backtrack(arr,0,new ArrayList<>(),result);
		for(List<Integer> list : result) {
			if(list.size()!=0) System.out.println(list);
		}
	}

	private static void backtrack(int[] arr, int i, ArrayList cur, List<List<Integer>> result) {
		if(i==arr.length) {
			result.add(new ArrayList(cur));
			return;
		}
		cur.add(arr[i]);
		backtrack(arr,i+1,cur,result);
		cur.remove(cur.size()-1);
		backtrack(arr,i+1,cur,result);
	}
}
