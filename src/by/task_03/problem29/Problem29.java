package by.task_03.problem29;

import java.util.Scanner;

//Даны два числа.Определить цифры входящие в запись как первого так и второго числа.

public class Problem29 {

	public static void main(String[] args) {
		long a;
		long b;
		long supportiveA;
		long supportiveB;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value a");
		a = sc.nextLong();
		System.out.println("Please, insert value b");
		b = sc.nextLong();

		while (a > 0) {
			supportiveA = a % 10;
			a = a / 10;
			supportiveB = b;
			while (supportiveB > 0) {
				if (supportiveA == supportiveB % 10) {
					System.out.println(supportiveA);

				}
				supportiveB = supportiveB / 10;

			}

		}

	}

}
