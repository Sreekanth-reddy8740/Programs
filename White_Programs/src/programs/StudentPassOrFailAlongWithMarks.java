package programs;

import java.util.Scanner;

public class StudentPassOrFailAlongWithMarks {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter student name");
		String name = scn.nextLine();
		System.out.println("Enter student marks");
		int m1 = scn.nextInt();
		int m2 = scn.nextInt();
		int m3 = scn.nextInt();
		int m4 = scn.nextInt();
		int m5 = scn.nextInt();
		int m6 = scn.nextInt();
		float avg=1;
		if(m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35 && m6>=35) {
			System.out.println("pass");
			int total=m1+m2+m3+m4+m5+m6;
			System.out.println("total = " + total);
			avg=total/6;
			System.out.println("average = " + avg);
		}else {
			System.out.println("fail");
		}
		if(avg>=85)
			System.out.println("A+ Grade");
		else if (avg >=70 && avg < 85)
			System.out.println("A Grade");
		else if (avg >=50 && avg <70)
			System.out.println("B Grade");
		else if (avg >=35 && avg <50)
			System.out.println("c Grade");
		else
			System.out.println("fail");
			
	}
	
}
