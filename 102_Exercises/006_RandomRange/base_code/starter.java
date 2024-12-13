/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER 2 NUMBERS TO CREATE RANGE FOR A RANDOM INTEGER TO BE GENERATED");
	System.out.print("Enter integer: ");
	int num1 = sc.nextInt();
	System.out.print("Enter anoteher integer bigger than the first: ");
	int num2 = sc.nextInt();
	System.out.println(" ");
	System.out.println("Your range is " + num1 + " to " + num2);
	System.out.println("Here are five numbers generated in that range:");
	
	int num3 = num2 - num1; 
	int a = ((int)(Math.random()*num3) + num1);
	int b = ((int)(Math.random()*num3) + num1);
	int c = ((int)(Math.random()*num3) + num1);
	int d = ((int)(Math.random()*num3) + num1);
	int e = ((int)(Math.random()*num3) + num1);

	System.out.println(a+ ", " + b +", " + c +", " + d +", " + e);



	 
	}
}
