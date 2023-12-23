package programs;

import java.util.Scanner;

public class Fibanoic {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int a=0,b=1,c=0;
		
		for(int i=0;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
