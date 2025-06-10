package second;

import java.util.ArrayList;

//Input: num[] = [9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2]
//Output: [9, 4, 1, 8, 8, 0, 8, 8, 1, 4, 9]
//Explanation: Next smallest palindrome is 9 4 1 8 8 0 8 8 1 4 9
//
//Input: num[] = [2, 3, 5, 4, 5]
//Output: [2, 3, 6, 3, 2]
//Explanation: Next smallest palindrome is 2 3 6 3 2


public class NextSmallestPalindromeNumber_Qs13 {

	public static void main(String[] args) {
		
		int[] num = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        ArrayList<Integer> result = nextPalindrome(num);

        for (int i : result) {
            System.out.print(i + " ");
        }
		
	}
	
	public static int areAll9s(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 9) return 0;
        }
        return 1;
    }

    // Function to generate the next palindrome
    public static void nextPalindromeUtil(int[] num) {
        int n = num.length;
        int mid = n / 2;
        boolean leftSmaller = false;
        int i = mid - 1;
        int j = (n % 2) == 1 ? mid + 1 : mid;

        // Compare left and right halves
        while (i >= 0 && num[i] == num[j]) {
            i--;
            j++;
        }

        // Check if the middle digit(s) need to be incremented
        if (i < 0 || num[i] < num[j]) leftSmaller = true;

        // Copy the left side to the right side
        while (i >= 0) {
            num[j] = num[i];
            j++;
            i--;
        }

        // If middle digits need to be incremented
        if (leftSmaller) {
            int carry = 1;
            i = mid - 1;
            if (n % 2 == 1) {
                num[mid] += carry;
                carry = num[mid] / 10;
                num[mid] %= 10;
                j = mid + 1;
            } else {
                j = mid;
            }

            // Propagate the carry and mirror the left side to the right
            while (i >= 0) {
                num[i] += carry;
                carry = num[i] / 10;
                num[i] %= 10;
                num[j++] = num[i--];
            }
        }
    }

    // Function to generate next palindrome
    public static ArrayList<Integer> nextPalindrome(int[] num) {
        ArrayList<Integer> result = new ArrayList<>();
        if (areAll9s(num) == 1) {
            result.add(1); 
            for (int i = 1; i < num.length; i++) {
                result.add(0);  
            }
            result.add(1);  
        } else {
            nextPalindromeUtil(num);  
            for (int i = 0; i < num.length; i++) {
                result.add(num[i]);  
            }
        }
        return result;
    }

}
