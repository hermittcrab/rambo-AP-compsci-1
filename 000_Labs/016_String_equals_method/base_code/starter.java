/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Would u like to be a wizard, warrior, or rouge?: "); 
	String choice = sc.nextLine();
	
	if((choice.equals("wizard")) || (choice.equals("Wizard"))){
			
		System.out.println("u chose to be a wizard!");
	} 
	else if((choice.equals("warrior")) || (choice.equals("Warrior"))){
			
		System.out.println("u chose to be a warrior!");
	} 
	else if((choice.equals("rouge")) || (choice.equals("Rouge"))){
			
		System.out.println("u chose to be a rouge!");
	} 
	else {
		System.out.print("U did not input a correct choice! Try again");
	}

	}
}
