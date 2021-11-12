package com.bridgelabz.basic;
import java.util.*;
public class HarmonicNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Harmonic Number:");
		n = sc.nextInt();
		int output = 1;
		for (int j = 2;j <= n;j++) {
			output = output+1/j;
		}
		System.out.println("Harmonic Number is:" +output);
	}

}