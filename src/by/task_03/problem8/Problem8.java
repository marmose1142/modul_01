package by.task_03.problem8;

import java.util.Scanner;

/*Вычислить значения функции на отрезке [a,b] с шагом h:
 * y = {(x + c) * 2, x = 15; (x - c) + 6, x != 15;*/

public class Problem8 {

	public static void main(String[] args) {
		double a, b, h, x, y, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value A(A < B)");
		a = sc.nextDouble();
		System.out.println("Please, insert value B(A < B)");
		b = sc.nextDouble();
		System.out.println("Please, insert value C");
		c = sc.nextDouble();
		System.out.println("Please, insert value H");
		h = sc.nextDouble();

		x = a;
		while (x <= b) {
			if (x == 15) {
				y = (x + c) * 2;
				System.out.println("y = " + y);
			} else {
				y = (x - c) + 6;
				System.out.println("y = " + y);
			}
			x = x + h;
		}

	}

}
