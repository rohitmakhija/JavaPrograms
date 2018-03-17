// Time complexity of Bubble Sort is O(n^2) if elements of the array are swapped.
// Time Complexity is O(n) when the list is already sorted.
// Space Complexity of Bubble Sort is O(1) because only single additional memory space is required for storing the temp variable.
// Every pass takes largest element at the end of the array.
//STABLE

package sortingSearching;

import util.CommonUtil;

public class BubbleSort {
	public static void main(String args[]) {
		int[] nums = {5, 2, 4, 6, 1, 1, 9, 0};
		System.out.println("Before bubble sorting the array");
		CommonUtil.printArray(nums);

		bubbleSort(nums);
		System.out.println("After bubble sorting the array");
		CommonUtil.printArray(nums);
	}

	public static void bubbleSort(int[] nums) {
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = 0 ; j < nums.length - 1 - i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
