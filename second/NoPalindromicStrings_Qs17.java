package second;

//17. Given a sentence of string, in that remove the palindrome words and print the
//remaining.
//Input:
//He did a good deed
//Output:
//He good
//Input:
//Hari speaks malayalam
//Output:
//Hari speaks

public class NoPalindromicStrings_Qs17 {

	public static void main(String[] args) {
		String s = "He did a good deed";
		String [] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String d:arr) {
			if(isPalindrome(d)) sb.append(d+" ");
		}
		System.out.println(sb.toString().substring(0,sb.length()-1));
	}
	private static boolean isPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i++)!=s.charAt(j--)) return false;
		}
		return true;
	}
}
