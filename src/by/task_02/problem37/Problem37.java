package by.task_02.problem37;

import java.util.Scanner;

//Вычислить значение функции:f(x){-x^2 + 3x + 9; если x >= 3; 1 / (x^2 - 6); если x < 3;

public class Problem37 {

	public static void main(String[] args) {
		double x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = sc.nextDouble();

		if (x >= 3) {
			x = -x * -x + 3 * x + 9;
			System.out.println("x = " + x);
		} else if (x < 3) {
			x = 1 / (x * x - 6);
			System.out.println("x = " + x);
		} else {
			System.out.println("try again");
		}

	}

}
