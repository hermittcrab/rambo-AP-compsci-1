/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("DIGITAL ALARM CLOCK");
	System.out.println("*********************************");
	System.out.println("What day is it?");
	int num = sc.nextInt();
	
	if(num == 0){
		System.out.print("Happy sunday! Wake up at 10:00 am");
	}
	else if(num == 1){
		System.out.print("Happy monday! Wake up at 7:00 am");

	}
	else if (num == 2){
		System.out.print("Happy tuesday! Wake up at 7:00 am");

	}
	else if(num == 3){
		System.out.print("Happy wednesday! Wake up at 7:00 am");

	}
	else if(num == 4){
		System.out.print("Happy thursday! Wake up at 7:00 am");

	}
	else if(num == 5){
		System.out.print("Happy friday! Wake up at 7:00 am");
		
	}
	else if (num == 6){
		System.out.print("Happy saturday! Wake up at 10:00 am");
	}
	else {
		System.out.print("You did not input the correct value");
	}
	
	}
}
