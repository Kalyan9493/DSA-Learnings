package datastructures.arrays;

import java.util.Arrays;

public class ArrayRotation1 {

	public static int[] rotate(int arr[], int d,int n) {
		if(d <= 0 || d >= n) {
			return arr;
		}
		arr = leftRotate(arr,0,d-1);
		arr = leftRotate(arr,d,n-1);
		arr = leftRotate(arr,0,n-1);
		return arr;
	}
	public static int[] leftRotate(int arr[], int start, int end) {
		while(start < end) {
			arr[start] = arr[start] + arr[end] - (arr[end] = arr[start]);
			start++;
			end--;
		}
		return arr;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println("before rotating : " + Arrays.toString(arr));
		arr = rotate(arr,-1,7);
		System.out.println("after rotating : " + Arrays.toString(arr));
	}
}
// Time Complexity Of the Algorithm is O(n)