package com.bridgelabz.functions;

import java.util.*;

public class Sumof3NumZero {
	public static int findDistinctTriplets(int b[], int length)// method 1
	{
		System.out.println();
		int i, j, k, count = 0;
		for (i = 0; i < length; i++) {
			for (j = i + 1; j < length; j++) {
				for (k = j + 1; k < length; k++) {
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (b[i] + b[j] + b[k] == 0) {
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		// return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
	}

	public static void main(String[] args) {
		Scanner u1 = new Scanner(System.in);
		System.out.println();

		// enter the array size
		System.out.print("Enter Size of Array :");
		int size = u1.nextInt();
		int arr[] = new int[size];// create array & read values one by one

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Value :");
			arr[i] = u1.nextInt();
		}

		Sumof3NumZero t1 = new Sumof3NumZero();
		int sum = t1.findDistinctTriplets(arr, size);// pass the arguments to method 1
		System.out.println("No.of Tripltes :" + sum);
		System.out.println();
	}
}
