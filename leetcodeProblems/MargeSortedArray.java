package leetcodeProblems;


import java.util.Arrays;

public class MargeSortedArray {
	public void margeSortedArray(int[] nums1, int m, int[] nums2, int n){
		int[] newArr = new int[m+n];
		for (int i = 0; i < m; i++) {
			newArr[i] = nums1[i];
		}
		for (int j = 0; j < n; j++) {
			newArr[j+m] = nums2[j];
		}
		Arrays.sort(newArr);
		for (int k = 0; k < newArr.length; k++) {
			nums1[k] = newArr[k];
		}
	}
}
