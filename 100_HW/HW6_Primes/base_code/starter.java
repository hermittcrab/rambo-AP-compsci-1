/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int x){
	int z = x-1;
	while(x>0){
if(x % (z) != 0){
	System.out.println((x) + " % " + (z) +" != 0");
z--;
}
else{
		if(z == 1){
			System.out.print(x + " is a prime number");
			
		}
		else{
			System.out.print(x + " is not a prime number");
		}

	x = 0;
}
	


}
		return(false);

	}
	
	
	
	
	public static void main(String args[]) {

checkPrime(10);


		
	}
}






	


