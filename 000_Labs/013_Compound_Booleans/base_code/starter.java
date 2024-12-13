/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num1 = sc.nextInt();
    
    System.out.println("enter another number");
    int num2 = sc.nextInt();
    
    System.out.println("enter another number");
    int num3 = sc.nextInt();
    
    if((num1 > num2) && (num1 >num3))
    {
    	System.out.println(num1 + " is the greatest number");
    }
    else if((num2 > num1) && (num2 > num3)){
        System.out.println(num2 + " is the greatest number");
	}
	else if((num3 > num1) && (num3 > num2)){
        System.out.println(num3 + " is the smallest number");
}

 if((num1 < num2) && (num1 < num3))
    {
    	System.out.println(num1 + " is the smallest number");
    }
    else if((num2 < num1) && (num2 < num3)){
        System.out.println(num2 + " is the smalles number");
	}
	else if((num3 < num1) && (num3 < num2)){
        System.out.println(num3 + " is the smallest number");
}
}
}
