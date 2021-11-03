package com.bridgelabz.functions;
import java.util.*;
public class WindChill {
	public static void main (String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature(Fahrenheit) greater than 50:");
		double t = sc.nextDouble();
		System.out.println("Enter the wind speed v (in miles per hour) greater than 120 and less than 3:");
		double v = sc.nextDouble();
		if (t > 50 && v > 120 || v < 3) {
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
			System.out.println("The effective temperature (the wind chill) to be:" + w);
		}else {
			System.out.println("Enter the values in valid Range");
		}


	}

}