package first;

/*
5. Print the given input string in ‘X’ format.
Note: The string length will be of odd length.
*/

public class XPatternString_Qs5 {
	public static void main(String[] args) {
		String str = "PRIYA";
		int m=0,n=str.length()-1;
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++) {
				if(j==m || j==n) System.out.print(str.charAt(j));
				else System.out.print(" ");
			}
			System.out.println();
			m++;
			n--;
		}
	}
}
