package by.task_02.problem30;

import java.util.Scanner;

/* Даны действительные числа ABC. Удвоить эти числа если a>b>c, и заменить их абсолютными 
 * значениями, если это не так.*/

public class Problem30 {

	public static void main(String[] args) {
		double a, b, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextDouble();
		System.out.println("Please, insert value b");
		b = sc.nextDouble();
		System.out.println("Please, insert value c");
		c = sc.nextDouble();

		if (a > b & b > c) {
			a += a;
			b += b;
			c += c;
			System.out.println("a = " + a + " b = " + b + " c = " + c);
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("the absolute numbers = " + a + " " + b + " " + c);
		}

	}

}
