package second;

public class WordSearch {

	public static void main(String[] args) {
		char[][] board = {
	            {'Z', 'O', 'H', 'O'},
	            {'O', 'N', 'S', 'C'},
	            {'I', 'R', 'O', 'O'},
	            {'T', 'A', 'P', 'R'}
	        };
		
		boolean visited[][]= new boolean [board.length][board[0].length];
		
		String word = "ZOHOCORPORATIONS";
		
		boolean isFound = false;
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j]==word.charAt(0)) isFound=(backtrack(board,visited,word,0,i,j));
			}
			if(isFound) break;
		}
		
		System.out.println(isFound? "YES it is Hidden!":"No It is not present!");
		
	}

	private static boolean backtrack(char[][] board, boolean[][] visited,String word, int i, int row, int col) {
		if(i==word.length()) return true;
		
		if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(i) || visited[row][col]) return false;
		
		visited[row][col] = true;
		
		boolean ans = backtrack(board,visited,word,i+1,row+1,col) ||
					  backtrack(board,visited,word,i+1,row,col+1) ||
					  backtrack(board,visited,word,i+1,row-1,col) ||
					  backtrack(board,visited,word,i+1,row,col-1) ;
		
		visited[row][col] = false;
		
		return ans;
	}

}
