package datastructures.arrays;

import java.util.Arrays;

//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

public class ArrayRotation {

	public static int[] rotate(int arr[],int d, int n) {
		
		for(int i=0; i<d; i++) {
			arr = leftRotate(arr, n);
		}
		return arr;
	}
	
	public static int[] leftRotate(int arr[], int n) {
		int temp = arr[0];
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
		return arr;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println("before rotating : " + Arrays.toString(arr));
		arr = rotate(arr,3,7);
		System.out.println("after rotating : " + Arrays.toString(arr));
	}
}
// Time COmplexity is O(n*d)