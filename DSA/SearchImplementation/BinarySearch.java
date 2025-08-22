package DSA.SearchImplementation;

public class BinarySearch {
	int[] arr;

	public BinarySearch(int[] arr){
		this.arr = arr;
	}

	public int resaltSearch(int target){
		int low = 0;
		int high = arr.length - 1;

		while (low <= high){
			int mid = low + (high - low) / 2;

			if (target == arr[mid]){
				return mid;
			}
			else if (target < arr[mid]){
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}

		return -1;
	}
}
