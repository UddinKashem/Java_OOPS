package numbers;

public class FindArmstrongNumber {
	
	/*
	 * A positive number is called Armstrong number if it is equal to the sum of cubes of its digits. 
	 * e.g. 0, 1, 153, 370, 371, 407 etc
	 */

	public static void armstrongNumber(int n){
		
		int c=0, a, temp;
		
		temp=n;
		
		while(n>0){
			
			a=n%10;
			n=n/10;
			
			c=c+(a*a*a);
			//System.out.println(c);
		}
		if(temp==c){
			System.out.println(temp+" is a Armstrong Number");
		}else
			System.out.println(temp+" is Not a Armstrong Number");
	}
	
	public static void main(String[] args) {
		
		int[] iArr = {1, 153, 134, 256, 371, 387, 407};
		
		//armstrongNumber(153);
		
		for(int i : iArr){
			armstrongNumber(i);
		}
		
		System.out.println("===========================");
		
		for( int j : iArr){
			findarmStrongNumber(j);
		}
	}

	public static void findarmStrongNumber(int n){
		
		int c=0, a, temp;
		
		temp = n;
		
		while(n>0){
			a=n%10;
			n=n/10;
			
			c = c + (a*a*a);
			//System.out.println(c);
		}
		
		if(temp==c){
			System.out.println(temp + " is a Armstrong Number.");
		}
		else
			System.out.println(temp + " is Not a Armstrong Number.");
		
	}
}
