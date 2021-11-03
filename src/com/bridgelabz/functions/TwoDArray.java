package com.bridgelabz.functions;

import java.util.*;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the No.of columns:");
		int columns = sc.nextInt();
		int[][] twoDArray = new int[rows][columns];
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.println("Enter elements value for [" + i + "]" + "[" + j + "]");
				int ele = sc.nextInt();
				twoDArray[i][j] = ele;

			}
		}
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j] + "\t");
			}
			System.out.println();
		}


	}
}