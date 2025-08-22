package DSA.SearchImplementation;

public class LinearSearch {
	int[] arr;

	public LinearSearch(int[] arr){
		this.arr = arr;
	}

	public int resaltSearch(int target){
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]){
				return i;
			}
		}
		return -1;
	}
}
