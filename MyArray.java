package main;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

// To find the index of the target in the array. If the target 
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

// To find the index of the target in the array. If the target 
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
// Output: -1
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearchHelp(target, 0);
	}

	public int recursiveLinearSearchHelp(int target, int i) {
		if (i == array.length) {
			return -1;
		}
		if (array[i] == target) {
			return i;
		}
		return recursiveLinearSearchHelp(target, i + 1);
	}

	
	
	
	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int mid = (array.length-1)/2;
		int high = array.length-1;
		int low = 0;
		while(low <= high) {
			if(array[mid] == target) {
				return mid;
			}
			else {
				if(array[mid] > target) {
					high = mid-1;
					mid = (low+high)/2;
				}
				else {
					low = mid +1;
					mid = (low+high)/2;
				}
			}
		}
		return -1;
	}

	// To find the index of the target in the sorted array. If the
	// target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearchHelp(target, (array.length-1)/2, 0, array.length-1);
	}
    public int recursiveBinarySearchHelp(int target, int mid, int low, int high) {
		if(low > high) {
			return -1;
		}
		if(array[mid] == target) {
			return mid;
		}
		else {
			if(array[mid]>target) {
				high = mid-1;
				mid = (low+high)/2;
				return recursiveBinarySearchHelp(target, mid, low, high);
			}
			else {
				low = mid +1;
				mid = (low+high)/2;
				return recursiveBinarySearchHelp(target, mid, low, high);
			}
		}
	}
	public static void main(String[] args) {
		MyArray myArr = new MyArray(new int[] { 1, 4, 6, 9, 12, 15, 21, 22, 23, 50, 59});
		System.out.println(myArr.iterativeLinearSearch(45));
		System.out.println(myArr.recursiveLinearSearch(15));
		System.out.println(myArr.iterativeBinarySearch(50));
		System.out.println(myArr.recursiveBinarySearch(50));
	}
}