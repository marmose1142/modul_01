package by.task_02.problem11;

import java.util.Scanner;

//Составить программу которая определит, площадь какого треугольника больше.

public class Problem11 {

	public static void main(String[] args) {
		double a, b, c, a2, b2, c2, p, p2, s, s2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,insert the value of side a in the first triangle");
		a = sc.nextDouble();
		System.out.println("Please,insert the value of side b in the first triangle");
		b = sc.nextDouble();
		System.out.println("Please,insert the value of side c in the first triangle");
		c = sc.nextDouble();
		System.out.println("Please,insert the value of side a in the second treangle");
		a2 = sc.nextDouble();
		System.out.println("Please,insert the value of side b in the second treangle");
		b2 = sc.nextDouble();
		System.out.println("Please,insert the value of side c in the second treangle");
		c2 = sc.nextDouble();

		p = 0.5 * (a + b + c);
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		p2 = 0.5 * (a2 + b2 + c2);
		s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

		if (s > s2) {
			System.out.println("the area of ​​the first triangle is greater than the second");
		} else if (s2 > s) {
			System.out.println("the area of ​​the second triangle is greater than the first");
		} else {
			System.out.println("triangles are equal");
		}
	}
}