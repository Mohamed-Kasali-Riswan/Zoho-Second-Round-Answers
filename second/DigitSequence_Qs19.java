package second;

import java.util.HashSet;
import java.util.Set;

/*
19. Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number of
possible decodings of the given digit sequence.
Examples:
Input: digits[] = “121”
Output: 3 // The possible decodings are “ABA”, “AU”, “LA”
Input: digits[] = “1234” Output: 3
// The possible decodings are “ABCD”, “LCD”, “AWD”
 */


public class DigitSequence_Qs19 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		int digits[] = {1,2,3,4};
		backtrack(digits,0,new StringBuilder(),set);
		System.out.println(set);
		System.out.println(set.size());
	}

	private static void backtrack(int[] digits, int index, StringBuilder sb, Set<String> set) {
		if(index==digits.length) {
			set.add(sb.toString());
			return;
		}
		char num = (char)( digits[index]+'A'-1);
		sb.append(num);
		backtrack(digits,index+1,sb,set);
		sb.deleteCharAt(sb.length()-1);
		if(index+1<digits.length && (digits[index]*10)+digits[index+1]<=26) {
			char nums = (char) ((char) ((digits[index]*10)+digits[index+1])+'A'-1);
			sb.append(nums);
			backtrack(digits,index+2,sb,set);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}






















