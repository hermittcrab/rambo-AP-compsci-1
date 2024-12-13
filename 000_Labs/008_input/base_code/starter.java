/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

		System.out.println("What's your name?"); 
		String name = sc.nextLine();
			System.out.println("Your name is " + name);

		
		System.out.println("How old are you?");
		int age = sc.nextInt();
			System.out.println("Your are " + age + " years old");

		
		System.out.println("What month were you born?");
		String month = sc.nextLine();
			System.out.println("You were born in " + month);

		
		System.out.println("What day were you born?");
		String day = sc.nextLine();
			System.out.println("Your were born on a " + day);

		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
			System.out.println("You were born in " + year);

		
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();
			System.out.println("A buck fifty is " + money);

		

		

	}
}
