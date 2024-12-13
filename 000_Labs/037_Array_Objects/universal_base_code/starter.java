/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

int [] arr = new int[100];
	for(int i = 0; i < arr.length - 1; i++)	{
//	Warrior [] meaty = new Warrior[100];
//	Wizard [] magic = new Wizard[100];
	meaty[x] = new Warrior();
	magic[y] = new Wizard();
	
	}
	
	int x = 0;
	int y = 0;
	
while((meaty[y].isDead() == false) && (magic[x].isDead()==false)){
	if(x<meaty.length){
		magic[x].attack(meaty[y]);
	}
	else{
		meaty[y].attack(magic[x]);
	}
	if(magic[x].isDead()){
		x++;
	}
}

if(x<magic.length){
	System.out.println("wizards win!");
}
else{
	System.out.println("warriors win!");
}
}
}

	
	



	/*	magic[y] = new Wizard();
		
		magic[y].attack(meaty[0]);
		meaty[x].attack(magic[0]);
		
		if(magic[y].isDead()){
			y++;
		}
		if(meaty[x].isDead()){
			x++;
		}
	}
		
	//	Warrior x = new Warrior();
	//	Wizard y = new Wizard();
	//x.attack(y);
	//y.attack(x);
		

	//	if(getHealth(meaty) == 0){
		//	System.out.print("poo");
		}
	
	


*/

