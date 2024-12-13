/*
	Author:
	Date:
*/
import java.util.Scanner;
import java.io.*;

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a word: ");
		
		String word = sc.nextLine();
		
		int num = 0;
		int x = 1;
		int i = 0;
		while(num<word.length()){
		
		if(num % 2 ==0){
			
		String up = word.substring(i, i+1);
		
		System.out.print(up.toUpperCase());
		num++;
		i = i+2;
		
	}
		else{
			
			String down = word.substring(x, x+1);
			System.out.print(down.toLowerCase());
			num++;
			x = x +2;
		}

}

	}
}
