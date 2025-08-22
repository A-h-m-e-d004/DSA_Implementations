package problems;

public class BuildInFunctionProblem {

	public StringBuilder stringRebet(String str, int count, char separetor){
		StringBuilder resalt = new StringBuilder();
		char lastChar = str.charAt(str.length() - 1);
		for (int i = 0; i < count; i++) {
			resalt.append(str);
			if (i != count - 1){
				resalt.append(separetor);
			}
		}
		return resalt;
	}

//	public String stringRebet(String str, int count){
//		String resalt = "";
//		for (int i = 0; i < count; i++) {
//			resalt += str;
//		}
//		return resalt;
//	}

//	public String[] zFill(String[] arr, char sen){
//		String[] resalt = new String[arr.length];
//		String longString = arr[0];
//		for (String s : arr){
//			if (s.length() > longString.length()){
//				longString = s;
//			}
//		}
//		for (String i : arr) {
//			int len = longString.length() - i.length();
//			String current = "";
//			for (int j = 0; j < len; j++) {
//				current += sen;
//			}
//			current += i;
//			for (int j = 0; j < resalt.length; j++) {
//				if (resalt[j] == null){
//					resalt[j] = current;
//					break;
//				}
//			}
//		}
//		return resalt;
//	}

	public StringBuilder[] zFill(String[] arr, char sen){
		StringBuilder[] resalt = new StringBuilder[arr.length];
		StringBuilder longString = new StringBuilder(arr[0]);
		for (String s : arr){
			if (s.length() > longString.length()){
				longString = new StringBuilder(s);
			}
		}
		for (String i : arr) {
			int len = longString.length() - i.length();
			StringBuilder current = new StringBuilder();
			for (int j = 0; j < len; j++) {
				current.append(sen);
			}
			current.append(i);
			for (int j = 0; j < resalt.length; j++) {
				if (resalt[j] == null){
					resalt[j] = new StringBuilder(current);
					break;
				}
			}
		}
		return resalt;
	}

	public String reveseString(String str){
		if (str == null || str.isEmpty()) {
			return str;
		}
		StringBuilder revese = new StringBuilder();
		for (int i = str.length()-1; i >= 0; i--) {
			revese.append(str.charAt(i));
		}
		return revese.toString();
	}

	public void generateLetterWithAsciiValue(char start, char end){
		for (int i = start; i <= end; i++) {
			char resalt = (char) i;
			System.out.println("ASCII: " + i + " Char: " + resalt);
		}
	}

	public int getMinimum(int[] arr){
		int minimu = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minimu){
				minimu = arr[i];
			}
		}
		return minimu;
	}

	public int getSum(int[] arr){
		int resalt = 0;
		for (int num : arr){
			resalt += num;
		}
		return resalt;
	}

	public String upperCase(String word){
		StringBuilder resalt = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if(c >= 'a' && c <= 'z'){
				c = (char) (c - 32);
			}
			resalt.append(c);
		}
		return resalt.toString();
	}
}


