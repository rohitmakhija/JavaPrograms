package sortingSearching;

import util.CommonUtil;

public class MergeSort {
	int tempArray[];

	public static void main(String args[]) {
		int[] nums = {5, 2, 4, 6, 1, 1, 9, 0};
		System.out.println("Before merge sorting the array");
		CommonUtil.printArray(nums);

		MergeSort m = new MergeSort();
		m.sort(nums);
		System.out.println("After merge sorting the array");
		CommonUtil.printArray(nums);
	}

	public void sort(int[] nums) {
		this.tempArray = new int[nums.length];
		mergeSort(nums, 0, nums.length - 1);
	}

	public  void mergeSort(int[] nums, int low, int high) {
		if(low < high) {
			int mid = low + (high - low)/2;
			mergeSort(nums, low, mid);
			mergeSort(nums, mid + 1, high);

			merge(nums, low, mid, high);
		}
	}

	public void merge(int[] nums, int low, int mid, int high) {
		for(int i = 0; i < tempArray.length; i++) {
			tempArray[i] = nums[i];
		}

		int i = low;
		int j = mid + 1;
		int k = low;

		while(i <= mid && j <= high) {
			if(tempArray[i] < tempArray[j]) {
				nums[k++] = tempArray[i++];
			}else {
				nums[k++] = tempArray[j++];
			}
		}

		while(i <= mid) {
			nums[k++] = tempArray[i++];
		}
	}
}