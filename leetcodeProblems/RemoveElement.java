package leetcodeProblems;

public class RemoveElement {
	public int removeElement(int[] nums, int val){
		if (nums.length == 0){
			return 0;
		}
		int non_val = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val){
				nums[non_val] = nums[i];
				non_val++;
			}
		}
		return non_val;
	}
}
