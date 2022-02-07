package by.task_02.problem38;

import java.util.Scanner;

//Вычислить значение функции: f(x){x^2 если 0 <= x <= 3; 4 если x > 3 или x < 0;

public class Problem38 {

	public static void main(String[] args) {
		double x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = sc.nextDouble();

		if (0 <= x & x <= 3) {
			x = Math.pow(x, 2);
			System.out.println("x = " + x);
		} else if (x > 3 | x < 0) {
			x = 4;
			System.out.println("x = " + x);
		} else {
			System.out.println("try again");
		}

	}

}
