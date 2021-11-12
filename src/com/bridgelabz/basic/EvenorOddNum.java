package com.bridgelabz.basic;
import java.util.*;

public class EvenorOddNum {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = sc.nextInt();
		if (n%2 == 1) {
			System.out.println("Entered Number is a odd Number");
		}
		else if (n%2 == 0) {
			System.out.println("Entered Number is a even Number");
		}else {
			System.out.println("Enter a proper Number");
		}

	}

}