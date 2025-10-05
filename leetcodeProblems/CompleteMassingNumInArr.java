package leetcodeProblems;

import java.util.Arrays;

public class CompleteMassingNumInArr {
	public int completeArrMethod(int[] arr){
		int[] sortedArr = Arrays.stream(arr).sorted().toArray();
		int arrSum = 0;
		for (int num : sortedArr){
			arrSum += num;
		}
		int completeArrSum = 0;
		for (int i = 1; i <= sortedArr[sortedArr.length-1]; i++) {
			completeArrSum += i;
		}
		return completeArrSum - arrSum;
	}
}
