package programs;

import java.util.Scanner;

public class FibnoicInBetween {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Lower Limit");
		int l = scn.nextInt();
		System.out.println("Enter Upper Limit");
		int u = scn.nextInt();
		
		int a=0,b=1,c=0;
		
		while(true) {
			if(a>=u)break;
			if(a>=l) {
				System.out.println(a);
				c=a+b;
				a=b;
				b=c;
			}
		}
		
	}

}
