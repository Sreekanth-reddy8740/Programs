package programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scn.nextInt();
		
		if(year%400==0 || (year%100 !=0 && year%4==0))
			System.out.println(year + " is leapyear");
		else
			System.out.println(year + " is not a leapyear");
			
	}

}
