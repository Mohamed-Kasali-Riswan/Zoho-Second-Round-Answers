package first;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		while(num!=0) {
			num-=1;
			sb.append((char)('A'+(num%26)));
			num/=26;
		}
		System.out.println(sb.reverse());
	}
}
