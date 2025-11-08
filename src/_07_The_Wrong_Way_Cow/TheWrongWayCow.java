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

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		int up = 0;
		int down = 0;
		int right = 0;
		int left = 0;
		
		
		for(int i=0; i<field.length; i++) {
			for(int j=0; j<field[0].length; j++) {
				if (getCowDirection(i,j, field)==0) {
					up+=1;
				}
				if(getCowDirection(i,j, field)==1) {
					right+=1;
				}
				if(getCowDirection(i,j, field)==2) {
					down+=1;
				}
				if(getCowDirection(i,j, field)==3) {
					left+=1;
				}
				
				if (up==1) {
			
				}
				
				}
			}
		
		
		
		return null;
	}
	
	static int getCowDirection(int x, int y, final char[][] field) {
		
		
		if (field[x][y]=='c'&&field[x][y+1]=='o'&&field[x][y+2]=='w') {
			return 2;
		}
		
		if (field[x][y]=='c'&&field[x+1][y]=='o'&&field[x+2][y]=='w') {
			return 1;
		}
		
		if (field[x][y+2]=='c'&&field[x][y+1]=='o'&&field[x][y]=='w') {
			return 0;
		}
		
		if (field[x+2][y]=='c'&&field[x+1][y]=='o'&&field[x][y]=='w') {
			return 3;
		}
		return -1;
	}
}
