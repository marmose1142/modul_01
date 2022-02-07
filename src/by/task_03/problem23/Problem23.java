package by.task_03.problem23;

import java.util.Scanner;

/*Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. 
 * Результат предоставить в виде таблицы, первый столбец которой-значение аргумента, 
 * второй-соответствующее значение функции: F(x) = ctg(x / 3) + 1 / 2 * sin(x) */

public class Problem23 {

	public static void main(String[] args) {
		double x;
		double a;
		double b;
		double h;
		double y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextDouble();
		System.out.println("Please, insert value b");
		b = sc.nextDouble();
		System.out.println("Please, insert value h");
		h = sc.nextDouble();

		x = a;
		System.out.println(" x " + " | " + " y ");

		while (x <= b) {

			y = 1 / Math.tan(x / 3) + 1.0 / 2 * Math.sin(x);
			System.out.println("----------------------");
			System.out.println(x + " | " + y);
			x = x + h;

		}

	}

}
