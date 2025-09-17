package leetcodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums){
		Map<Integer, Integer> countOfNum = new HashMap<>();
		for (int num : nums){
			countOfNum.put(num, countOfNum.getOrDefault(num, 0) + 1);
		}
		int maxVal = 0;
		int maxKey = 0;
		for (Map.Entry<Integer, Integer> entry : countOfNum.entrySet()){
			if (entry.getValue() > maxVal){
				maxVal = entry.getValue();
				maxKey = entry.getKey();
			}
		}
		return maxKey;
	}
}
