package datastructure;

public class DiamondShape {

	public static void main(String[] args) {
		
		int n=9, i, j, k;
		
		for( i=1; i<=n; i++){
			for( j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			for( j=1; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();	
		}
		for(i=1;i<=n+1; i++){
			System.out.print("* ");
		}
		System.out.println();
		for( i=n; i>=1; i--){
			for( j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			for( j=1; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();	
		}

	}

}
