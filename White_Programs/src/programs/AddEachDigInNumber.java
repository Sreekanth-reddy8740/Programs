package programs;

import java.util.Scanner;

public class AddEachDigInNumber {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int temp=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		n=temp;
		System.out.println("sum of " + n + " is " + sum);

	}

}
