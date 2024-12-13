/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int [] arr = new int[20];
	int x = 0;

//random values for array
	while(x < 20){
		arr[x] = (int)(Math.random() * 10);
		System.out.println("Index: " + x + " Value: " + arr[x]);
		x++;
	}
	System.out.println("---------------------------");

//duplicate
	int duplicate = (int)(Math.random()* 10);
	int a = 0;
	int y = 0;
	while(y < 20){
		if(arr[y] == duplicate){
			System.out.println("Index " + y + " is a duplicate");
			a++;
			System.out.println("-----------------");

		}
	//consecutive numbers	
		if(arr[y] == arr[y + 1]){
			System.out.println("Index: " + y + " is the same as Index: " + (y+1));
			System.out.println("The consecutive number was " + arr[y]);
			System.out.println("-----------------");
		}
		y++;
	}
	
	
	}
}
