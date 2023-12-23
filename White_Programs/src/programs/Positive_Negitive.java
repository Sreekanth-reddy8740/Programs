package programs;

import java.util.Scanner;

public class Positive_Negitive {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		if(n>=0)
			System.out.println("The given num is positive");
		else
			System.out.println("The given num is negitive");

	}

}
