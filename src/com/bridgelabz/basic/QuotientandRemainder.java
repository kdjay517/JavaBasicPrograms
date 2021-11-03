package com.bridgelabz.basic;
import java.util.*;

public class QuotientandRemainder {

	public static void main(String[] args) {
		float n,div;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextFloat();
		System.out.println("Enter divisor Number:");
		div = sc.nextFloat();
		float quo = n/div;
		float rem = n%div;
		System.out.println("Remainder of a Number" + n + "is:" + rem);
		System.out.println("Quotient of a Number" + n + "is:" +quo);
	}

}