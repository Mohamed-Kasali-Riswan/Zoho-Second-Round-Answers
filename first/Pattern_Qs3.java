package first;

import java.util.Scanner;

public class Pattern_Qs3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int space = num-1;
		int m = 0,inc = 1;
		int i=0;
		for(;i<num;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			int start = m+inc;
			m=start;
			for(int j=0;j<=i;j++) {
				System.out.print(start--+" ");
			}
			inc++;
			space--; 
			System.out.println();
		}
		m += num+1;
		space=0;
		for(i=num-1;i>=0;i--) {
			for(int j=space;j>0;j--) {
				System.out.print(" ");
			}
			int start = m-inc;
			m=start;
			for(int j=0;j<=i;j++) {
				System.out.print(start--+" ");
			}
			inc--;
			space++;
			System.out.println();
		}
		
	}
}
