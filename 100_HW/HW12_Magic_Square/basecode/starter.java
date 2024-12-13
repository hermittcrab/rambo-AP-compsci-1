import pkg.*;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
	//	System.out.println(CVMath.findMid(2,3,1));
	CVMath a = new CVMath();
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check if it is a special square: "); 
	int check = sc.nextInt();
			
//	a.isPerfect(check);
//	a.isSum(check);
	
	if(a.isPerfect(check) && a.isSum(check)){
		System.out.println(check + " is a special square");
	}
	}
	
}

