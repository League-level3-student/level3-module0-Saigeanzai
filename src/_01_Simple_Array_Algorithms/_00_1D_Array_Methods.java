package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int number = 0;
		for(int i=0; i<values.length; i++) {
			number += values[i];
		}
		
		return number;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
double number = 0;
double num = 0;
		for(int i=0; i<values.length; i++) {
		number += values[i];
		}
		num = number/values.length;
		return num;
	}

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
for (int i=0; i<array.length; i++) {
	if (array[i]==value) {
		return true;
	}
}	
		return false;
	}

	// 4. Complete the method so that it returns the index of the,
	// first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
for (int i=0; i<arr.length; i++) {
	if (arr[i]==value) {
		return i;
	}
}
		
		
		
		
		
		return -1;
	}
}
