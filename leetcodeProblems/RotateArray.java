package leetcodeProblems;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		if (k < 0){
			return;
		}
		if (nums.length <= 1){
			return;
		}
		if (k > nums.length){
			k = k % nums.length;
		}
		int[] leftPart = new int[nums.length - k];
		int[] rightPart = new int[k];
		for (int i = 0; i < nums.length - k; i++) {
			leftPart[i] = nums[i];
		}
		int x = nums.length - k;
		int index = 0;
		while (x < nums.length){
			rightPart[index] = nums[x];
			index++;
			x++;
		}
		for (int i = 0; i < rightPart.length; i++) {
			nums[i] = rightPart[i];
		}
		int indexRotate = k;
		for (int i = 0; i < leftPart.length; i++) {
			nums[indexRotate] = leftPart[i];
			indexRotate++;
		}
		for (int num : nums){
			System.out.print(num + " ");
		}
	}
}
