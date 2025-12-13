/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		ArrayList<int[]> upLocations = new ArrayList<int[]>();
		ArrayList<int[]> downLocations = new ArrayList<int[]>();
		ArrayList<int[]> rightLocations = new ArrayList<int[]>();
		ArrayList<int[]> leftLocations = new ArrayList<int[]>();

		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				int direction = getCowDirection(i,j,field);
				if (direction == 0) {
					upLocations.add(new int[] {j,i+2});
				}
				if (direction == 1) {
					rightLocations.add(new int[] {j,i});
				}
				if (direction == 2) {
					downLocations.add(new int[] {j,i});
				}
				if (direction == 3) {
					leftLocations.add(new int[] {j+2,i});
				}

			}
		}
		System.out.println("up:" + upLocations.size());
		System.out.println("down:" + downLocations.size());
		System.out.println("left:" + leftLocations.size());
		System.out.println("right:" + rightLocations.size());
		if (upLocations.size() == 1) {
			return upLocations.get(0);
		}
		if (rightLocations.size() == 1) {
			return rightLocations.get(0);
		}
		if (downLocations.size() == 1) {
			return downLocations.get(0);
		}
		if (leftLocations.size() == 1) {
			return leftLocations.get(0);
		}

		return null;
	}
//2103
	static int getCowDirection(int x, int y, final char[][] field) {
try {
		if (field[x][y] == 'c' && field[x][y+1] == 'o' && field[x][y+2] == 'w') {
			return 1;
		}
		if (field[x][y+2] == 'c' && field[x][y+1] == 'o' && field[x][y] == 'w') {
			return 3;
		}
} catch (ArrayIndexOutOfBoundsException e) {
	//System.out.println("no");
}
try {	
if (field[x][y] == 'c' && field[x+1][y] == 'o' && field[x+2][y] == 'w') {
			return 2;
		}

		if (field[x+2][y] == 'c' && field[x+1][y] == 'o' && field[x][y] == 'w') {
			return 0;
		}
} catch (ArrayIndexOutOfBoundsException e) {
	//System.out.println("no");
}
		
		return -1;
	}
}
