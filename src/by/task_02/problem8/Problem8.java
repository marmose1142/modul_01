package by.task_02.problem8;

import java.util.Scanner;

//Составить программу нахождения наименьшего из квадратов двух чисел A и B.

public class Problem8 {

	public static void main(String[] args) {
		double a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = Math.sqrt(sc.nextDouble());
		System.out.println("Please, insert value b");
		b = Math.sqrt(sc.nextDouble());

		if (a < b) {
			System.out.println(a);
		} else if (b < a) {
			System.out.println(b);
		} else {
			System.out.println("quadratic root a aquals quadratic root b");
		}

	}

}
