package programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%2==0) {
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println(n +" is perfect number");
		else
			System.out.println(n +" is not a perfect number"); 
		
	}
	
}
