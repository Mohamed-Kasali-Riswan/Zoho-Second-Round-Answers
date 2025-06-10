package second;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		String [] arr = {"I","much","Zoho","very","love"};
		boolean [] visited = new boolean[arr.length];
		Set<String> set = new HashSet<>();
		backtrack(arr,visited,new ArrayList<>(),set );
		for(String d:set) {
			System.out.println(d);
		}
	}

	private static void backtrack(String[] arr, boolean[] visited,List<String> list, Set<String> set) {
		if(list.size()==arr.length) {
			set.add(String.join("_", list));
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(visited[i]) continue;
			visited[i]=true;
			list.add(arr[i]);
			backtrack(arr,visited,list,set );
			list.remove(list.size()-1);
			visited[i]=false;
		}
	}

}
