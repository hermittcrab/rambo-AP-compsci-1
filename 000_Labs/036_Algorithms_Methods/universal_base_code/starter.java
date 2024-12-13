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
	int [] arr = new int[100];
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	int x = 0;
	//creates random values for array
	while(x < 100){
		arr[x] = (int)(Math.random() * 100);
		

		x++;
	}

	//finds min
	for(int i = 0; i < 100; i++){
		if(arr[i] < min){
			min = arr[i];
		}
		
	}
	System.out.println("The min is: " + min);

	//find max	
	for(int e = 0; e < 100; e++){
		if(arr[e] > max){
			max = arr[e];
		}
	}
	System.out.println("The max is: " + max);

	//find average
	int avg;
	int sum = 0;
	int o = 0;
		while(o < 100){
			sum = sum + arr[o];
			o++;
		}
	avg = sum/100;
	System.out.println("The avg is: " + avg);

	toStringArray(arr);
	
		
	}
	
	
	public static void toStringArray(int [] e){
		for(int i = 0; i < 100; i++){
			System.out.println("Index: " + i + " Value: " + e[i]);
		}
	}
	

}
