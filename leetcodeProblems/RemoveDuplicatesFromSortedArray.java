package leetcodeProblems;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums){
		if (nums.length == 0){
			return 0;
		}
		int non_repeating = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[non_repeating]){
				non_repeating++;
				nums[non_repeating] = nums[i];
			}
		}
		return non_repeating + 1;
	}
}
