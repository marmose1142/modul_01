package by.task_03.problem25;

import java.util.Scanner;

//Требуется определить факториал числа, которое ввел пользователь.

public class Problem25 {

	public static void main(String[] args) {
		int n;
		int i = 1;
		long fact = 1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextInt();

		while (i <= n) {
			fact = fact * i;
			i++;

		}
		System.out.println("factorial = " + fact);

	}
}
