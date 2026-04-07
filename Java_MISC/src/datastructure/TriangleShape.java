package datastructure;

public class TriangleShape {

	public static void main(String[] args) {
		
		int n = 9, i, j, k;

		//Left Top Triangle:
		System.out.println("===================");
		System.out.println("Left Top Triangle:");
		System.out.println("===================");
		for(i=n; i>=1; i--){
			for(j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Left Bottom Triangle:
		System.out.println("=======================");
		System.out.println("Left Bottom Triangle:");	
		System.out.println("=======================");
		for( i=1; i<=n; i++){
			for( j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();	
		}
		//Right Top Triangle:
		System.out.println("========================");
		System.out.println("Right Top Triangle:");	
		System.out.println("========================");
		for( i=n; i>=1; i--){
//			for( j=n-1; j>=i; j--){
//				System.out.print(" ");
//			}
			for( k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();	
		}
		//Right Bottom Triangle:
		System.out.println("========================");
		System.out.println("Right Bottom Triangle:");	
		System.out.println("========================");
		for( i=1; i<=n; i++){
//			for( j=n-1; j>=i; j--){
//				System.out.print(" ");
//			}
			for( k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();	
		}
		//Center Top Triangle:
		System.out.println("========================");
		System.out.println("Center Top Triangle:");	
		System.out.println("========================");
		for( i=n; i>=1; i--){
			for( j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			for( j=1; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();	
		}
		
		//Center Bottom Triangle:
		System.out.println("========================");
		System.out.println("Center Bottom Triangle:");	
		System.out.println("========================");
		for( i=1; i<=n; i++){
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
