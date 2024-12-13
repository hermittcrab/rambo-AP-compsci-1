/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input an integer: ");
	int num1 = sc.nextInt();

	System.out.print("Input another integer: ");
	int num2 = sc.nextInt();
	
	if(num1%2 == 0){
	System.out.println("Num1 is an even integer");
	}
	else{
		System.out.println("Num1 is an odd integer");
	}
	
	if(num2%2 == 0){
	System.out.println("Num2 is an even integer");
	}
else{
		System.out.println("Num2 is an odd integer");
	}
	
	if((num1%3 == 0) && (num1%4 == 0) && (num1%5 == 0)){
		System.out.println("Num1 is divisible by 3,4, and 5");
	}
	else{
		System.out.println("Num1 is NOT divisible by 3,4, and 5");
	}
	
	if((num2%3 == 0) && (num2%4 == 0) && (num2%5 == 0)){
		System.out.println("Num2 is divisible by 3,4, and 5");
	}
	else{
		System.out.println("Num2 is NOT divisible by 3,4, and 5");
	}
	
	
	}
}

