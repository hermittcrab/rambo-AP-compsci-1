/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a phrase:");
		
		String phrase = sc.nextLine();
			int space = phrase.indexOf(" ");
	
	while (phrase.length() > 0){
	
		String word = phrase.substring(0, space);
		
		space
		phrase = phrase - phrase.substring(0,space);
		

		
	//	String wordCheck = phrase.substring(i, space);		
	
	//	if(phrase.indexOf("a") == 0 || phrase.indexOf("e") == 0 || phrase.indexOf("i") == 0 || phrase.indexOf("o") == 0 ||phrase.indexOf("u") == 0){
	//		phrase = phrase + "way";
			
	//	}
		
	/*	else if(	){
			
		}
		
		else{
			
		}
			
			
		System.out.println(phrase);
		}

	*/	
	
		
		
		
	}
}
}
