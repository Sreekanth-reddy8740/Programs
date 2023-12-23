package programs;

import java.util.Scanner;

public class AutoMarphicNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Eneter a Number");
		int num = scn.nextInt();
	
		if(num<0) {
			System.out.println("Num Negitive");
		}
		else {
			int length=0;
			int temp=num;
			int sqrnum=power(num,2);
			while(temp!=0) {
				length++;
				temp=num/10;
			}
				int result=sqrnum%power(10,length);
				if(result==num)
					System.out.println("is automorphic");
				else
					System.out.println("is not automorphic");
			}
			
		}
	
	public static int power(int base,int exp) {
		int fact=1;
		for(int i=1;i<=exp;i++) {
			fact*=base;
		}
		return fact;
	}
}
