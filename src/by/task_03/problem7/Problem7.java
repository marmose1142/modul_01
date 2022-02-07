package by.task_03.problem7;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [a,b] c шагом h:
 * y = {x, x > 2;-x, x <= 2;*/

public class Problem7 {

	public static void main(String[] args) {
		double a, b, h, x, y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value A(A < B)");
		a = sc.nextDouble();
		System.out.println("Please, insert value B(A < B)");
		b = sc.nextDouble();
		System.out.println("Please, insert value H");
		h = sc.nextDouble();

		x = a;
		while (x <= b) {
			if (x > 2) {
				y = x;
				System.out.println("y = " + y);

			} else {
				y = -x;
				System.out.println("y = " + y);

			}
			x = x + h;

		}

	}
}
