package com.bridgelabz.basic;
import java.util.*;

public class FactorsOfaNumber {

	public static int fact = 1;
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n == 0 || n == 1) {
			System.out.println("Factorial of " + n +  " is:" +1);
		}
		else {
			for (int i=1;i<=n;i++) {
				  fact = fact*i;

		}
		// TODO Auto-generated method stub
		System.out.println("Factorial of number " + n + " is:" +fact);
	}

}

}