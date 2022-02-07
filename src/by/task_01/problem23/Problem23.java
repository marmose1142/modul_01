package by.task_01.problem23;

import java.util.Scanner;

/*Вычислить корни квадратного уравнения ax(2) + bx + c = 0; c заданными коэффициентами
a,b,c.Предполагается , что a не равно 0 и, что дискриминант уравнения неотрицателен.*/

public class Problem23 {

	public static void main(String[] args) {
		double a, b, c, x1, x2, d;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,insert value a");
		a = sc.nextDouble();
		System.out.println("Please,insert value b");
		b = sc.nextDouble();
		System.out.println("Please,insert value c");
		c = sc.nextDouble();

		d = b * b - 4 * a * c;

		if (d > 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("Roots = " + x1 + " " + x2);
		} else if (d == 0) {
			x1 = -b / (2 * a);
			System.out.println("Roots = " + x1);
		} else {
			System.out.println("no roots");
		}
	}

}
