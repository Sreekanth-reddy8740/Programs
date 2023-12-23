package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int sum=0;
//		for(int i=10;i<=100;i=i+10) {
//			sum=sum+i;
//		}
//		System.out.println("sum = " + sum);
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter how many Digits"); // 1+2+,,,,+10=55
		int n = scn.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum = " + sum);
		
		
	}

}
