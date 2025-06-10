package first;
/*
 
   9.From the input sentence given, find the strings which are not palindrome and print it.
	 Input: he knows malayalam
	 Output: he knows
 
 * */
public class NotMalayalam_Qs9 {

	public static void main(String[] args) {
		
		String str = "he knows Malayalam";
		
		StringBuilder sb = new StringBuilder();
		
		for(String s: str.split(" ")) {
			boolean isPal =true;
			int i=0,j=s.length()-1;
			while(i<j) {
				if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--))) {
					isPal =false;   
					break;
				}
			}
			if(!isPal) sb.append(s+" ");
		}
		System.out.println(sb.toString());
	}

}
