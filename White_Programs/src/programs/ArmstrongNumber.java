package programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int temp=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		System.out.println("length = " +count);
		
		n=temp;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int product=1;
			for(int i=1;i<=count;i++) {
				product*=digit;
			}
			sum+=product;
			n/=10;
		}
		if(temp==sum)
			System.out.println(temp +" is Armstrong number");
		else
			System.out.println(temp +" is not a Armstrong number");
			
	}
	
}