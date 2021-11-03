package com.bridgelabz.basic;
import java.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		int n;
		float tailCount = 0, headCount = 0;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			double toss = Math.floor(Math.random()*10)/10;
			System.out.println("Toss value is:" +toss);
			if (toss < 0.5) {
				tailCount++;
				System.out.println("Toss is:" +"tails");
			}
			else {
				headCount++;
				System.out.println("Toss is:" +"Head");
			}
		}
		float tailPercentage = (float)((tailCount/n)*100);
		float headPercentage = (float)((headCount/n)*100);
		System.out.println("Percentage of Tails is:" +tailPercentage);
		System.out.println("Percentage of Head is:" +headPercentage);

	}

}