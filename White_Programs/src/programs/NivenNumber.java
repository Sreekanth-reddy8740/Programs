package programs;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Eneter a Number");
		int num = scn.nextInt();
		
		int temp=num;
		int sum=0;
		if(num<0) {
			System.out.println("negitive num");
		}
		else {
			while(num>0) {
				int dig=num%10;
				sum+=dig;
				num/=10;
			}
			if(temp%sum==0)
				System.out.println("is Niven num");
			else
				System.out.println("is not a Niven Num");
		}

	}

}
