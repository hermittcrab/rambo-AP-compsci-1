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
	
	System.out.println("What is ur character title?: ");
	String title = sc.nextLine();
	
	System.out.println("Would u like to be a wizard, warrior, or rouge?: "); 
	String choice = sc.nextLine();
	
	int choicewrong = 3;
	
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
		choicewrong = 0;
		System.out.println("U did not input a correct choice! Try again");
		System.out.println("");
		
	}
if(choicewrong == 3){
	System.out.println("As a " + choice + " you can choose between these traits");
	System.out.println("Choose wisely as you only have 20 points to spend");
	int points = 20;
	
	System.out.println("****************************************");
	System.out.println(" A ○ Strength - Buff and able to carry larger items: 15 points");
	System.out.println(" B ○ Dexterity - Agile and moves quick: 5 points");
	System.out.println(" C ○ Intelligence - Better at magic spells!: 10 points");
	System.out.println(" D ○ Charisma - How personable: 5 points");
	System.out.println("****************************************");
	
	int a = 15;
	int b = 5;
	int c = 10;
	int d = 5;
	
	int stat1 = 0;
	int stat2 = 0;
	int stat3 = 0;
	int stat4 = 0;
	System.out.println("Would you like to buy a trait?: ");
	System.out.println("Yes or No: ");
	String maybe = sc.nextLine();
	
 while(maybe.equals("Yes") && points>0){

	System.out.print("Buy: ");
	String buy = sc.nextLine();
	
	if(buy.equals("A") && points>=15){
	System.out.println("****************************************");
		points = points - a;
		System.out.println("You bought trait " + buy + " which leaves you at " + points + " points");
		stat1 = stat1 + 1;
	System.out.println("****************************************");

	}
	else if(buy.equals("B")&& points>=5){
	System.out.println("****************************************");
		points = points - b;
		stat2 = stat2 + 1;
		System.out.println("You bought trait " + buy + " which leaves you at " + points + " points");
	System.out.println("****************************************");

	}
	else if(buy.equals("C") && points>=10){
	System.out.println("****************************************");
		points = points - c;
		stat3 = stat3 + 1;
		System.out.println("You bought trait " + buy + " which leaves you at " + points + " points");
	System.out.println("****************************************");

	}
	else if(buy.equals("D") && points>=5){
	System.out.println("****************************************");
		points = points - d;
		stat4 = stat4 + 1;
		System.out.println("You bought trait " + buy + " which leaves you at " + points + " points");
	System.out.println("****************************************");

	}
	else{
		System.out.println("You do not have enough credits for that trait. Try a different one");
	
	}
	
}
	System.out.println(" ");
	System.out.println("You have used up all of your points!");
	System.out.println("Here are your stats...");
	System.out.print(name + " the " + title + " is a powerful " + choice + " with the following traits: ");
	if(stat1 == 1){
		System.out.print("Strength ");
	}
	if(stat2 == 1){
		System.out.print("Dexterity ");
	}
		if(stat3 == 1){
		System.out.print("Intelligence ");
	}
		if(stat4 == 1){
		System.out.print("Charisma ");
	}
	}
	
	 
}
 }
	
	




	

