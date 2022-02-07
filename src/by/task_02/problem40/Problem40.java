package by.task_02.problem40;

import java.util.Scanner;

//Вычислить значение функции: F(x)={-x^3 + 9, если x <= 13; -(3 / x + 1), если x > 13;

public class Problem40 {

	public static void main(String[] args) {
		double x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = sc.nextDouble();

		if (x <= 13) {
			x = Math.pow(-x, 3) + 9;
			System.out.println("x = " + x);
		} else if (x > 13) {
			x = -(3 / (x + 1));
			System.out.println("x = " + x);
		} else {
			System.out.println("try again");
		}

	}

}
