package second;

//15. 1.Given two dimensional matrix of integer and print the rectangle can be formed using
//given indices and also find the sum of the elements in the rectangle
//Input: mat[M][N] = {{1, 2, 3, 4, 6}, {5, 3, 8, 1, 2}, {4, 6, 7, 5, 5}, {2, 4, 8, 9, 4} };
//index = (2, 0) and (3, 4)
//Output:
//Rectangle
//4 6 7 5 5
//2 4 8 9 4
//sum 54

// Very simple
public class SumOfRectangle_Qs15 {

	public static void main(String[] args) {
		
		int mat[][] = {{1, 2, 3, 4, 6},
				       {5, 3, 8, 1, 2}, 
				       {4, 6, 7, 5, 5}, 
				       {2, 4, 8, 9, 4} 
				      };
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i>=2 && i<=3 && j>=0 && j<=4) sum+=mat[i][j];
			}
		}
		System.out.print("Sum is "+sum);
	}

}
