package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	public static void main(String[] args) {
		Robot[] droids = new Robot[5];
		String[] names = new String[5];
		names[0] = "the Amazing Blue Robot";
		names[1] = "the Speed Bot";
		names[2] = "the Electronic Hero";
		names[3] = "the Jumping Droid";
		names[4] = "the Robotic Rhino";
		int[] turns = new int[5];
		Random ran = new Random();
		for (int i = 0; i < droids.length; i++) {
			droids[i] = new Robot();
			droids[i].setX(42 + 150 * i);
			droids[i].setY(535);
			droids[i].setSpeed(500);
		}

//		boolean raceOn = true;
//		while (raceOn) {
//			for (int i = 0; i < droids.length; i++) {
//				int distance = ran.nextInt(51);
//				droids[i].move(distance);
//				if (droids[i].getY() <= 0) {
//					System.out.println("The winner is " + names[i]);
//					raceOn = false;
//					break;
//				}
//
//			}
		boolean raceOn = true;
		while (raceOn) {
			for (int i = 0; i < droids.length; i++) {
				int distance = ran.nextInt(51);
				for (int j = 0; j < distance; j++) {
					droids[i].move(5);
					droids[i].turn(1);
					turns[i] += 1;
					if (turns[i] >= 360) {
						System.out.println("The winner is " + names[i]);
						raceOn = false;
						break;
					}
				}
				if(!raceOn) {
				break;	
				}

			}
		}
	}

}
// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
//FOR CIRCLES AND THE CCIRCULAR TRACK
//for (int i = 0; i < 400; i++) {
// one.turn(360/359);
// one.move(5);

//}
