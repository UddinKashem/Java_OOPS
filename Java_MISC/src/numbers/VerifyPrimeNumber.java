package numbers;

public class VerifyPrimeNumber {

	public static void main(String[] args) {
		int n= 101;
		int count = 0;
		System.out.print("Prime number in the range: ");
		for(int i =1; i<=n; i++){
		//System.out.println(i+ " is PrimeNumber?: "+isPrimeNumber(i));
			if(isPrimeNumber(i)){
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.println("\nTotal Prime Number in the range: [1 to 101] : " + count);

	}
	
	public static boolean isPrimeNumber(int n){
		
		boolean b = true;
		
		if(n<=1){
			b = false;
		}
		for(int i=2; i <= n/2; i++){
			if(n%i == 0){
				b = false;
			}
		}
				
		return b;
	}

}
