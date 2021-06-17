
// search element in the rotated array in sorted form
package datastructures.arrays;

public class ArrayRotationSearch {

	public static int search(int arr[], int l, int h, int key) {
		if(l>h) { return -1; }
		int mid = (l+h)/2;
		if(key == arr[mid]) { return mid; }
		
		if(arr[l] <= arr[mid]) {
			// if element present in between 1st half
			if(key >= arr[l] && key <= arr[mid]) {
				return search(arr,l,mid-1,key);
			}
			// else 2nd half
			return search(arr,mid+1,h,key);
		}
		// if sub array is not in sorted order
		// if element present in between 2nd half
		if (key >= arr[mid] && key <= arr[h]) {
			return search(arr, mid + 1, h, key);
		}
		// else 1st half
		return search(arr, l, mid - 1, key);
	}
	
	public static void main(String args[]) {
		int arr[] = {4,5,6,7,8,9,1,2,3};
		int res = search(arr,0,arr.length-1,20);
		if(res == -1) {
			System.out.println("Element Not Found");
		}else {
			System.out.println("Element Found At index :" + res);
		}
	}
}
