package com.bridgelabz.basic;
import java.util.*;

public class Powersof2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		double k = Math.pow(2, n);
		int a = (int) k;
		for (int i = 1;i <= a;i++) {
			for (int j = 1;j <= 10;j++) {
				double b = Math.pow(i, 2);
				int c = (int)b*j;
				System.out.println(b+ "x" +i+ "=" +c );

			}
		}

	}

}
