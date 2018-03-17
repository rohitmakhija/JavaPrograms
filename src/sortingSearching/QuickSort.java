package sortingSearching;

import util.CommonUtil;

public class QuickSort {
	public static void main(String args[]) {
		int[] nums = {5, 2, 4, 6, 1, 1, 9, 0};
		System.out.println("Before quick sorting the array");
		CommonUtil.printArray(nums);

		quickSort(nums, 0, nums.length - 1);

		System.out.println("After quick sorting the array");
		CommonUtil.printArray(nums);
	}

	public static void quickSort(int[] nums, int low, int high) {
		int i = low;
		int j = high;

		int pivot = low + (high - low)/2;

		while(i <= j) {
			while(nums[i] < pivot) {
				i++;
			}
			while(nums[j] > pivot) {
				j--;
			}

			if(i <= j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}

		if(low < j) {
			quickSort(nums, low, j);
		}
		if(i < high) {
			quickSort(nums, i, high);
		}
	}
}