package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Problems2 {
		  public static class Problems{
			 public static void problem1(){
				// number of the words in the sentence
				HashMap<String, Integer> student = new HashMap<>();
				String sentence = "java is fun and java is powerful";
				String[] words = sentence.split(" ");

				for (String word : words) {
					student.put(word, 0);
				}

				for (String word : student.keySet()){
					int i = 0;
					int count = 0;
					while (i < words.length){
						if (Objects.equals(word, words[i])){
							count++;
						}
						i++;
					}
					student.replace(word, count);
				}

				System.out.println(student);
			}

			public static int firstRebeat(int[] arr){
				HashSet<Integer> set = new HashSet<>();

				for (int num : arr){
					if (set.contains(num)){
						return num;
					}
					set.add(num);
				}
				return -1;
			 }

			 public static boolean sumSubarrayZero(int[] arr){
				 HashSet<Integer> set = new HashSet<>();
				 int sum = 0;
				 boolean found = false;
				 for (int num : arr){
					 sum += num;
					 if (sum ==0 || set.contains(sum)){
						 found = true;
						 break;
					 }
					 set.add(sum);
				 }
				 return found;
			 }

		  }

}

