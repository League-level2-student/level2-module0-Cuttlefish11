package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
public static void main(String[] args) {
	Robot[] droid = new Robot[5];
	
	for (int i = 0; i < droid.length; i++) {
		droid[i] = new Robot();
		droid[i].setX(42 + 150*i);
		droid[i].setY(535);	
	}
	
	while (droid[0].getY() > 0 && droid[1].getY() > 0 && droid[2].getY() > 0 && droid[3].getY()> 0 && droid[4].getY() > 0) {
	for (int i = 0; i < droid.length; i++) {
		droid[i].setSpeed(500);
		Random ran = new Random();
		int distance = ran.nextInt(51);
		droid[i].move(distance);
	}
	}
if (droid[0].getY() < 0) {
	System.out.println("The races winner is the first robot, the Amazing Blue Robot!");
}
else if (droid[1].getY() < 0) {
	System.out.println("The races winner is the second robot, the Speed Bot!");
}
else if (droid[2].getY() < 0) {
	System.out.println("The races winner is the third robot, the Wired Hero!");
}
else if (droid[3].getY() < 0) {
	System.out.println("The races winner is the fourth robot, the Jumping Droid!");
}
else if (droid[4].getY() < 0) {
	System.out.println("The races winner is the fifth robot, the Robotic Rhino!");
}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
