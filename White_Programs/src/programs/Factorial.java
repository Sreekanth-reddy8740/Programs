package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int n = scn.nextInt();
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact*=i;
		}
		System.out.println("factorial of " +n + " is " + fact);
	}

}
