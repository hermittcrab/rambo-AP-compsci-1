/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("PLEASE ENTER UR NAME PLEAASE");
    String name = sc.nextLine();
    System.out.println("Hello "+name);

    System.out.println("write a number");
    int num = sc.nextInt();
    sc.nextLine();
   
    System.out.print("write second num");
    int num2 = sc.nextInt();
    sc.nextLine();
   
   System.out.print("the sum of these numbers is ");
   System.out.print(num2 + num);
   
   System.out.println("whats ur fave food?");
   String food = sc.nextLine();
   System.out.println("your fave food is " + food);
	}
}