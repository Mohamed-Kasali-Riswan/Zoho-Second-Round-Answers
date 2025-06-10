package first;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays_Qs6 {

	public static void main(String[] args) {

		int a[]= {2,5,7,8,9};
		int b[]= {1,3,4,5,6,7,8,10};
		
		List<Integer> list =new ArrayList<>();
		
		int i=0,j=0;
		while(i<a.length && j<b.length) {
			if(a[i]==b[j]) {
				list.add(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j]) {
				list.add(a[i]);
				i++;
			}else {
				list.add(b[j]);
				j++;
			}
		}
		while(i<a.length) list.add(a[i++]);
		while(j<b.length) list.add(b[j++]);
		System.out.println(list);
		
		System.out.println("Method 2 is "+method2(a,b));

	}
	
	private static List<Integer> method2(int [] a , int [] b){
		List<Integer> list =new ArrayList<>();
		
		int i=0,j=0;
		
		while(i<a.length || j<b.length) {
			if(i<a.length && j<b.length) {
				if(a[i]==b[j]) {
					list.add(a[i]);
					i++;
					j++;
				}else if(a[i]<b[j]) {
					list.add(a[i]);
					i++;
				}else {
					list.add(b[j]);
					j++;
				}
			}else if(i<a.length)  list.add(a[i++]);
			else  list.add(b[j++]); 
		}
		
		return list;
	}

}
