/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

	int guess;
	int num = (int)(Math.random() * 1000);
	
	System.out.println("Guess a number");
	guess = sc.nextInt();

	
	while (guess != num){
		System.out.println("Wrong number! try again: ");
		guess = sc.nextInt();
		if(num == guess){
			System.out.println("You guessed right!");
			break;
		}

	}




		
	}
}
