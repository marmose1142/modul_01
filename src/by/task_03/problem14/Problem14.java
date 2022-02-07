package by.task_03.problem14;

import java.util.Scanner;

//Дано натуральное число n.Вычислить 1+1/2+1/3+1/4...1/n

public class Problem14 {

	public static void main(String[] args) {
		double n, x = 1, i = 2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, insert value n");
		n = sc.nextDouble();

		while (i <= n) {
			x = x + 1 / i;
			System.out.println("x = " + x);
			i++;

		}

	}

}
