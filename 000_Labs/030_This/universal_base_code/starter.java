/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static int ages(){
		int randage = (int)(Math.random() * 7);
		return randage;
	}
	public static void main(String args[]) {
		// Your code goes below here
	PooleDwarf test = new PooleDwarf(randName(), ages());
		test.pee();
		if(isSameName()){
			System.out.println("pee");
		}
			
	
	
		PooleDwarf test1 = new PooleDwarf(randName(), ages());
		test1.pee();

		PooleDwarf test2 = new PooleDwarf(randName(), ages());
		test2.pee();

		PooleDwarf test3 = new PooleDwarf(randName(), ages());
		test3.pee();

		PooleDwarf test4 = new PooleDwarf(randName(), ages());
		test4.pee();

		PooleDwarf test5 = new PooleDwarf(randName(), ages());
		test5.pee();

		PooleDwarf test6 = new PooleDwarf(randName(), ages());
		test6.pee();

		
		
	}
	
	
	}

