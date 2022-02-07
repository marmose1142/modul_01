package by.task_02.problem4;

import java.util.Scanner;

//Cоставить программу сравнения двух чисел A и B.

public class Problem4 {

	public static void main(String[] args) {
		int a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextInt();
		System.out.println("Please, insert value b");
		b = sc.nextInt();

		if (a < b) {
			System.out.println("a < b");
		} else if (a == b) {
			System.out.println("a aquals b");
		} else {
			System.out.println("a > b");
		}

	}
}
