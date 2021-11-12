package com.bridgelabz.basic;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter the year(yyyy):");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n%4 == 0 && n%100 != 0) {
			System.out.println(n+ "is a leap year");
		}
		else if (n%4 == 0 && n%100 == 0 && n%400 == 0){
			System.out.println(n+ "is a leap year");	
		}
		else if (n%4 == 0 && n%400 == 0 && n%100 == 0) {
			System.out.println(n+ "is a leap year");
		}
		else {
			System.out.println(n+ "is not a leap year");
		}
	}

}