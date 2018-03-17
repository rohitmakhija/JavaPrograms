// Time Complexity is O(n^2).
// Space Complexity is O(1) because of 'key' variable.
// Eg: Sorting cards in your hand.
// STABLE
package sortingSearching;

import util.CommonUtil;

public class InsertionSort {
	public static void main(String args[]) {
		int[] nums = {5, 2, 4, 6, 1, 1, 9, 0};
		System.out.println("Before insertion sorting the array");
		CommonUtil.printArray(nums);

		insertionSort(nums);
		System.out.println("After insertion sorting the array");
		CommonUtil.printArray(nums);
	}

	public static void insertionSort(int[] nums) {
		for(int i = 1 ; i < nums.length; i++) {
			int j = i;
			while(j > 0 && nums[j] < nums[j - 1]) {
				int temp = nums[j];
				nums[j] = nums[j - 1];
				nums[j - 1] = temp;
				j--;
			}
		}
	}
}
