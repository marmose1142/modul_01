package by.task_01.problem27;

import java.util.Scanner;

//Найти (в радианах, в градусах) все углы треугольника со сторонами abc.

public class Problem27 {

	public static void main(String[] args) {
		double a, b, c, x1, x2, x3, y1, y2, y3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = Math.toRadians(sc.nextDouble());
		System.out.println("Please, insert value b");
		b = Math.toRadians(sc.nextDouble());
		System.out.println("Please, insert value c");
		c = Math.toRadians(sc.nextDouble());

		x1 = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		x2 = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		x3 = Math.toRadians(180) - (x1 + x2);
		System.out.println("angles in radians = " + x1 + " " + x2 + " " + x3);
		y1 = Math.toDegrees(x1);
		y2 = Math.toDegrees(x2);
		y3 = 180 - (y1 + y2);
		System.out.println("angles in degrees = " + y1 + " " + y2 + " " + y3);

	}

}
