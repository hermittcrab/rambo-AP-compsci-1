/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
    
    printAnimal();

    greeting("Matthew");
	}
	public static void greeting(String name){
	    System.out.println("Hello " + name);
	    
	    greeting("rambo");
	    
	     double newSalary = raise(1000000.62, 3);
	     System.out.println(newSalary);
	     
	     newSalary = raise(newSalary, 6);
	}
	
	public static void printAnimal(){
	    System.out.println(" >o) ");
	    System.out.println("(_> ");
	}
	
	public static double raise(double salary, int percent){
	    double amount =salary + (salary * (percent/100.0));
	    return amount;
	}
	
}