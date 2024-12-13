/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

public class Character{
	String role;
	int Strength;
	int Dexterity;
	int Intelligence;
	
}

public Character(){
	role = "Wizard";
	Strength = 50;
	Dexterity = 20;
	Intelligence = 100;
}

public void CharacterToString(){
	System.out.println("------------------------------");
	System.out.println("Character role : " + role);
	System.out.println("Strength: " + Strength);
	System.out.println("Dexterity: " + Dexterity);
	System.out.println("Intelligence: " + Intelligence);
	System.out.println("------------------------------");



}

public class starter {
	public static void main(String args[]) {

Character myCharacter = new Character();
myCharacter.CharacterToString();

		
	}
}

