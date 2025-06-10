package second;

import java.util.HashSet;
import java.util.Set;

//20. Print longest sequence between same character
//Ex I/p abcccccbba
//O/p 8 (from a to a)
//I/p aaaaaaaa
//O/p 6

public class LongestSequence_Qs20 {

	public static void main(String[] args) {
		
		int max = Integer.MIN_VALUE;
		
		String s = "aaaaaaaa";
		
		Set<Character> set = new HashSet<>();
		
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c:set) {
			if(max<s.lastIndexOf(c)-s.indexOf(c)) max=s.lastIndexOf(c)-s.indexOf(c)-1;
		}
		System.out.println(max);
	}

}
