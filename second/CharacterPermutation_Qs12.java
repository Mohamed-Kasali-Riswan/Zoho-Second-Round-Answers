package second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CharacterPermutation_Qs12 {
	static Set<String> result = new HashSet<>();
	public static void main(String[] args) {
		String str = "ABCA";	
		char [] strs = str.toCharArray();
		boolean [] visited = new boolean[str.length()];
		backtrack(strs,visited,new StringBuilder());
		System.out.println(result.size());
		for(String s:result) {
			System.out.println(s);
		}
	}

	private static void backtrack(char[] str,boolean [] visited, StringBuilder sb) {
		if(sb.length()==str.length) {
			result.add(sb.toString());
			return;
		}
		for(int i=0;i<str.length;i++) {
			if(visited[i]) continue;
			visited[i]=true;
			sb.append(str[i]);
			backtrack(str,visited,sb);
			sb.deleteCharAt(sb.length()-1);
			visited[i]=false;
		}
	}
}
