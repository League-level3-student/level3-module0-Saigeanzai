package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] stringss = new String[4];
		stringss[0] = "string1";
		stringss[1] = "string2";
		stringss[2] = "string3";
		stringss[3] = "string4";
		// methodOne(stringss);
		// methodTwo(stringss);
		//methodThree(stringss);
		methodFour(stringss);
	}
	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void methodOne(String[] strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void methodTwo(String[] strings) {
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void methodThree(String[] strings) {
		for (int i = 0; i < strings.length; i+=2) {
			System.out.println(strings[i]);
		}

	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void methodFour(String[] strings) {
		Random rand = new Random();
		//rand.nextInt(4);
		for (int i = strings.length-1; i >= 0; i--) {
			int num = rand.nextInt(i+1);
			System.out.println(strings[num]);
			strings[num] = strings[i];
		}
	}
	
	
}
