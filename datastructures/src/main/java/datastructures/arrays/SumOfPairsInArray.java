// find the sum of pairs exists in the given sorted and rotated array

package datastructures.arrays;

import java.util.HashSet;

public class SumOfPairsInArray {
	
	// my solution O(n*2) time complexity
	public static boolean isPairFound(int [] arr, int sum) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i]+arr[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	// minimized solution with O(n) Time Complexity 
	public static boolean isPairFoundUsingHashset(int[] arr, int sum) {
		HashSet<Integer> elements = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			int temp = sum - arr[i];
			if(elements.contains(temp)) {
				return true;
			}
			elements.add(arr[i]);
		}
		return false;
	} 
	
	public static void main(String[] args) {
		int[] arr = {11,15,6,8,9,10};
		int sum = 16;
		System.out.println(isPairFound(arr, sum));
		System.out.println(isPairFoundUsingHashset(arr, sum));
	}

}
