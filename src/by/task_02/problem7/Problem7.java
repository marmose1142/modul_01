package by.task_02.problem7;

import java.util.Scanner;

//Составить программу нахождения модуля выражения a * x * x + b * x + c.

public class Problem7 {

	public static void main(String[] args) {
		int a, b, c, x, mod;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();
		System.out.println("Please, insert value c");
		c = sc.nextInt();
		System.out.println("Please, insert value x");
		x = sc.nextInt();

		mod = a * x * x + b * x + c;

		if (mod >= 0) {
			System.out.println("module = " + mod);
		} else {
			System.out.println("module = " + Math.abs(mod));
		}

	}

}
