package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {

	String name;
	int age;
	String breed;
	
	public Dog() {
	name = new String("Clifford");
	age = 3;
	breed = new String("big red dog");
		
	}
	
	public Dog(String a){
	name = a;
	age = 1;
	breed = new String("dog dog");
	
	}
	public Dog(String a, String c){
	name = a;
	age = 1;
	breed = c;
	}
	
	public Dog(String a, int b){
	name = a;
	age = b;
	breed = new String("dog dog");
	}
	
	public void setName(String a){
	name = a;
	}
	
	public void setAge(int b){
	age = b;
	}
	
	public void setBreed(String c){
	breed = c;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public void String setAge(){
		Dog y = new Dog(int b)
	}
	
	public boolean isSleeping(){
		int num1 = (int)(Math.random() * 10);
		if (num1 < 5){
			return(true);
		}
		else{
			isSleeping(false);
		}
	}
	
	public void bark(){
		System.out.println(name);
		System.out.println("this dog barks");
	}

}
