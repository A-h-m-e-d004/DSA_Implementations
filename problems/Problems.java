package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Problems {
	private TreeSet<Integer> num;
	private TreeSet<String> name;

	private Problems() {
		this.num = new TreeSet<>();
		this.name = new TreeSet<>();
	}

	public static Problems CreateWithNum(TreeSet<Integer> num){
		Problems problems = new Problems();
		problems.num = num;
		return  problems;
	}

	public static Problems CreateWithName(TreeSet<String> name){
		Problems problems = new Problems();
		problems.name = name;
		return  problems;
	}

	public void problem1(){
		num.add(50);
		num.add(10);
		num.add(40);
		num.add(20);
		num.add(30);
		System.out.println(num.first());
		System.out.println(num.last());
	}

	public void problem2(){
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Alice", "Eve", "John");
		this.name.addAll(names);
		System.out.println(this.name);

	}

	public void problem3(int num){
		this.num.add(50);
		this.num.add(10);
		this.num.add(40);
		this.num.add(20);
		this.num.add(30);
		System.out.println(this.num.higher(num));
	}

	public void problem5(){
		String[] names = {"Ahmed", "Ali", "Mohamed"};
		this.name.addAll(List.of(names));
		System.out.println("Enter world: ");
		Scanner input = new Scanner(System.in);
		String resalt = input.next();
		if (this.name.contains(resalt)){
			System.out.println("The world exits");
		}else{
			System.out.println("Not exist");
		}


	}
}
