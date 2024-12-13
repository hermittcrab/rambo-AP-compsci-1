/*
 *	Author:  
 *  Date: 
*/

//class starter {
//	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	//	System.out.print("I love to learn coding remotely."); 
	

/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

		
public class fight{
	String poke;
	int hp1;
	int attack1;
	int defense1;
	int speed1;
	


public fight(){
	poke = "unknown";
	hp1 = 0;
	attack1 = 0;
	defense1 = 0;
	speed1 = 0;
}

public fight(String poke, int hp1, int attack1, int defense1, int speed1){
	this.poke = poke;
	this.hp1 = hp1;
	this.attack1 = attack1;
	this.defense1 = defense1;
	this.speed1 = speed1;
}

	public String getPoke(){						// Returns the ID of the Employee
		return poke;
	}

	public int getHp(){						// Returns the ID of the Employee
		return hp1;
	}

	public int getAttack(){						// Returns the ID of the Employee
		return attack1;
	}

	public int getDefense(){						// Returns the ID of the Employee
		return defense1;
	}
	public int getSpeed(){						// Returns the ID of the Employee
		return speed1;
	}


public void StatToString(){
	System.out.println("\t *********************************************");
			System.out.println(poke);
			System.out.println("\t \t HP: " + hp1);
			System.out.println("\t \t Attack: " + attack1);
			System.out.println("\t \t Defense: " + defense1);
			System.out.println("\t \t Speed: " + speed1);
			System.out.println("\t *********************************************");
	
	}
}

class starter {
	public static void main(String args[]) {
	
	fight rookidee = new fight("ROOKIDEE", 38, 47, 35, 57);
		rookidee.StatToString();
	}
}




