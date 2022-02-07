package by.task_03.problem27;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры. */

public class Problem27 {

	public static void main(String[] args) {
		int m;
		int n;
		int i;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value m");
		m = sc.nextInt();
		System.out.println("Please, insert value n");
		n = sc.nextInt();

		while (m <= n) {
			for (i = 2; i < m; i++) {
				if (m % i == 0) {
					System.out.println("Divisor " + m + " - " + i);
				}

			}
			m++;
		}

	}
}
