/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("You're walking down the street when you encounter a dog wearing a melon on its head. It is a melon hat.");
    System.out.println("What would you do when u see this melon hat dog");
    System.out.println("Option 1: Approach the dog and compliment its stylish melon hat");
    System.out.println("Option 2: Take a picture of the dog and compliment its melon hat");
    System.out.println("Option 3: Take the melon off its head");
    
    int option = sc.nextInt();
    
    if(option ==1){
        
        System.out.println("You walk up to the dog and compliment its hat");
        System.out.println("It levitates and ask you if you would also like a fruit hat");
        System.out.println("Option 1: You say no and walk away");
        System.out.println("Option 2: You say yes");
        System.out.println("Option 3: you get scared and run away");
        
        int op1 = sc.nextInt();
            if (op1 == 1){
                System.out.print("You deny the melon dogs offer and get blown up");
            }
            else if (op1 == 2){
                System.out.println("Melon dog places a pineapple hat on your hat. It is very stylish and you guys become a famous fruit hat duo.");
            }
            else if (op1 == 3){
                System.out.println("He obliterates you with its mind");
            }
            
            
    else if(option == 2){

        System.out.println("You take a picture of the melon dog");
        System.out.println("You did not ask for its consent and he will kill you");
        System.out.println("Option 1: Say pls pls dont kill me ");
        System.out.println("Option 2: Try to run away");
        System.out.println("Option 3: Give him a orange");    
    }
    else if(option ==3){
        System.out.print
    }
    else(){
        
    }
	}
}