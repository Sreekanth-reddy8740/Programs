package programs;

import java.util.Scanner;

public class GCDOrHCF {

	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		System.out.println("Eneter first Number");
//		int num1 = scn.nextInt();
//		System.out.println("Eneter Second Number");
//		int num2 = scn.nextInt();
		
		int num1=3,num2=7;
		
		int gcd=findGcd(num1,num2);

		System.out.println(gcd);
	}

	private static int findGcd(int a, int b) {
		while(b!=0) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}

}
