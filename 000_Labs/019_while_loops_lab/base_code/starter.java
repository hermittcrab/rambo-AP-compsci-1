/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is ur name?: ");
	String name = sc.nextLine();
	
	System.out.println("How many times do u want this name to be printed?");
	int num = sc.nextInt();
	
	int x = 1;
		while(true){
		
		System.out.println(name);
		
		if (x == num){
			break;
		}
		x++;
	}
	


		
	}
}
