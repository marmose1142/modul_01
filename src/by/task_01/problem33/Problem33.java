package by.task_01.problem33;

import java.util.Scanner;

/*Даны натуральные числа М и N , вывести старшую цифру дробной части и
младшую цифру целой части числа M/N*/

public class Problem33 {

	public static void main(String[] args) {
		double m, n, mn;
		int x, y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value m");
		m = sc.nextDouble();
		System.out.println("Please, insert value n");
		n = sc.nextDouble();

		mn = m / n;
		System.out.println(mn);
		x = (int) (10 * mn) % 10;
		System.out.println("Older number = " + x);
		y = (int) mn % 10;
		System.out.println("Younger number = " + y);

	}

}
