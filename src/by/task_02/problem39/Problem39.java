package by.task_02.problem39;

import java.util.Scanner;

//Найти значение функции: f(x){-x^2 + x - 9; если x >= 8; 1 / (x^4 - 6) если x < 8;

public class Problem39 {

	public static void main(String[] args) {
		double x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value x");
		x = sc.nextDouble();

		if (x >= 8) {
			x = -x * -x + x - 9;
			System.out.println("x = " + x);
		} else if (x < 8) {
			x = 1 / (Math.pow(x, 4) - 6);
			System.out.println("x = " + x);
		} else {
			System.out.println("try again");
		}
	}

}
