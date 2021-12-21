package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] colors = {"red", "blue","green", "black", "white"};

		//2. print the third element in the array
		System.out.println(colors[2]);
		//3. set the third element to a different value
		colors[2] = "purple";
		//4. print the third element again
		System.out.println(colors[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE

for (int i=0;i<colors.length;i++) {
     System.out.println(colors[i]);
}
		
		//6. make an array of 50 integers
int[] rando = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < rando.length; i++) {
			Random ran = new Random();
			rando[i] = ran.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < rando.length; i++) {
			if (rando[i] < smallest) {
				smallest = rando[i];
			}
		}
		System.out.println(smallest + "is the SMALLEST");
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < rando.length; i++) {
			System.out.println(rando[i]);
		}
		//10. print the largest number in the array.
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < rando.length; i++) {
			if (rando[i] > largest) {
				largest = rando[i];
			}
			System.out.println(largest + "is the LARGEST");
	}
}
}
