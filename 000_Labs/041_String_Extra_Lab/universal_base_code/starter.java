/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a phrase:");
		
		String phrase = sc.nextLine();
		
		
		String space = "";
		
		for(int i = 0; i < phrase.length(); i ++){
			int space1 = phrase.indexOf(" ");
			String word = phrase.substring(0, space1);
			
			phrase = phrase.substring(space1 + 1);
			
			space = " " + word + space;
			
			if(phrase.indexOf(" ") == -1){
				space = phrase + space;
				break;
			}
		}
		System.out.println(phrase);
		
	
      
		}
	


		
	}

