/*
 *	Author:  
 *  Date: 
*/
import pkg.fight;
import java.util.Scanner;
import java.util.Random;
//Goals: 
//health bar
//choose stats potion
//nickname pokemon
//randomise pokemon fights
//beating a pokemon levels up your pokemon and gives you cash
//hot key s takes user to shop and can heal pokemon 
//10% chance to get crit hit which multiplies damage from attack by 3
/*System.out.println("*************************************");
		
		System.out.println(" _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____ ");
		System.out.println("|     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     |");
		System.out.println("|_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____|");
		
		System.out.println(" ____   ___   __  _    ___  ___ ___   ___   ____       ____   __ __  _____  _       ___     __  __  _    ___      ____    ___    ___   ______  _        ___   ____");
		System.out.println("|   \\ /   \\|  |/ ]  /  _]|   |   | /  \\ |    \\    |   \\ |  |  ||     || |     /  \\   /  ]|  |/ ]  /  _]    |    \\ /  \\  /  \\ |      || |      /  _] /    | ");
		System.out.println("|  o  )     ||  ' /  /  [_ | _   _ ||     ||  _  |    |  _  ||  |  ||__/  || |    |     | /  / |  ' /  /  [_     |  o  )|     ||     ||      || |     /  [_ |   __| ");
		System.out.println("|   _/|  O  ||   \\ |    _]| \\_/  ||  O  ||  |  |    |  |  ||  |  ||   __|| |___ |  O  |/  /  |   \\ |    _]    |     ||  O  ||  O  ||_|  |_|| |___ |    _]|  |  | ");
		System.out.println("|  |  |     ||    \\|   [_ |   |   ||     ||  |  |    |  |  ||  :  ||  /  ||     ||     /  \\_ |    \\|   [_     |  O  ||     ||     |  |  |  |     ||   [_ |  |_ | ");
		System.out.println("|  |  |     ||  .  ||     ||   |   ||     ||  |  |    |  |  ||     ||     ||     ||    \\     ||  .  ||     |    |     ||     ||     |  |  |  |     ||     ||     | ");
		System.out.println("|__| \\___/ |__|\\_||_____||___|___|\\___/ |__|__|    |__|__|\\__,_||_____||_____|\\___/\\____||__|\\_||_____|   |_____| \\___/\\___/   |__|  |_____||_____||___,_| ");
	
		System.out.println(" _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____  _____ ");
		System.out.println("|     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     ||     |");
		System.out.println("|_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____||_____|");
	*/	
		



class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int hp = 0;
		int attack = 0;
		int defense = 0;
		int speed = 0;
		
		System.out.println("The Purpose of this game is to beat as many gym leaders as possible and have fun!");
		System.out.println("     █▓█    ███  ");
		//include rules and hot keys
		System.out.println("For your starter pokemon, you have three wonderful choices!");
		System.out.println("You can choose...");
		
		System.out.println("A: Grookey - a grass type pokemon that appears to be based on a spider moneky!");
		System.out.println("B: Scorbunny - a fire type pokemon that looks similarly to a candycorn flavored bunbun!");
		System.out.println("C: Sobble - a water type pokemon that looks like a cute blue lizard");
		
		String starter = sc.nextLine();
		
		if(starter.equals("A") || starter.equals("a")){
			starter = "Grookey";
			System.out.println("You chose " + starter + " as your starter pokemon!");
		}
		else if(starter.equals("B") || starter.equals("b")){
			starter = "Scorbunny";
			
			System.out.println("You chose " + starter + " as your starter pokemon!");
		}
		else{
			starter = "Sobble";
			hp = 50;
			attack = 40;
			defense = 40;
			speed = 70;
			System.out.println("You chose " + starter + " as your starter pokemon!");
			System.out.println(" ");
			
			System.out.println("Sobble's starter attacks & stats include: ");
			System.out.println("\t *********************************************");
			System.out.println("\t Pound (Normal-type): A basic physical attack");
			System.out.println("\t Growl (Normal-type): Lowers the target's Attack stat");
			System.out.println("\t \t HP: 50");
			System.out.println("\t \t Attack: 40");
			System.out.println("\t \t Defense: 40");
			System.out.println("\t \t Speed: 70");
			System.out.println("\t *********************************************");
			//a
		}

System.out.println("What would u like to nickname your " + starter + " ?: ");
		String nickname = sc.nextLine();
		
		System.out.println("Awesome! Now you and " + nickname + " can work together to beat as many gym trainers as possible!");
		System.out.println("But first, you need to increase your team");
		System.out.println("You startto wander into a forest, ready to fight any pokemon u encounter");
		
		System.out.println("You walk down a path and come across a three way road.");
		System.out.println("Do you choose to go left, forward, or right?: ");

		String path = sc.nextLine(); 
		System.out.println("You chose to go " + path);
		String poke1;
		
		
		if(path.equals("left")||path.equals("Left")){
			
			System.out.println("As you walk down this path, you hear a sound coming from a bush");
			System.out.println("A Rookidee (flying type) jumps out and challenges you to a fight!");
			poke1 = "Rookidee";
			//a
		}
		else if(path.equals("right")||path.equals("Right")){
			System.out.println("As you walk down this path, you hear a sound coming from a bush");
			System.out.println("A Yamper (electric-type) jumps out and challenges you to a fight!");
			poke1 = "Yamper";
			//a
		}
		else{
			System.out.println("As you walk down this path, you hear a sound coming from a bush");
			System.out.println("A Rookidee (flying type) jumps out and challenges you to a fight!");
			poke1 = "Rookidee";
			//a
		}
	
	int moves;
	
	
	if(poke1.equals("Rookidee")){
		int a = 38;
		int b = 47;
		int c = 35;
		int d = 57;
		fight rookidee = new fight("ROOKIDEE", a, b, c, d);
		rookidee.StatToString();
		
	}	
	else{
		int a = 59;
		int b = 45;
		int c = 50;
		int d = 26;
		fight yamper = new fight("YAMPER", a, b, c, d);
		yamper.StatToString();
		}
		
	System.out.println("");	
	System.out.println("-------------------------");
		
	System.out.println("Choose attack: ");
		System.out.println("\t A: Pound (Normal-type): A basic physical attack - 40 dmg");
		System.out.println("\t B: Growl (Normal-type): Lowers the target's Attack stat - 10% lower");
	
	String w = sc.nextLine();
	int damage;
	
	
while (hp > 0 && (rookidee.getHp() > 0 || yamper.getHp() > 0)) {
	if(w.equals("A") || w.equals("a")){
		System.out.println(nickname +  " Pound attacks " + poke1);
		damage = 35 + (int)(Math.random() * 40);
		rookidee.takeDamage(damage);
	
		System.out.println(poke1 + " took " + damage + " damage!");
		
		if(rookidee.getHp()==0){
			System.out.println("Rookidee fainted!");
		}
	}
	
	else if (w.equals("B") || w.equals("b")){
		System.out.println(nickname +  " Growls at " + poke1);
	
		damage = 35 + (int)(Math.random() * 40);
		rookidee.takeDamage(damage);
	
		System.out.println(poke1 +  " took " + damage + " damage!");
		
		if(rookidee.getHP()==0){
			System.out.println("Rookidee fainted!");
		}
	}
	

	}

}
}