/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		
		System.out.println("Welcome to the slot machines!"); 
		System.out.println("You have $100 to spend, would you like to play?");
			String choice = sc.nextLine();
			
		while((choice.equals("yes")||choice.equals("Yes")||choice.equals("y")||choice.equals("Y"))&& money > 0){
			
		System.out.println("How much money do you want to spend?");
		int spend = sc.nextInt();
		sc.nextLine();
	if(spend <= money && spend > 0){
			
			int num1 = (int)(Math.random() * 11);
			int num2 = (int)(Math.random() * 11);
			int num3 = (int)(Math.random() * 11);
			
			System.out.println("*******************");
			System.out.println(num1 + " | " + num2 + " | " + num3);
			System.out.println("*******************");
			
		if (num1 == num2 || num2 == num3 || num1 == num3){
			spend = spend * 2;
			money = money + spend;
			System.out.println("You got 2 matches: You doubled your money and now have: $" + money);
			System.out.println("Would u like to play again?");
			choice = sc.nextLine();

		}
		else if (num1 == num2 && num2 ==num3){
			spend = spend * 3;
			money = money + spend;
			System.out.println("You got three matches: You tripled your money and now have: $" + money);
			System.out.println("Would u like to play again?");
			choice = sc.nextLine();
		}
		
		else{
			money = money - spend;
			if (money < 1){
				System.out.println("Yikes! You got no matches. You now have: $" + money);
				System.out.println("You ran out of money! Come back again if u would like to lose more! Goodbye");
				break;
			}
			System.out.println("Yikes! You got no matches. You now have: $" + money);
			System.out.println("Would u like to play again?");
			choice = sc.nextLine();

		}

}
else{
	System.out.println("you don't have enough money to spend! try again");
}
		}
		if (choice.equals("No")||choice.equals("no")||choice.equals("N")|| choice.equals("n")){
			System.out.println("Good choice. Gambling is bad. ");
			System.out.println("You left with $" + money);
			System.out.println("Goodbye");
		}
	}
	
}
