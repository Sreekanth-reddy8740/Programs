package programs;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		int temp=n;
		int sum=0;
		while(n>0)						// 145 = 1!+4!+5! = 145
		{
			int fact=1;
			int dig=n%10;
			for(int i=1;i<=dig;i++) {
				fact*=i;
			}
			sum+=fact;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("it is special num");
		else
			System.out.println("it is not special num");

	}

}
