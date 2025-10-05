package importantproblems;

import java.util.HashMap;
import java.util.Map;

public class FindLongestStringInList {
	public String findLongestStringInList(String[] arr){
		Map<String, Integer> stringAndLength = new HashMap<>();
		for (String word : arr){
			stringAndLength.put(word, word.length());
		}
		String longestString = null;
		int length = 0;
		for (Map.Entry<String, Integer> entry : stringAndLength.entrySet()){
			if (entry.getKey() != null){
				if (entry.getValue() > length){
					length = entry.getValue();
					longestString = entry.getKey();
				}
			}
		}
		return longestString;
	}
}
