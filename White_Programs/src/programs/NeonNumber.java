package programs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int sum=0;
		int temp=n;
		int num=n*n;
		
		while(num!=0) {
			int dig=num%10;
			sum+=dig;
			num/=10;
		}
		if(sum==temp)
			System.out.println("it is neon num");
		else
			System.out.println("it is not neon num");

	}

}
