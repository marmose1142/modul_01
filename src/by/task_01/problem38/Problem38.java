package by.task_01.problem38;

import java.util.Scanner;

//Дано значение х, получить значение -2х + 3х^2 - 4x^3 и 1 + 2x + 3x^2 + 4x^3.

public class Problem38 {

	public static void main(String[] args) {

		int x, sum1, sum2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x ");
		x = sc.nextInt();
		sum1 = x * ((-x) * (4 * x - 3) - 2);
		System.out.println("sum one = " + sum1);
		sum2 = (((4 * x + 3) * x + 2) * x + 1);
		System.out.println("sum2 = " + sum2);
	}
}
