package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*

10. Given two Strings s1 and s2, remove all the characters from s1 which is present in s2.
Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece”

*/

public class RemoveChars {

	public static void main(String[] args) {
	
		String s1="expErIence", s2="En";
		List<Character> list = new ArrayList<>();
		for(char c:s2.toCharArray()) {
			list.add(c);
		}
		StringBuilder sb =  new StringBuilder();
		for(char c:s1.toCharArray()) {
			if(list.contains(c)) continue;
			else sb.append(c);   
		}
		System.out.println(sb.toString());
	}

}
