package programs;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		if(n%2==0)
			System.out.println("The given number is Even");
		else
			System.out.println("The given number is Odd");
	
	}

}
