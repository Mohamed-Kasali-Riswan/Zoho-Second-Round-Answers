package first;

public class WordSearch_Qs2 {

	public static void main(String[] args) {
		
		String[] arr = { "i", "like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango"};
				
		String s="ilike";
		
		if(backTrack(arr,s)) System.out.println("YEs");
		else System.out.println("No");
	}

	private static boolean backTrack(String[] arr, String s) {
		
		if(s.length()==0 || s==null) return true;
		
		for(String k:arr) {
			if(s.startsWith(k)) return backTrack(arr, s.substring(k.length()));
		}
		
		return false;
	}

}
