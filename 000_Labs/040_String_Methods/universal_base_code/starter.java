/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a full name:");
		String word = sc.nextLine();
		
		int space = word.indexOf(" ");
		System.out.println(word.substring(space, word.length()));

		
	}
}
