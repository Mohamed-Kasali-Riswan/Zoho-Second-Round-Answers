package first;

import java.util.LinkedList;
import java.util.Queue;

/*
 Two strings of equal length will be given. Print all the adjacent pairs which are not
equal.
Input: asdfghij and adsfgijh
Output: sd-ds, hij-ijh 
 */

public class NonAdjacentPairs_Qs7 {

	public static void main(String[] args) {
		String s1 = "asdfghij",s2="adsfgijh";
		Queue<Character> queue1 = new LinkedList();
		Queue<Character> queue2 = new LinkedList();
		StringBuilder sb = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				if(!queue1.isEmpty() && !queue2.isEmpty()) {
					while(!queue1.isEmpty()) sb.append(queue1.poll()); 
					sb.append('-');
					while(!queue2.isEmpty()) sb.append(queue2.poll()); 
					if (ans.length() > 0) ans.append(", ");
		            ans.append(sb.toString());
					sb = new StringBuilder();
				}
				else continue;
			}
			else {
				queue1.add(s1.charAt(i));
				queue2.add(s2.charAt(i));
			}
		}
		if(!queue1.isEmpty() && !queue2.isEmpty()) {
			while(!queue1.isEmpty())  sb.append(queue1.poll()); 
			sb.append('-');
			while(!queue2.isEmpty())  sb.append(queue2.poll()); 
			if (ans.length() > 0) ans.append(", ");
            ans.append(sb.toString());
		}
		
		System.out.println(ans.toString() );
	}

}
