package leetcodeProblems;

public class CompressesString {
	public String compressesString(String word){
		StringBuilder compressesStr = new StringBuilder();
		int count = 0;
		int index = 0;
		int nextIndex = 0;
		while (index < word.length()){
			boolean track = true;
			char c = 0;
			while (track){
				if (nextIndex >= word.length()){
					break;
				}
				if (word.charAt(index) == word.charAt(nextIndex)){
					c = word.charAt(index);
					count++;
					nextIndex++;
				}
				else {
					track = false;
				}
			}
			index = nextIndex;
			compressesStr.append(c);
			compressesStr.append(count);
			count = 0;
		}
		if (!(compressesStr.length() <= word.length())){
			return word;
		}
		else {
			return compressesStr.toString();
		}
	}
}
