/*
 *	Author:  
 *  Date: 
*/

import pkg.flavors;
import pkg.emoji;

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

    String emoji1;
    String emoji2;
    String emoji3;
	

	   	Scanner sc = new Scanner(System.in);
       
		System.out.println("Welcome to Ice Bears Bakery!");
		System.out.println("On today's menu, Ice bear is making cupcakes 🧁! And u have a chance to customize ur very own cupcake!");
// ice bear ascii art

        System.out.println("What cupcake bread flavor would u like? You have three options:");
            System.out.println("A: Strawberry 🍓\nB: Chocolate 🍫 \nC: Vanilla 🍦");

		String bread = sc.nextLine();
	
		if(bread.equals("A") || bread.equals("a")){
		    flavors q = new flavors();
            q.StrawberryToString();
		    System.out.println("You chose 🍓Strawberry🍓 flavored bread!");
		    System.out.println("Nice choice!");
		  emoji1 = "🍓";
        

		}
		
		else if(bread.equals("B") || bread.equals("b")){
		    flavors w = new flavors();
		    w.ChocolateToString();
		    
		    System.out.println("You chose 🍫Chocolate🍫 flavored bread!");
		    System.out.println("Nice choice!");
		    emoji1 = "🍫";

		}

        else{
            flavors e = new flavors();
		    e.VanillaToString();
            System.out.println("You chose 🍦Vanilla🍦 flavored bread!");
		    System.out.println("Nice choice!");
		    emoji1 = "🍦";
        }
    
        System.out.println("");
        System.out.println("******************************");
        System.out.println("");
    //icing
      
        System.out.println("Next, choose an icing flavor: ");
            System.out.println("1: Pistachio 🧆\n2: Coffee ☕\n3: Mango 🥭");
            
   		int icing = sc.nextInt();
     
     	if(icing == 1){
     	    flavors pis = new flavors();
     	    pis.PistachioToString();
		    System.out.println("You chose 🧆Pistachio🧆 icing! ");
		    System.out.println("Love it!");
		   emoji2 = "🧆";
		}
		
		else if(icing == 2){
		    flavors cof = new flavors();
		    cof.CoffeeToString();
		  System.out.println("You chose ☕Coffee☕ icing! ");
		    System.out.println("Love it!");
		    emoji2 = "☕";
		    
		}

        else{
            flavors mang = new flavors();
            mang.MangoToString();
            System.out.println("You chose 🥭Mango🥭 icing!");
		    System.out.println("Love it!");
		   emoji2 = "🥭";
        }
    
     System.out.println("");
        System.out.println("******************************");
        System.out.println("");
       //toppings 
		System.out.println("Lastly, choose your topping!");
	         System.out.println("4: Sprinkles 🌈\n5: Kiwi 🥝\n6:Cookies 🍪 ");
	
		int topping = sc.nextInt();
		
     	if(topping == 4){
     	    flavors sprinkle = new flavors();
            sprinkle.SprinkleToString();
		    System.out.println("You chose 🌈Sprinkles🌈 for ur topping! ");
		    System.out.println("Yum!");
		    emoji3 = "🌈";
		    
		}
		
		else if(topping == 5){
		    flavors kiwi = new flavors();
            kiwi.KiwiToString();
		  System.out.println("You chose 🥝kiwi🥝 for ur topping! ");
		    System.out.println("Yum!");
		   emoji3 = "🥝";
		}

        else{
            flavors cookie = new flavors();
            cookie.CookieToString();
            System.out.println("You chose 🍪Cookies🍪 for ur topping!");
		    System.out.println("Yum");
		    emoji3 = "🍪";
		    
        }
        
        
        System.out.println("");
        System.out.println("******************************");
        System.out.println("");
        
        System.out.println("Awesome order!");
        System.out.println("That'll be $52.00 :>");
        System.out.println(". ");
        System.out.println(". ");
        System.out.println(". ");
        System.out.println(". ");
        System.out.println("You are going to pay the $52.00 right? Ice bear worked hard on it...");
        System.out.println("Yes or No?: ");
       
       	Scanner ex = new Scanner(System.in);
        String yn = ex.nextLine();
        
        if(yn.equals("yes") || yn.equals("Yes")||yn.equals("y")){
            System.out.println("Yay! ice bear is very pleased");
            System.out.println("Here's ur cupcake!! ");
             
              emoji poop = new emoji(emoji1, emoji2, emoji3);
              poop.CupcakeToString();
            
            System.out.println("Enjoy! And thank you for shopping at Ice Bears Bakery!! :DDDD");
        }
	
	
        //print poor homeless hobo patrick
        else if(yn.equals("no")||yn.equals("No")||yn.equals("n")){
        
        System.out.println(" ");

        System.out.println("...");
        System.out.println("//this is the meme of patrick saying *i  have three dollars* btw");
         flavors k = new flavors();
		k.PatrickToString();
		System.out.println("HOBO!!! BOOOOO");
		System.out.println("*throws tomatos at u");
		System.out.println("🍅🍅🍅🍅");
 
        }
       
       
        
        
       
    
  
	
	}
}
