package programs;

import java.util.Scanner;

public class MagicNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Eneter a Number");
		int num = scn.nextInt();
		
		if(num<0) {
			System.out.println("negitive num");
		}
		else {
			int total=total(num);
			System.out.println("total= " +total);
			int rev=reverse(total);
			System.out.println("ReverseNum =" +rev);
			int result=total*rev;
			if(num==result)
				System.out.println("it is magic num");
			else
				System.out.println("it is not a magic num");
		}
	}

	private static int reverse(int num) {
		int sum=0;
		while(num!=0) {
			int dig=num%10;
			sum=(10*sum)+dig;
			num/=10;
		}
		return sum;
	}

	private static int total(int num) {
		int sum=0;
		while(num!=0) {
			int dig=num%10;
			sum+=dig;
			num/=10;
		}	
		return sum;
	}

}
