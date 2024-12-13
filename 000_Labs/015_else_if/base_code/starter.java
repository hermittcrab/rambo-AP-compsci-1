/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int answer = 456;
	System.out.println("This is the number guessing game"); 
	System.out.println("Guess a number between 1 - 1000: ");
	int guess = sc.nextInt();
	
	if (guess == answer){
		System.out.print("You guessed the correct number!");
	}
	else if(guess > answer){
		System.out.println("Too high, guess lower");
	}
	else if(guess < answer){
		System.out.println("Too low, guess higher");

	}
	else{
		System.out.print("X Wrong answer! Try again if u want");
	}
	
	}
}
