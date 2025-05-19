package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] fruits = new String[5];
		fruits[0] = "peach";
		fruits[1] = "mango";
		fruits[2] = "kiwi";
		fruits[3] = "orange";
		fruits[4] = "pineapple";
		// 2. print the third element in the array
		System.out.println(fruits[2]);
		// 3. set the third element to a different value
		fruits[2] = "grape";
		// 4. print the third element again
		System.out.println(fruits[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < 5; i++) {
			fruits[i] = "strawberry";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(fruits[i]);
		}
		// 7. make an array of 50 integers
		int[] num = new int[50];
		for (int i = 0; i < 50; i++) {
			num[i] = i;
			// System.out.println(i);
		}
		// 8. use a for loop to make every value of the integer array a random
		// number
		int[] number = new int[50];
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			number[i] = rand.nextInt();
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		int smallest = number[0];
		for (int i = 0; i < 50; i++) {
			if (number[i] < smallest) {
				smallest = number[i];
			}
		}
		System.out.println(smallest);
		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.
		int largest = number[0];
		for (int i = 0; i < 50; i++) {
			if (number[i] > largest) {
				largest = number[i];
			}
		}
		System.out.println(largest);

		// 12. print only the last element in the array
		System.out.println(number[49]);
	}
}
