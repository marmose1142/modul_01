package by.task_01.problem24;

import java.util.Scanner;

/*Найти площадь треугольника, две стороны которого равны а и b ,а угол между этими
сторонами y. */

public class Problem24 {

	public static void main(String[] args) {
		double a, b, y, r, s;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,insert value a");
		a = sc.nextDouble();
		System.out.println("Please,insert value b");
		b = sc.nextDouble();
		System.out.println("Please,insert value y");
		y = sc.nextDouble();

		r = Math.toRadians(y);
		s = 0.5 * a * b * Math.sin(r);

		System.out.println("Area of triangle = " + s);

	}

}
