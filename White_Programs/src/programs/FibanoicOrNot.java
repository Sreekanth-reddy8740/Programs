package programs;

import java.util.Scanner;

public class FibanoicOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int a=0,b=1,c=0;
		
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
		}
		if(c==n)
			System.out.println(n +" is fibanoic");
		else
			System.out.println(n +" is not a fibanoic");
	}

}
