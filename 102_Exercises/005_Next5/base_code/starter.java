/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
    Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number:");
	int num = sc.nextInt();

	int num1 = num + 1;
	int num2 = num1 + 1;
	int num3 = num2 + 1;
	int num4 = num3 + 1;
	int num5 = num3 + 1;
	
	System.out.println("Here are the next five numbers!");

	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(num5);
	
	System.out.println("***********************");
	
	int numA = num + num;
	int numB = numA + num;
	int numC = numB + num;
	int numD = numC + num;
	int numE = numD + num;
	
	System.out.println("Here are the next five multiples of " + num);
	
	System.out.println(numA);
	System.out.println(numB);
	System.out.println(numC);
	System.out.println(numD);
	System.out.println(numE);
	
	System.out.println("***********************");

	System.out.println("Here is " + num + " divided by 100");

	System.out.println(num/100.0);
	
	System.out.println("***********************");

	System.out.println("Here is " + num + " divided by 10");

	System.out.println(num/10.0);
	

	}
}
