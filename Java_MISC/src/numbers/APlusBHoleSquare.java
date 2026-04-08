package numbers;

import java.util.Scanner;

public class APlusBHoleSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the value for A: "+sc.next());
		int a=Integer.valueOf(sc.next());
		
		//System.out.println("Enter the value for B: "+sc.next());
		int b= Integer.valueOf(sc.next());
		
		System.out.println("(A+B)2= "+calulateFunc(a,b));

	}
	
	public static int calulateFunc(int a, int b){
		
		int result;
		
		result= a*a + 2*a*b + b*b;
		
		return result;
		
	}

}
