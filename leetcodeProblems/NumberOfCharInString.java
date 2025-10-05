package leetcodeProblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOfCharInString {
	public void func(String word){
		Map<Character, Integer> mapWord = new LinkedHashMap<>();
		for (int i = 0; i < word.length(); i++) {
			mapWord.put(word.charAt(i), mapWord.getOrDefault(word.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : mapWord.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
