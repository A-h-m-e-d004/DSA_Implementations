package leetcodeProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingElementInArray {
	public int find(int[] arr){
		Map<Integer, Integer> mapCount = new LinkedHashMap<>();
		for (int num : arr){
			mapCount.put(num, mapCount.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : mapCount.entrySet()){
			if (entry.getValue() == 1){
				return entry.getKey();
			}
		}
		return -1;
	}
}
