package datastructure;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []s = new int[n];
		
		int count = 0;
		for(int i=0;i<n;i++){
			s[i] = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++){
			int sum = 0;
			for(int j=i;j<n;j++){
				sum+=s[j];
				if(sum<0){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
