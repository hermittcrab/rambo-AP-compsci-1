
package pkg;

public class fight{
	String poke;
	int hp1;
	int attack1;
	int defense1;
	int speed1;
	


public fight(String a, int b, int c, int d, int e){
	poke = a;
	hp1 = b;
	attack1 = c;
	defense1 = d;
	speed1 = e;
}

	public String getPoke(){					
		return poke;
	}

	public int getHp(){					
		return hp1;
	}

	public int getAttack(){					
		return attack1;
	}

	public int getDefense(){					
		return defense1;
	}
	public int getSpeed(){					
		return speed1;
	}


	
	public void takeDamage(int damage) {
        hp1 -= damage;
        if (hp1 < 0) {
            hp1 = 0; 
        }
        
        
         attack1 -= (int)(damage * 0.1); //js make all percentage 10? idk
        if (attack1 < 0) {
            attack1 = 0; 
        }
        
        
         defense1 -= (int)(damage * 0.1);
        if (defense1 < 0) {
            defense1 = 0; 
        }
        
        
         speed1 -= (int)(damage * 0.05); 
        if (speed1 < 0) {
            speed1 = 0; 
        }

        
    }
    
    


public void StatToString(){
	System.out.println(" ");
	System.out.println("\t ********************************");
			System.out.println("\t"+poke);
			System.out.println("\t \t HP: " + hp1);
			System.out.println("\t \t Attack: " + attack1);
			System.out.println("\t \t Defense: " + defense1);
			System.out.println("\t \t Speed: " + speed1);
			System.out.println("\t ********************************");
	
	}
}
