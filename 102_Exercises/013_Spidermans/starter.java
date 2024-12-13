/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Spiderman love = new Spiderman("Bob");
	love.setAge(32);
	love.setVillain("Joe");
	love.setActor("rambo");
/*	
	Spiderman two = new Spiderman("Tobey Mxguire", 49, "Green goblin");
	
	Spiderman three = new Spiderman("Andrew Garfield", 41);
	three.setVillain("Electro");
	*/
	System.out.println("The villain is" + love);
	
	
	Spiderman banana = new Spiderman(5);
	System.out.print(banana);
	
		
	}
}
