package programs;

import java.util.Scanner;

public class NumberOfDaysInaMonth {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a year");
		int y = scn.nextInt();
		System.out.println("Enter a month");
		int m = scn.nextInt();
		
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
			System.out.println("31 days");
		else if (m==4||m==6||m==9||m==11) {
			System.out.println("30 days");
		}
		else if (m==2) {
			if((y%400==0) || (y%100!=0 && y%4==0)) {
				System.out.println("29 days");
			}else {
				System.out.println("28 days");
			}
		}
		else
			System.out.println("invalide month");
	}

}
