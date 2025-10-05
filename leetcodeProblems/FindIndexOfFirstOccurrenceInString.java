package leetcodeProblems;

import java.util.Arrays;
import java.util.Objects;

public class FindIndexOfFirstOccurrenceInString {
	public int findIndexOfFirstOccurrenceInString(String haystack, String needle){

		if (needle.isEmpty()){
			return -1;
		}

		if (haystack.length() < needle.length()){
			return -1;
		}

		String[] haystackArr = haystack.split("");
		String[] needleArr = needle.split("");

		int index = -1;
		int haystackCount = 0;
		while (haystackCount < haystackArr.length){
			boolean track = true;
			int nextIndex = haystackCount;
			if (Arrays.stream(haystackArr, nextIndex, haystackArr.length).toArray(String[]::new).length < needleArr.length){
				return index;
			}
			for (int i = 0; i < needleArr.length; i++) {
				if (Objects.equals(haystackArr[nextIndex], needleArr[i])){
					nextIndex++;
					index = nextIndex;
				}
				else {
					index = -1;
					track = false;
					break;
				}
			}
			haystackCount++;
			if (track){
				return index - needleArr.length;
			}
		}
		return index;
	}
}
