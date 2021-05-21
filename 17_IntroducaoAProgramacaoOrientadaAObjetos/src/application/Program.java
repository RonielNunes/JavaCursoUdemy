package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// Solution without using classes
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// double xA, xB, xC, yA, yB, yC; sem classe
		Triangle x, y;// com classe
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextInt();// com classe //xA = sc.nextInt();sem classe
		x.b = sc.nextInt();// com classe //xB = sc.nextInt();sem classe
		x.c = sc.nextInt();// com classe //xC = sc.nextInt();sem classe
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextInt();// yA = sc.nextInt();
		y.b = sc.nextInt();// yB = sc.nextInt();
		y.c = sc.nextInt();// yC = sc.nextInt();

		double areaX = x.area();
		double areaY = y.area();
		//double p = (x.a + x.b + x.c) / 2.0; // double p = (xA + xB + xC) / 2.0;
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c)); // double areaX = Math.sqrt(p * (p - xA) * (p -
																			// xB) * (p - xC));

		//p = (y.a + y.b + y.c) / 2.0;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		//System.out.printf("Triangle X area: %.4f%n", areaX);
		//System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			//System.out.println("Larger area: Y");
		}

	}

}
