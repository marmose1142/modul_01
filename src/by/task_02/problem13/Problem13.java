package by.task_02.problem13;

import java.util.Scanner;

/*Даны две точки А(x1,y1) и В(x2,y2).Составить алгоритм, определяющий, которая из 
 *точек находится ближе к началу координат.*/

public class Problem13 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x1(point a)");
		x1 = sc.nextDouble();
		System.out.println("Please, insert value x2(point a)");
		x2 = sc.nextDouble();
		System.out.println("Please, insert value y1(point b)");
		y1 = sc.nextDouble();
		System.out.println("Please, insert value y2(point b)");
		y2 = sc.nextDouble();

		a = Math.sqrt(x1 * x1 + y1 * y1);
		System.out.println(a);
		b = Math.sqrt(x2 * x2 + y2 * y2);
		System.out.println(b);

		if (a < b) {
			System.out.println("point A is closer");
		} else {
			System.out.println("point B is closer");
		}

	}

}
