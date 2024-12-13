package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	//returns true if value is Perfect square
	public static boolean isPerfect(int num){
int z = 0;
	for(int i = 0; i < num; i++){
		if(num / i == i){
			z = 1;
		}
		
	}
	return(z>0);	
	}
	
	public static boolean isSum(int x){
	int total = 0;
	int v = 0;
		for(int i = 1; i < x; i++){
			total = i + total; 
			
			if(total == x)
				v = 1;
		}
		return(v>0);
	}


	
}
