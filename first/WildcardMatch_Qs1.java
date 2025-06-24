package first;
/*
1. Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds if wildcard pattern is matched with text. 
   The matching should cover the entire text (not partial text). The wildcard pattern can include the characters ‘?’ and ‘’ ‘?’ 
		? – matches any single character &  
		* – Matches any sequence of characters (including the empty sequence)
*/

public class WildcardMatch_Qs1 {

	//This is method 1 --
	public static boolean isMatch(String s, String p) {
        int i=0,j=0,start=-1,match=0;
        while(i<s.length()){
            if(j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }else if(j<p.length() && p.charAt(j)=='*'){
                start=j;
                match=i;
                j++;
            }else if(start!=-1){
                j= start+1;
                match++;
                i=match;
            }else return false;
        }
        while(j<p.length() && p.charAt(j)=='*'){
            j++;
        }
        return j==p.length();
    }

	// This is method 2 --
	private static boolean isPatternMatch(String text,String pattern) {
		
		String regex = pattern.replace(".","\\.").replace("*",".*").replace("?",".");
		
		return text.matches(regex);
		
	}

    public static void main(String[] args) {
        System.out.println(isMatch("abcde", "a*de"));      // true
        System.out.println(isMatch("abcde", "a*c?e"));     // true
        System.out.println(isMatch("abc", "a*d"));         // false
        System.out.println(isMatch("abc", "*"));           // true
        System.out.println(isMatch("abc", "???"));         // true
    }
}
