/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter message");
	String message = sc.nextLine();
	
	System.out.println("Enter a key");
	int key = sc.nextInt();
	
	System.out.println(Cipher.encode(message));
	System.out.println(Cipher.keyedEncode(message,key));

}
}

















	/*	System.out.println("------");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println();
		
		if(isLeapYear(year)){
			
		System.out.println(year + "is a leap year!");
			
		}
		else {
			System.out.println(year + "is not a leap year!");
			
		}
		
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		

	}
}
*/
