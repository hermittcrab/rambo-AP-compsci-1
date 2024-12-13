/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class character {
	Scanner sc = new Scanner(System.in);
	
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	String role;
	
	public character(){
		srength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
		
		role = "choose role";
		
		
	}
	
	public String setRole(String role){
		
		System.out.println("---------------------");
		System.out.println("Your role is: " + role);
		System.out.println("Your strength is: " + strength);
		System.out.println("Your dexterity is: " + dexterity);
		System.out.println("Your intelligence is: " + intelligence);
		System.out.println("Your charisma is: " + charisma);
		System.out.println("---------------------");
	}
	
	public void fill(){
		System.out.println("Choose your role: Wizard, Rouge, or Warrior");
		System.out.println("")
	}
	
	


	
}
