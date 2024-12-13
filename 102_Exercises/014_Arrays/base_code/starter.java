/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	fight rookidee = new fight("ROOKIDEE", 38, 47, 35, 57);
		rookidee.StatToString()	
	
}
}

	
		
public class fight{
	String poke;
	int hp1;
	int attack1;
	int defense1;
	int speed1;
	


class fight(String a, int b, int c, int d, int e){
	poke = "unknown";
	hp1 = 0;
	attack1 = 0;
	defense1 = 0;
	speed1 = 0;
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



