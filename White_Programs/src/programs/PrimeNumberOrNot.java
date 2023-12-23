package programs;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		boolean flag=true;
		
		 if(n<=1) {
			 System.out.println( n + " is not a prime number");
			 return;
		 }
		 
		 for(int i=2;i<=n/2;i++) {
			 if(n%2==0) {
				 flag=false;
				 System.out.println( n +" is not a prime number");
				 break;
			 }
		 }
		 if(flag) {
			 System.out.println( n +" is a prime number");
		 }
		
	}

}
