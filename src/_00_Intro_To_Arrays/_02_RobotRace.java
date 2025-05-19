package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
public static void main(String[] args) {
	// 2. create an array of 5 robots.
Robot[] robots = new Robot[5];
	// 3. use a for loop to initialize the robots.
for(int i=0; i<5; i++) {
	Robot rob = new Robot();
	rob.setSpeed(10);
	robots[i] = rob;
}
	// 4. make each robot start at the bottom of the screen, side by side, facing up
robots[0].setX(100);
robots[0].setY(500);
robots[1].setX(275);
robots[1].setY(500);
robots[2].setX(450);
robots[2].setY(500);
robots[3].setX(625);
robots[3].setY(500);
robots[4].setX(800);
robots[4].setY(500);
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.
Random rand = new Random();
int number = rand.nextInt(50);
for(int i=0; i<5; i++) {
	robots[i].setY(robots[i].getY() - rand.nextInt(50));
}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.
boolean racing = true;
while (racing) {
	for(int i=0; i<5; i++) {
		robots[i].setY(robots[i].getY() - rand.nextInt(50));
	}
	for(int i=0; i<5; i++) {
		if(robots[i].getY() <= 0) {
			racing = false;
			System.out.println("Winner!");
			System.out.println("All the sudden... a cake and balloons appear with other robots cheering!!");
		}
	}
}
	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
	
}
}
