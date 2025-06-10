package first;

import java.util.Arrays;
import java.util.Stack;

/*
4.Given an array as input, The condition is if the number is repeated you must add the
number and put the next index value to 0. If the number is 0 print it at the last.
Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
Output: 4 2 12 8 0 0 0 0 0 .

*/
public class DoubleDuplicate_Qs4 {
	public static void main(String[] args) {
		int arr[] = { 0, 2, 2, 4, 0, 6, 6, 0, 8};
		
		//System.out.println(Arrays.toString(main(arr)));
		
		Stack<Integer> stack = new Stack<>();
		int[] ans = new int [arr.length];

		for(int i:arr) {
			if(!stack.isEmpty() && i!=0 && stack.peek()==i) {
				int j = stack.pop();
				stack.add(j*2);
			}else if(i==0) continue;
			else stack.add(i);
		}
		int i=0;
		for(int k:stack) {
			ans[i++] = k;
		}
		
		System.out.println(Arrays.toString(ans ));
	}
}
